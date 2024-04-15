package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nota1, nota2, nota3, media, nota_exame;
		
		System.out.println("Digite a primeira nota:");
		nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota:");
		nota2 = sc.nextInt();
		System.out.println("Digite a terceira nota:");
		nota3 = sc.nextInt();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("Média aritmética:" + media);
		
		if (media >= 0 && media < 3)
			System.out.println("Reprovado");
		if (media >= 3 && media < 7)
			System.out.println("Exame");
		    nota_exame = 12 - media; 
		    System.out.println("Deve tirar nota"+ nota_exame + "para ser aprovado");
		if (media >= 7 && media <= 10)
		    System.out.println("Aprovado");
		
sc.close();
}
}