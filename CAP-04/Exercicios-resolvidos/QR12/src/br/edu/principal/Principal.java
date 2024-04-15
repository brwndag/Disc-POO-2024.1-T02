package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario,aumento,novoSalario,cargo;
		
		System.out.println("Digite o cargo do funcionario(1,2,3,4 ou 5)");
		cargo = sc.nextDouble();
		System.out.println("Digite o salario");
		salario= sc.nextDouble();

		if(cargo==1) {
			System.out.println("O cargo é escrituário");
			aumento=salario*50/100;
			System.out.println("O valor do aumento é:"+aumento);
			novoSalario=salario+aumento;
			System.out.println("Seu novo salario é: "+novoSalario);
		}else if(cargo==2) {
			System.out.println("O cargo é secretário");
			aumento=salario*35/100;
			System.out.println("O valor do aumento é:"+aumento);
			novoSalario=salario+aumento;
			System.out.println("Seu novo salario é: "+novoSalario);
		}else if(cargo==3) {
			System.out.println("O cargo é caixa");
			aumento=salario*20/100;
			System.out.println("O valor do aumento é:"+aumento);
			novoSalario=salario+aumento;
			System.out.println("Seu novo salario é: "+novoSalario);
		}else if(cargo==4) {
			System.out.println("O cargo é gerente");
			aumento=salario*10/100;
			System.out.println("O valor do aumento é:"+aumento);
			novoSalario=salario+aumento;
			System.out.println("Seu novo salario é: "+novoSalario);
		}else if(cargo==5){
			System.out.println("O cargo é diretor");
			aumento=salario*0/100;
			System.out.println("O valor do aumento é:"+aumento);
			novoSalario=salario+aumento;
			System.out.println("Seu novo salario é: "+novoSalario);
		}else {
			System.err.println("cargo inexistente");
		}
		sc.close();		
}
}


