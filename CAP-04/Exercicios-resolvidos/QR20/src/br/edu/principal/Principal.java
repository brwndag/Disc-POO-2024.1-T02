package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
int codprod;
float pesokg;
int codpais;
float pesog;
float precototal;
float imposto;
float valortotal;
float precograma;

System.out.println("Digite o código do produto comprado (1 - 10)");
codprod = sc.nextInt();
System.out.println("Qual o peso do produto em quilogramas?");
pesokg = sc.nextFloat();
System.out.println("Digite o código do país (1 - 3)");
codpais = sc.nextInt();

pesog = pesokg * 1000;

System.out.println("O peso em gramas é de " + pesog + " gramas.");

if (codprod >= 1 && codprod <= 4 ) {
	precograma = 10;
}
else if (codprod >=5 && codprod <= 7) {
	precograma = 25;
}
else {
	precograma = 35;
}

precototal = pesog * precograma;

System.out.println("O preço total é de: R$" + precototal);

if (codpais == 1) {
	imposto = 0;
}
else if (codpais == 2) {
	imposto = precototal * 15/100;
}
else {
	imposto = precototal * 25/100;
}
System.out.println("O valor do imposto é de " + imposto);

valortotal = precototal + imposto;

System.out.println("O valor totoal é: " + valortotal);

sc.close();
	}
}
