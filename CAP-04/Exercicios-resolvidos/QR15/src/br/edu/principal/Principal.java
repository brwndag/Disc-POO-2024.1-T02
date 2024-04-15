package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double salMin,nht,nDep,nExt,salReceber,vHora,sMes,vDep,vHext,salBruto,sliq,grat,imp;
        
        System.out.println("Digite seu salario: ");
        salMin = sc.nextDouble();
        System.out.println("Digite numero de horas trabalhadas ");
        nht = sc.nextDouble();
        System.out.println("Digite numeo de horas dependentes");
        nDep = sc.nextDouble();
        System.out.println("Digite quantidade de horas extras trabalhadas");
        nExt = sc.nextDouble();
        
        
        vHora=1.0/5*salMin;
        System.out.println(vHora);
        sMes=nht*vHora;
        System.out.println(sMes);
        vDep=32*nDep;
        System.out.println(vDep);
        vHext=nExt*(vHora+(vHora*50/100));
        System.out.println(vHext);
        salBruto=sMes+vDep+vHext;
        System.out.println(salBruto);
        
        if(salBruto<200 ) {
        	imp=0;
        	System.out.println("IMPOSTO=R$"+imp);
        	
        }else if(salBruto>=200 && salBruto<=500) {
            imp=salBruto*10/100;
            System.out.println("IMPOSTO=R$"+imp);
        }else {
        	imp=salBruto*20/100;
        	System.out.println("IMPOSTO=R$"+imp);
        	
        }
        sliq=salBruto-imp;
           if(sliq<=350) {
            grat=100;
           }else{
        	grat=50;	
           }
           salReceber=sliq+grat;
           System.out.println("O salário a receber é de: R$"+salReceber);
           sc.close();
}
}


