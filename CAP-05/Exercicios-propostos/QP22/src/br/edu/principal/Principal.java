package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double cont=0,idade,pessoas50,altura,somaH=0.0;
		
		System.out.println("Digite a idade da pessoa: ");
		idade=sc.nextDouble();
		
		while(idade>0) {
			System.out.println("Digite a altura da pessoa: ");
		    altura=sc.nextDouble();
		    
		    if(idade>50) {
		    	somaH+=altura;
		        cont++;
		    }
		    System.out.println("Digite a idade da proxima pessoa: ");
		    idade=sc.nextInt();
		    
		}
		    if(cont>0) {
		    	pessoas50=somaH/cont;
		    	System.out.println("A média das alturas de pessoas com mais de 50 anos é"+pessoas50);
		    }else {
		    	System.out.println("Não foi inserida nenhuma pessoa com mais de 50 anos");
		    }
		    sc.close();
}

}
