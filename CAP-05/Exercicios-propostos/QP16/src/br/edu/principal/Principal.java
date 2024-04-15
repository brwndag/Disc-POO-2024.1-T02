package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = scanner.nextDouble();

        double sumAges = 0;
        int ageQuantity = 0;

        while (age != 0) {
            sumAges += age;
            ageQuantity++;
            age = scanner.nextDouble();
        }

        scanner.close();
        System.out.println(sumAges / ageQuantity);
    }
}
