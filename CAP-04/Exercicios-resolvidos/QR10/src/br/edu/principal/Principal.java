package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double media_altura = 0;

        int qtde = 0;
        int tot80 = 0;
        Scanner scanner = new Scanner(System.in);

        for (int cont_time = 1; cont_time <= 5; cont_time++) {
            double media_idade = 0;

            for (int cont_jog = 1; cont_jog <= 11; cont_jog++) {
                double idade = scanner.nextDouble();
                double peso = scanner.nextDouble();
                double alt = scanner.nextDouble();

                if (idade < 18) qtde++;
                media_idade += idade;
                media_altura += alt;

                if (peso > 80) tot80++;
            }

            media_idade /= 11;
            System.out.println(media_idade);
        }

        scanner.close();
        media_altura /= 55;
        float porc = tot80 * 100 / 55;

        System.out.println(qtde);
        System.out.println(media_altura);
        System.out.println(porc);
    }
}