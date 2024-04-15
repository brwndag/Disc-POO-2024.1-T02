package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double maior = 0;
        double menor = 0;
        double soma_par = 0;

        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        int qtd = 0;
        int qtd_par = 0;
        int qtd_impar = 0;
        double soma = 0;

        while (num != 30000) {
            if (qtd == 0) {
                maior = num;
                menor = num;
            }

            else {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }

            soma += num;
            qtd++;

            if (num % 2 == 0) {
                soma_par += num;
                qtd_par++;
            }
            else qtd_impar++;

            num = scanner.nextDouble();
        }
        scanner.close();

        if (qtd == 0) System.out.println("Nenhum número digitado");
        else {
            double media = soma / qtd;

            System.out.println(soma);
            System.out.println(qtd);
            System.out.println(media);
            System.out.println(maior);
            System.out.println(menor);

            if (qtd_par == 0) System.out.println("Nenhum número par");
            else {
                double media_par = soma_par / qtd_par;
                System.out.println(media_par);
            }

            float perc = qtd_impar * 100 / qtd;
            System.out.println(perc);
        }
    }
}
