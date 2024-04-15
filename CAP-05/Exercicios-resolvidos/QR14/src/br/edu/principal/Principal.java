package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int valor_i, juros, valorParc, total, valorJuros, numParc, i;
		
		System.out.println("Digite o valor inicial da dívida: ");
		valor_i = sc.nextInt();
		juros = 0;
		numParc = 1;
		total = valor_i;
		valorParc = valor_i;
		
		System.out.println("\n[" +
		        "Total | Juros | Parcelas | Valor Par.]" +
		        "\n["+ total + " | " + juros + " | " + numParc + " | " + valorParc +
		        "]");
		
		numParc = numParc + 2;
		juros = juros + 10;
		
		for (i = 1; i<=4; i++) {
			valorJuros = valor_i * juros / 100;
			total = valor_i + valorJuros;
			valorParc = total / numParc;
			
			System.out.println("\n[" +
			        "Total | Juros | Parcelas | Valor Par.]" +
			        "\n["+ total + " | " + juros + " | " + numParc + " | " + valorParc +
			        "]");
			
			
			juros = juros + 5;
			numParc = numParc + 3;
		}
		sc.close();
}
}