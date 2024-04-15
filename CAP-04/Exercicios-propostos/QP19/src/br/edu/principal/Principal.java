package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura,pesoIdeal;
		String sexo;
		
		System.out.println("Digite a altura da pessoa em metros: ");
		altura=sc.nextDouble();
		
		System.out.println("Digite o sexo da pessoa(M-Masculino ou F-Feminino)");
		sexo =sc.next();
		
		if(sexo.equals("M")) {
			pesoIdeal=(72.7*altura)-58;
			System.out.println("O peso ideal para um homem com "+altura+" de altura é de"+pesoIdeal+"Kg");
		}else if(sexo.equals("F")) {
			pesoIdeal=(62.1*altura)-44.7;
			System.out.println("O peso ideal para uma mulher com "+altura+" de altura é de"+pesoIdeal+"Kg");
		}else {
		    System.err.println("SEXO INVÁLIDO");
		}

	}

}
