package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
float X;
float Y;
float Z;

System.out.println("Digite o comprimento do primeiro lado:");
X = sc.nextFloat();
System.out.println("Digite o comprimento do segundo lado:");
Y = sc.nextFloat();
System.out.println("Digite o comprimento do terceiro lado:");
Z = sc.nextFloat();

if (X < Y + Z && Y < X + Z && Z < X + Y) {
	if (X == Y && Y == Z) {
		System.out.println("É um triângulo equilátero.");
	}
	else if (X == Y || X == Z || Y == Z) {
		System.out.println("É um triângulo isóceles.");
	}
	else {
		System.out.println("É um triângulo escaleno.");
	}
}
else {
	System.out.println("Os lados não formam um triângulo.");
}

sc.close();
	}
}
