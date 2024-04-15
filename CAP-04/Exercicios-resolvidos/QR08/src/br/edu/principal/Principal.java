package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_termos = scanner.nextInt();
        scanner.close();        

        int num1 = 2;
        int num2 = 7;
        int num3 = 3;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        int i = 4;

        while (i != num_termos) {
            num1 = num1 * 2;
            System.out.println(num1);
            i++;

            if (i != num_termos) {
                num2 = num2 * 3;
                System.out.println(num2);
                i++;

                if (i != num_termos) {
                    num3 = num3 * 4;
                    i++;
                }
            }
        }
    }
}