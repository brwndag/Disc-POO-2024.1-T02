package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double menor_idade = 0;

        Scanner scanner = new Scanner(System.in);
        double idade = scanner.nextDouble();

        int tot = 0;
        int tot_f = 0;
        int tot_m = 0;
        double soma1 = 0;
        int cont_m1 = 0;
        int cont_m2 = 0;
        int cont_f1 = 0;

        while (idade != 0) {
            String sexo = scanner.nextLine();
            String exp = scanner.nextLine();

            if (sexo == "F" && exp == "S") {
                if (tot == 0) {
                    menor_idade = idade;
                    tot = 1;
                }
                else if (idade < menor_idade) menor_idade = idade;
            }
            if (sexo == "M") tot_m++;
            if (sexo == "F") tot_f++;
            if (sexo == "F" && idade < 21 && exp == "S") cont_f1++;
            if (sexo == "M" && idade > 45) cont_m1++;
            if (sexo == "M" && exp == "S") {
                soma1 += idade;
                cont_m2++;
            }

            idade = scanner.nextDouble();
        }

        scanner.close();
        System.out.println(tot_f);
        System.out.println(tot_m);

        if (cont_m2 == 0) System.out.println("Nenhum homem com experiência");
        else {
            double media_idade = soma1 / cont_m2;
            System.out.println(media_idade);
        }

        if (tot_m == 0) System.out.println("Nenhum homem");
        else {
            float perc = cont_m1 * 100 / tot_m;
            System.out.println(perc);
        }

        System.out.println(cont_f1);
        System.out.println(menor_idade);
    }
}
