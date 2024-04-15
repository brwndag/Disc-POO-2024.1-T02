package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
float salcarlos, saljoao;
int meses;

System.out.println("Qual o salário de Carlos?");
salcarlos = sc.nextFloat();

saljoao = salcarlos/3;
meses = 0;

while(saljoao < salcarlos) {
	salcarlos = salcarlos + (salcarlos * 2 / 100);
	saljoao = saljoao + (saljoao * 5 / 100);
	meses = meses +1;
}

System.out.println("O número de meses necessários para que o valor pertencente a João se iguale ou ultrapasse o valor pertenecente a Carlos será de: " + meses + " meses");

sc.close();

	}
}
