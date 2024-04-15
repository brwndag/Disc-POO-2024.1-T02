package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
        
        int n, i, j; 
        
        double e, fat;
        System.out.println("Digite o valor de N:");
        n = sc.nextInt();
        
        e = 1.0; 
        for (i = 1; i <= n; i++) {
            fat = 1.0;
            
            for (j = 1; j <= i; j++) {
                fat = fat * j;
            }
            
            e = e + 1.0/fat;
        }
        System.out.println("Esse é o valor de N:");
        System.out.println(e);
		
	}
}		
