package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int horaI, minI, horaF, minF, horaD, minD	;
			
		 System.out.println("Digite o horário inicial: ");
		 horaI = sc.nextInt();
		 System.out.println("hora inicial: "+horaI);
		 System.out.println("Escreva minuto: ");
		 minI = sc.nextInt();
		 System.out.println("minuto inicial: "+minI);
	     
		 System.out.println("Digite o horário final: ");
		 horaF = sc.nextInt();
		 System.out.println("hora final: "+horaF);
		 System.out.println("Escreva minuto: ");
		 minF = sc.nextInt();
		 System.out.println("minuto final: "+minF);
		 
		 if (minI>minF) {
			 minF=minF+60;
			 horaF=horaF-1;
		  
		 if (horaI>horaF) 
			 horaF=horaF+24;
			 minD=minF-minI;
			 horaD=horaF-horaI;
			 System.out.println("O jogo durou:"+ horaD +" horas e "+minD+" minutos");
		  }
		 sc.close();
		  }
}


