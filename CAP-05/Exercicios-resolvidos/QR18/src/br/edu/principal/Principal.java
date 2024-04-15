package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat comma = new DecimalFormat("0.00");

double num, quadrado, cubo, raiz;

System.out.println("Potenciação e raíz");

while(true) {
	System.out.println("Digite um valor (caso deseje finalizar o programa, digite 0 ou algum número negativo).");
	num = sc.nextFloat();
	
	if (num <= 0) {
		System.out.println("O programa foi finalizado.");
		break;
	}
	
	quadrado = num * num;
	cubo = num * num * num;
	raiz = Math.sqrt(num);
	
	System.out.println("O quadrado, cubo e raiz de "+ comma.format(num)+" são, respectivamente: "+comma.format(quadrado)+" "+comma.format(cubo)+" "+comma.format(raiz));
}

sc.close();
	}
}
