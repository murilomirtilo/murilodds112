package com.company.comecando.atividades.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade19EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero inteiro menor que 1000: ");
        byte operadorAritmetico10 = 10;
        byte operadorArtimetico100 = 100;
        int numeroInteiroEscolhido = scanner.nextInt();
        if (numeroInteiroEscolhido <= 1000) {
            double centenas = numeroInteiroEscolhido / operadorArtimetico100;
            double porcentagemCentenas = numeroInteiroEscolhido % operadorArtimetico100;
            double dezenas = porcentagemCentenas / operadorAritmetico10;
            double unidades = numeroInteiroEscolhido % operadorAritmetico10;
                if (centenas > 1) {
                    System.out.println("A quantidade de centenas é: " + centenas);
                } else {
                    System.out.println("A quantidade de centena é: " + centenas);
                }
                if (dezenas > 1) {
                    System.out.println("A quantidade de dezenas é: " + dezenas);
                } else {
                    System.out.println("A quantidade de dezena é: " + dezenas);
                }
                if (unidades > 1) {
                    System.out.print("A quantidade de unidades é: " + unidades);
                } else {
                    System.out.print("A quantidade de unidade é: " + unidades);
                }
        }
    }
}
