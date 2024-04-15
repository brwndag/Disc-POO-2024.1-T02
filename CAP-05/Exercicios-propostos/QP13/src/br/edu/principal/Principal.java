package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
       
        
        double somaPesoFaixa1a10 = 0, somaPesoFaixa11a20 = 0, somaPesoFaixa21a30 = 0, somaPesoFaixa31aAOINFINITO = 0;
        
        int numFaixa1a10 = 0, numFaixa11a20 = 0, numFaixa21a30 = 0, numFaixa31aINFINITO = 0;
        
        for (int i = 0; i <=15; i++) {
        	System.out.println("Informe a idade da pessoa:");
        	int idade = sc.nextInt();
        	System.out.println("Informe o peso da pessoa:");
        	double peso = sc.nextInt();
        	
        	
        	 if (idade >= 1 && idade <= 10) {
                 somaPesoFaixa1a10 += peso;
                 numFaixa1a10 = numFaixa1a10 + 1;
                 
             } else if (idade >= 11 && idade <= 20) {
                 somaPesoFaixa11a20 += peso;
                 numFaixa11a20 = numFaixa11a20 + 1;
                 
             } else if (idade >= 21 && idade <= 30) {
                 somaPesoFaixa21a30 += peso;
                 numFaixa21a30 = numFaixa21a30 + 1;
                 
             } else {
                 somaPesoFaixa31aAOINFINITO += peso;
                 numFaixa31aINFINITO = numFaixa31aINFINITO + 1;
        }
}        
       
        System.out.println("Média de pesos das pessoas de 1 a 10 anos: " + (somaPesoFaixa1a10 / numFaixa1a10));
        
        System.out.println("Média de pesos das pessoas de 11 a 20 anos: " + (somaPesoFaixa11a20 / numFaixa11a20));
        
        System.out.println("Média de pesos das pessoas de 21 a 30 anos: " + (somaPesoFaixa21a30 / numFaixa21a30 ));
        
        System.out.println("Média de pesos das pessoas de 31 anos para o infinito: " + (somaPesoFaixa31aAOINFINITO / numFaixa31aINFINITO));
        
        
    }       
}