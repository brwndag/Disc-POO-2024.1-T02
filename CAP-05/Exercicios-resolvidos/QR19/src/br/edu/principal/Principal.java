package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
int m,n,soma,i;

System.out.println("Digite um valor m que seja inteiro e postivo:");
m = sc.nextInt();
System.out.println("Digite um valor n que seja inteiro e positivo:");
n = sc.nextInt();

while(m < n) {
	soma = 0;
	
	for (i = 0; i <= n; i++) {
		soma = soma + i;
	}
	
	System.out.println("A soma de todos os números inteiros entre m e n é: " + soma);
	System.out.println("Digite um valor m que seja inteiro e postivo:");
	m = sc.nextInt();
	System.out.println("Digite um valor n que seja inteiro e positivo:");
	n = sc.nextInt();
}
	}
}
