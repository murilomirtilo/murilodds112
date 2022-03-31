package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade8EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primero produto:  ");
        double produto1 = scanner.nextDouble();
        System.out.print("Informe o segundo produto:  ");
        double produto2 = scanner.nextDouble();
        System.out.print("Informe o terceiro produto:  ");
        double produto3 = scanner.nextDouble();
        if (produto1 < produto2 && produto1 < produto3) {
            System.out.print("O produto mais barato é o primeiro com o valor de: " + produto1);
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.print("O produto mais barato é o segundo com o valor de: " + produto2);
        } else if (produto3 < produto1 && produto3 < produto2) {
            System.out.print("O produto mais barato é o terceiro com o valor de: " + produto3);
        }
        scanner.close();
    }}
