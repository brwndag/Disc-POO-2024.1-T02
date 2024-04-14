package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double op, sal, imp, aum, novoSal;
        System.out.println("MENU DE OPÇOES");
        System.out.println("1 -- IMPOSTO");
        System.out.println("2 -- NOVO SALÁRIO");
        System.out.println("3 -- CLASSIFICAÇAO");
        System.out.println(" -- DIGITE A OPÇAO DESEJADA -- ");
        op = sc.nextDouble();
        
        if(op==1) {
        	System.out.println("digite seu salário:");
        	sal=sc.nextDouble();
        	if(sal<500) { 
        		imp=sal*5/100;
        		System.out.println("Imposto = "+imp);
        	}
        	else if(sal>=500 && sal<=850) {
        		imp=sal*10/100;
        	   System.out.println("Imposto = "+imp);
        	}
        	else {
        		imp=sal*15/100;
        	   System.out.println("Imposto = "+imp);
        }}
          else if(op==2) {
        	   System.out.println("digite seu salário:");
        	sal=sc.nextDouble();
        	if(sal>1500) { 
        		aum=25;	
        		novoSal=sal+aum;
        	   System.out.println("Novo salário = "+novoSal);
        	}
        	else if(sal>=750 && sal<=1500) {
        		aum=50;
        		novoSal=sal+aum;
        	   System.out.println("Novo salário = "+novoSal);
        	}
        	else if(sal>=450 && sal<=750){
        		aum=75;
        		novoSal=sal+aum;
        	    System.out.println("Novo salário = "+novoSal);
        	}
              else {
        		aum=100;
        	    novoSal=sal+aum;
        	   System.out.println("Novo salário = "+novoSal);
        	   }
          }
        	else if(op==3) {
        	System.out.println("digite seu salário:");
                   sal=sc.nextDouble();
                   
               	if(sal<=700) {
               		System.err.println("MAL REMUNERADO");
                }
               	else{
               	   System.out.println("BEM REMUNERADO");
               	 }
            }
               	if(op<1||op>3) {
              		 System.err.println("OPÇÃO INVÁLIDA");
                sc.close();       	
}
}
}

