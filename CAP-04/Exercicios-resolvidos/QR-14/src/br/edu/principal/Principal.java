package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   double sal, novoSal,boni, aux;
	   
	   System.out.println("DIGITE SEU SALÁRIO:");
	   sal = sc.nextDouble();
	   
	   if(sal<=500 && sal>0) {
		   boni = sal*5/100;
		   System.out.println("Sua bonificação é de: R$"+boni);
	   }
	     else if (sal<=1200 && sal>500) {
		   boni = sal*12/100;
		   System.out.println("Sua bonificação é de: R$"+boni);
	     } else {
		   boni=0;
		   System.out.println("Sua bonificação é de: R$"+boni);
	     }
	   if(sal<=600 && sal>0) {
		   aux=150;
		   System.out.println("O valor do seu auxilio estudantil é de R$"+aux); 
	   }
		   else if (sal<0) {
		   System.err.println("DIGITE VALORES POSITIVOS");	
		   aux=0;
	     }else {
		   aux=100;
		   System.out.println("O valor do seu auxilio estudantil é de R$"+aux);
	   }
	   System.out.println("Seu novo salário é: ");
	   novoSal=sal+boni+aux;
	   System.out.println(novoSal);
	   sc.close(); 
	}
}

