package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double total_classe = 0;
        int tr = 0;
        int te = 0;
        int ta = 0;

        Scanner scanner = new Scanner(System.in);

        for (int cont = 1; cont <= 6; cont++) {
            double n1 = scanner.nextDouble();
            double n2 = scanner.nextDouble();
            double media = (n1 + n2) / 2;
            System.out.println(media);

            if (media <= 3) {
                tr++;
                System.out.println("Reprovado");
            }

            if (media > 3 && media < 7) {
                te++;
                System.out.println("Exame");
            }

            if (media >= 7) {
                ta++;
                System.out.println("Aprovado");
            }

            total_classe += media;
        }

        scanner.close();
        System.out.println(tr);
        System.out.println(te);
        System.out.println(ta);

        double media_classe = total_classe / 6;
        System.out.println(media_classe);
    }
}