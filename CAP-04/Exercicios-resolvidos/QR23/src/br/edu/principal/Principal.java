package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double acresc = 0;

        Scanner scanner = new Scanner(System.in);
        double sal = scanner.nextDouble();
        double qtd = scanner.nextDouble();

        int tot_geral = 0;
        int qtd_cons = 0;
        double valor_kw = sal / 8;

        while (qtd != 0) {
            double gasto = qtd * valor_kw;
            int tipo = scanner.nextInt();

            if (tipo == 1) acresc = gasto * 5 / 100;
            if (tipo == 2) acresc = gasto * 10 / 100;
            if (tipo == 3) acresc = gasto * 15 / 100;

            double total = gasto + acresc;
            tot_geral += total;
            if (total >= 500 && total <= 1000) qtd_cons++;
            
            System.out.println(gasto);
            System.out.println(acresc);
            System.out.println(total);

            qtd = scanner.nextDouble();
        }

        scanner.close();
        System.out.println(tot_geral);
        System.out.println(qtd_cons);
    }
}
