package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
float altura;
float peso;

System.out.println("Digite sua altura:");
altura = sc.nextFloat();
System.out.println("Digite seu peso:");
peso = sc.nextFloat();

if (altura < 1.20) {
	if (peso <= 60) {
		System.out.println("Sua classificação é A.");
	}
	else if (peso > 60 && peso <= 90) {
		System.out.println("Sua classificação é D.");
	}
	else {
		System.out.println("Sua classificação é G.");
	}
}
else if (altura >= 1.20 && altura <= 1.70) {
	if (peso <= 60) {
		System.out.println("Sua classificação é B.");
	}
	else if (peso > 60 && peso <= 90) {
		System.out.println("Sua classificação é E.");
	}
	else {
		System.out.println("Sua classificação é H.");
	}
}
else {
	if (peso <= 60) {
		System.out.println("Sua classificação é C.");
	}
	else if (peso > 60 && peso <= 90) {
		System.out.println("Sua classificação é F.");
	}
	else {
		System.out.println("Sua classificação é I.");
	}
}

sc.close();
	}
}
