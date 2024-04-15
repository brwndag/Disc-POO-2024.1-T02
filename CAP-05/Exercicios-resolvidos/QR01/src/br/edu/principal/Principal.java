package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int ano_atual;   
        double percentual = 1.5 / 100; 
        double novo_salario;
        
        System.out.println("Digite o ano atual:");
        ano_atual = sc.nextInt();
        
        sc.close();
        
        double salario = 1000;
        novo_salario = salario;
        
        for (int i = 2007; i <= ano_atual; i++) {
            novo_salario += novo_salario * percentual;
        }
        
        System.out.println("Esse é o salario atual:");
        System.out.println(novo_salario);
        
    }
}

