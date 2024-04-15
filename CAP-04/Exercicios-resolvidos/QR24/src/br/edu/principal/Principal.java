package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double sal = 0;
        double imp = 0;
        int aum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("MENU DE OPÇÕES");
        System.out.println("1- Imposto");
        System.out.println("2- Novo Salário");
        System.out.println("3- Classificação");
        System.out.println("4- Finalizar o programa");
        System.out.println("Digite a opção desejada");

        int op = scanner.nextInt();
        if (op > 4 || op < 1) System.out.println("Opção inválida");

        if (op == 1) {
            sal = scanner.nextDouble();

            if (sal < 500) imp = sal * 5 / 100;
            if (sal >= 500 && sal <= 850) imp = sal * 10 / 100;
            if (sal > 850) imp = sal * 15 / 100;
            System.out.println(imp);
        }

        if (op == 2) {
            sal = scanner.nextDouble();

            if (sal > 1500) aum = 25;
            if (sal >= 750 && sal <= 1500) aum = 50;
            if (sal >= 450 && sal < 750) aum = 75;
            if (sal < 450) aum = 100;

            double novo_sal = sal + aum;
            System.out.println(novo_sal);
        }

        if (op == 3) {
            sal = scanner.nextDouble();
            
            if (sal <= 700) System.out.println("Mal Remunerado");
            else System.out.println("Bem Remunerado");
        }

        scanner.close();
    }
}
