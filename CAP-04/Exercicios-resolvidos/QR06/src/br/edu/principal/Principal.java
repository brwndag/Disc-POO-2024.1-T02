

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double valor = 0;
        double aux = 0;
        
        Scanner scanner = new Scanner(System.in);
        double sal_min = 450;

        for (int cont = 1; cont <= 10; cont++) {
            int codigo = scanner.nextInt();
            double nht = scanner.nextDouble();
            String turno = scanner.nextLine();
            String categoria = scanner.nextLine();

            while (turno != "M" && turno != "V" && turno != "N") turno = scanner.nextLine();
            while (categoria != "G" && categoria != "O") categoria = scanner.nextLine();

            if (categoria == "G") {
                if (turno == "N") valor = sal_min * 18 / 100;
                else valor = sal_min * 15 / 100;
            }
            else {
                if (turno == "N") valor = sal_min * 13 / 100;
                else valor = sal_min * 10 / 100;
            }

            double sal_inicial = nht * valor;

            if (sal_inicial <= 300) aux = sal_inicial * 20 / 100;
            else if (sal_inicial < 600) aux = sal_inicial * 15 / 100;
            else aux = sal_inicial * 5 / 100;
            double sal_final = sal_inicial + aux;

            System.out.println(codigo);
            System.out.println(nht);
            System.out.println(valor);
            System.out.println(sal_inicial);
            System.out.println(aux);
            System.out.println(sal_final);
        }

        scanner.close();
    }
}