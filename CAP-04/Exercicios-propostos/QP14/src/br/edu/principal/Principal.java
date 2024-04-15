package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	
System.out.println("Em que ano você nasceu?");
int anonascimento = sc.nextInt();
System.out.println("Qual o ano atual?");
int anoatual = sc.nextInt();

int idadeanos = (anoatual - anonascimento);
int idademeses = (idadeanos * 12);
int idadedias = (idadeanos * 365);
int idadesemanas = idadeanos * (365/7);

System.out.println("A sua idade em anos é: " + idadeanos);
System.out.println("A sua idade em meses é: " + idademeses);
System.out.println("A sua idade em dias é: " + idadedias);
System.out.println("A sua idade em semanas é: " + idadesemanas);

sc.close();
	}
}
