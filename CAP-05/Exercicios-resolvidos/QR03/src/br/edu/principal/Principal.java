package br.edu.principal;

import java.util.Scanner;

public class Principal {

   public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);
	   
       int n, num, i, j, fat;
       
	   
       System.out.println("Digite o valor de n:");
       n = sc.nextInt();
	   
       for (i = 1; i <= n; i++) {
           System.out.println("Digite o número:");
           num = sc.nextInt();
           fat = 1;  
           
           for (j = 1; j <= num; j++) {
               fat = fat * j;
           }
           System.out.println("Valor lido: " + num);
           System.out.println("Fatorial: " + fat);
	   }
   }
}

