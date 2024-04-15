package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalValues = 0;
        double totalFees = 0;

        while (true) {
            int code = scanner.nextInt();
            if (code == 0) break;
            int type = scanner.nextInt();
            double value = scanner.nextDouble();
            double income = 0;

            if (type == 1) income = value * 1.5 / 100;
            if (type == 2) income = value * 2 / 100;
            if (type == 3) income = value * 4 / 100;
            System.out.println(income);

            totalValues += value;
            totalFees += income;
        }

        scanner.close();
        System.out.println(totalValues);
        System.out.println(totalFees);
    }
}
