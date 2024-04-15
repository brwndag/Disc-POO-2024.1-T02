package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
int tipoinvest;
float valorinvest;
float valorcorrigido;

System.out.println("Qual tipo de investimento será efetuado? Digite 1 para Poupança ou 2 para Fundos de Renda Fixa");
tipoinvest = sc.nextInt();
System.out.println("Qual o valor a ser investido?");
valorinvest = sc.nextFloat();

if (tipoinvest == 1) {
	valorcorrigido = (float) (valorinvest + 0.03 * valorinvest);
}
else {
	valorcorrigido = (float) (valorinvest + 0.04 * valorinvest);
}
System.out.println("O valor corrigido após um mês de investimento será de: R$" + valorcorrigido);

sc.close();
	}
}
