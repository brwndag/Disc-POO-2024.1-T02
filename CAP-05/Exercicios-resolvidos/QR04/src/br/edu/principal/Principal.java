package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont, cod, num_vei, num_acid, maior = 0, cid_maior = 0, menor = 0, cid_menor = 0;
        int soma_vei = 0, soma_acid = 0;
        double media_vei, media_acid;
        double cont_acid = 0;

        soma_vei = 0;
        soma_acid = 0;
        cont_acid = 0;

        for (cont = 1; cont <= 5; cont++) {
            System.out.println("Digite o código, o número de veículos e o número de acidentes das 5 cidades:");
            cod = sc.nextInt();
            num_vei = sc.nextInt();
            num_acid = sc.nextInt();

            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            } else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }

                if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }

            soma_vei = soma_vei + num_vei;

            if (num_vei < 2000) {
                soma_acid = soma_acid + num_acid;
                cont_acid = cont_acid + 1;
            }
        }

        System.out.println("Cidade com o maior número de acidentes: " + cid_maior + ", Número de acidentes: " + maior);
        System.out.println("Cidade com o menor número de acidentes: " + cid_menor + ", Número de acidentes: " + menor);

        media_vei = soma_vei / 5.0;
        System.out.println("Média de veículos: " + media_vei);

        if (cont_acid == 0) {
            System.out.println("Não foi digitada nenhuma cidade com menos de 2000 veículos");
        } else {
            media_acid = soma_acid / cont_acid;
            System.out.println("Média de acidentes em cidades com menos de 2000 veículos: " + media_acid);
        }
    }
}
