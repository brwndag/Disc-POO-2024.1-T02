package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, x, expoente, num_termos, denominador = 1;
        double s = 0, fat;

        System.out.println("Digite o número de termos:");
        num_termos = scanner.nextInt();
        System.out.println("Digite o valor de x:");
        x = scanner.nextInt();

        for (i = 1; i <= num_termos; i++) {
            fat = 1;
            for (j = 1; j <= denominador; j++) {
                fat *= j;
            }
            expoente = i + 1;
            if (expoente % 2 == 0) {
                s -= Math.pow(x, expoente) / fat;
            } else {
                s += Math.pow(x, expoente) / fat;
            }
            if (denominador == 4) {
                denominador = -1;
            } else if (denominador == 1) {
                denominador = 1;
            }
            if (denominador == 1) {
                denominador = denominador + 1;
            } else {
                denominador = denominador - 1;
            }
        }
        System.out.println("Resultado: " + s);
    }
}


