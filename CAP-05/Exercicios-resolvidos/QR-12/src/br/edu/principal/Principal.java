package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int numOP=0,pecasOP=0,numMaior=0,contM=0,contF=0,totPecas=0,cont=1;
		double mediaM=0.0,salMaior=0.0,mediaF=0.0,salOP=0.0,totFolha=0.0;
		String sexoOP;
		
		   for(cont=1;cont<=15;cont++){
		  System.out.println("Digite o n�mero do "+cont+" oper�rio: ");
		  numOP=sc.nextInt();
		  
		  System.out.println("Digite o sexo do oper�rio(M ou F): ");
		  sexoOP=sc.next().toUpperCase();
		  
		  System.out.println("Digite o numero de pe�as fabricadas pelo "+cont+" oper�rio: ");
		  pecasOP=sc.nextInt();
		  
		  if(pecasOP<=30) {
			  salOP=450;
		  }if(pecasOP>30 && pecasOP<=50) {
			salOP=450+((pecasOP-30)*3/100*450);
		 }if(pecasOP>50){
			 salOP=450+((pecasOP-30)*5/100*450);
		 }
		  System.out.println("O operario de numero "+numOP+" recebe sal�rio = R$"+salOP);
		  
		  totFolha=totFolha+salOP;
		  totPecas=totPecas+pecasOP;
		  
		  if(sexoOP.equals("M") ) {
			  mediaM=mediaM+pecasOP;
			  contM++;
		  }else {
			  mediaF=mediaF+pecasOP;
			  contF++;
		  }
		  
		  if(cont==1) {
			  salMaior=salOP;
			  numMaior=numOP;
		  }else{ 
			  if(salOP>salMaior) {
				 salMaior=salOP;
				 numMaior=numOP;
			  }  
		}
		  
		System.out.println("total da folha de pagamento = R$"+totFolha);
		System.out.println("total de pe�as fabricadas = "+totPecas);
		
		if(contM==0) {
			System.out.println("NENHUM HOMEM!");
		}else {
			mediaM/=contM;
			System.out.println("M�dia de pe�as fabricadas por homens = "+mediaM);
		}
		if(contF==0) {
			System.out.println("NENHUMA MULHER!");
		}else {
			mediaF/=contF;
			System.out.println("M�dia de pe�as fabricadas por mulheres = "+mediaF);
		}
	
		System.out.println("O numero do oper�rio com o maior sal�rio � : "+numMaior);
}
		   sc.close();
}
}
