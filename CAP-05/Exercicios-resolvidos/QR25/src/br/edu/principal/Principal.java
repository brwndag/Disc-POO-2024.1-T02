package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int origem = 0;
        String meio_t = "";
        String carga = "";
        double imp = 0;
        int transp = 0;
        double seguro = 0;
        double total_imp = 0;

        Scanner scanner = new Scanner(System.in);
        double preco = scanner.nextDouble();

        while (preco > 0) {
            origem = scanner.nextInt();
            meio_t = scanner.nextLine();
            carga = scanner.nextLine();

            if (preco <= 100) imp = preco * 5 / 100;
            else imp = preco * 10 / 100;

            if (carga == "S") {
                if (origem == 1) transp = 50;
                if (origem == 2) transp = 21;
                if (origem == 3) transp = 24;
            }

            if (carga == "N") {
                if (origem == 1) transp = 12;
                if (origem == 2) transp = 21;
                if (origem == 3) transp = 60;
            }

            if (origem == 2 || meio_t == "A") seguro = preco / 2;
            else seguro = 0;

            double precoFinal = preco + imp + transp + seguro;
            total_imp += imp;

            System.out.println(imp);
            System.out.println(transp);
            System.out.println(seguro);
            System.out.println(precoFinal);

            preco = scanner.nextDouble();
        }

        scanner.close();
        System.out.println(total_imp);
    }
}
