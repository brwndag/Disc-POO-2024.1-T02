package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
float base, altura, area;

do {
	System.out.println("Qual a base do triângulo?");
	base = sc.nextFloat();
}while (base <= 0);

do {
	System.out.println("Qual a altura do triângulo?");
	altura = sc.nextFloat();
}while (altura <= 0);

area = (base * altura) /2;

System.out.println("A área do triângulo é: " + area);

sc.close();
	}
	
}
