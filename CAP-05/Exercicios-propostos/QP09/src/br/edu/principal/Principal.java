package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        int somaidades = 0;
	        int quantpessoas = 10;
	        int pessoaspesosuperior90alturainferior150 = 0;
	        int pessoasidadeentre10e30alturamaior190 = 0;

	        for (int i = 1; i <= quantpessoas; i++) {
	            System.out.println("Informe os dados da pessoa " + i + ":");
	            System.out.print("Idade: ");
	            int idade = scanner.nextInt();
	            somaidades += idade;

	            System.out.print("Peso (kg): ");
	            double peso = scanner.nextDouble();

	            System.out.print("Altura (m): ");
	            double altura = scanner.nextDouble();

	            if (peso > 90 && altura < 1.50) {
	                pessoaspesosuperior90alturainferior150++;
	            }

	            if (idade >= 10 && idade <= 30 && altura > 1.90) {
	                pessoasidadeentre10e30alturamaior190++;
	            }
	        }

	        double mediaIdades = (double) somaidades / quantpessoas;

	        double porcentagempessoasidadeentre10e30alturamaior190 = (double) pessoasidadeentre10e30alturamaior190 / quantpessoas * 100;

	        System.out.println("\nMédia das idades das dez pessoas: " + mediaIdades);
	        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + pessoaspesosuperior90alturainferior150);
	        System.out.printf("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: %.2f%%\n", porcentagempessoasidadeentre10e30alturamaior190);

	        scanner.close();
	    }
	}
