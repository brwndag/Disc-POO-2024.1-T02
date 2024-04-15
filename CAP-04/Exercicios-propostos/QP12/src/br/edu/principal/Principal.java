package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int salarioBruto;
		
		double salarionovo; 
		
		
		
		System.out.println("Digite o salário:");
		salarioBruto = sc.nextInt();
		
		double reducao = salarioBruto * 0.07;
		
		if (salarioBruto <= 350) {
			salarionovo = (salarioBruto + 100) - reducao;
            System.out.println("O salário novo é de:" + " " + salarionovo);
            
         } else if (salarioBruto > 350 && salarioBruto <= 600 ) {
        	 salarionovo = (salarioBruto + 75) - reducao;
             System.out.println("O salário novo é de:" + " " + salarionovo);
         }
         else if (salarioBruto > 600 && salarioBruto <= 900 ) {
        	 salarionovo = (salarioBruto + 50) - reducao;
             System.out.println("O salário novo é de:" + " " + salarionovo);
         }
         else if (salarioBruto > 900 ) {
             salarionovo = (salarioBruto + 35) - reducao;
             System.out.println("O salário novo é de:" + " " + salarionovo);
             
         
	}	
		sc.close();	
	}
}
