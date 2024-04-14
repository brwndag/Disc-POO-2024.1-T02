package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,numCri,meses,totF=0,totM=0,tot24=0;
		double porc24,porcF,porcM;
		
		
		System.out.println("Digite o n�mero de crin�as nascidas no per�odo: ");
		numCri=sc.nextInt();
		
		for(i=1;i<=numCri;i++) {
			System.out.println("digite o sexo da "+i+" crian�a: ");
			char sexo=sc.next().charAt(0);
			System.out.println("digite o tempo de vida(Em meses) da "+i+" crian�a: ");
			meses=sc.nextInt();
			
			if (sexo=='M') {
				totM++;
			}
			else if(sexo=='F') {
				totF++;
			}
			if(meses<=24)
				tot24++;
		}
	
		    if(numCri==0) {
		    	System.out.println("NENHUMA CRIAN�A DIGITADA");
		    }else {
		    	porcM=totM*100.0/numCri;
		    	porcF=totF*100.0/numCri;
		    	porc24=tot24*100.0/numCri;
		    	System.out.println("Percentual de crin�as do sexo FEMININO mortas = "+porcF);
		    	System.out.println("Percentual de crin�as do sexo MASCULINO mortas = "+porcM);
		    	System.out.println("Percentual de crin�as do com 24 MESES ou MENOS mortas = "+porc24);
		    }
		    sc.close();
	}
}
