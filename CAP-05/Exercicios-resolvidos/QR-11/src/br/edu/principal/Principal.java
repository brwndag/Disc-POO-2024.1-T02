package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,num,qtde;
		
		System.out.println("Insira um valr inteiro positivo: ");
		num=sc.nextInt();
		
		qtde=0;
		for(i=1;i<num;i++) {
			if(num%i==0) {
				qtde++;
			}
		}
		if(qtde>2) {
			System.out.println("O n�mero inserido N�O � primo");
		}else {
		    System.out.println("O n�mero inserido � primo");
		}
		sc.close();
}
}
