package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		int cod, num_h, cont_m, cont_f;
		double sal_b, sal_l = 0, media_m = 0, media_f = 0;
		String sexo;
		
		System.out.println("Informe o código do professor ou digite 99999 para terminar: ");
		cod = sc.nextInt();
		
		cont_m = 0;
		cont_f = 0;
		
		while (cod != 99999) {
			System.out.println("Digite o sexo do professor: ");
			sexo = sc.next();
			
			System.out.println("Digite o número de horas/aula dadas pelo professor: ");
			num_h = sc.nextInt();
			
			sal_b = num_h * 30;
			
			if (sexo.equals("M")) {
				sal_l = sal_b - (sal_b * 10./100.);
				media_m += sal_l;
				cont_m += 1;
			} else if (sexo.equals("F")) {
				sal_l = sal_b - (sal_b * 5./100.);
				media_f += sal_l;
				cont_f += 1;
			}
			
			System.out.println("\nCódigo do professor: " + cod + "\nSalário bruto: R$" + df.format(sal_b) + "\nSalário líquido: R$" + df.format(sal_l) + "\n");
			
			System.out.println("Digite o código do professor ou digite 99999 para terminar: ");
			cod = sc.nextInt();
		}
		
		System.out.println("");
		
		if (cont_m == 0)
			System.out.println("Nenhum professor do sexo masculino");
		else {
			media_m = media_m / cont_m;
			System.out.println("Média de professores do sexo masculino: " + media_m);
		}
		
		if (cont_f == 0)
			System.out.println("Nenhum professor do sexo feminino");
		else {
			media_f = media_f / cont_f;
			System.out.println("Média de professores do sexo feminino: " + media_f);
		}
		
		sc.close();
	}

}