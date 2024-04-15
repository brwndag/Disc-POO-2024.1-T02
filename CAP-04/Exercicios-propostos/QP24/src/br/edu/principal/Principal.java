package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double raise = 0;
        double tax = 0;

        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int category = scanner.nextInt();
        String situation = scanner.nextLine();
        scanner.close();

        if (price <= 25) {
            if (category == 1) raise = 5 / 100 * price;
            if (category == 2) raise = 8 / 100 * price;
            if (category == 3) raise = 10 / 100 * price;
        }
        else {
            if (category == 1) raise = 12 / 100 * price;
            if (category == 2) raise = 15 / 100 * price;
            if (category == 3) raise = 18 / 100 * price;
        }
        System.out.println(raise);

        if (category == 2 || situation == "R") tax = 5 / 100 * price;
        else tax = 8 / 100 * price;
        System.out.println(tax);

        double newPrice = price + raise - tax;
        System.out.println(newPrice);

        if (newPrice <= 50) System.out.println("Barato");
        if (newPrice > 50 && newPrice < 120) System.out.println("Normal");
        if (newPrice >= 120) System.out.println("Caro");
    }
}
