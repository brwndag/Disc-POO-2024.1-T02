package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
double a;
double b;
double c;
double delta;
double x1;
double x2;

System.out.println("Digite o valor de a:");
a = sc.nextDouble();
System.out.println("Digite o valor de b:");
b = sc.nextDouble();
System.out.println("Digite o valor de c:");
c = sc.nextDouble();

if (a == 0) {
	System.out.println("Estes valores não formam uma equação de 2º grau.");
}
else {
	delta = (b * b) - (4 * a * c);
	if (delta < 0) {
		System.out.println("A equação não possui raízes reais.");
	}
	else if (delta == 0) {
		System.out.println("A equação possui uma raíz real.");
		x1 = (-b) / (2 * a);
		System.out.println("O valor da raíz é: " + x1);
	}
	else {
		System.out.println("A equação possui duas raízes reais.");
		x1 = (- b + Math.sqrt(delta)) / ( 2 * a);
		x2 = (- b - Math.sqrt(delta)) / ( 2 * a);
		System.out.println("O valor da primeira raíz é: " + x1);
		System.out.println("O valor da segunda raíz é: " + x2);
	}
}

sc.close();	
	}
}
