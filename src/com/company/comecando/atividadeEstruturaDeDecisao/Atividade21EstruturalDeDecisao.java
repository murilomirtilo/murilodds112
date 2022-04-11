package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade21EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do saque desejado: ");
        Double saqueDesejado = scanner.nextDouble();
        Byte notaDe1 = 1;
        Byte notaDe5 = 5;
        Byte notaDe10 = 10;
        Byte notaDe50 = 50;
        Byte notaDe100 = 100;
        byte operadorAritmetico10 = 10;
        byte operadorArtimetico100 = 100;
        byte operadorAritmetico5 = 5;
        byte operadorAritmetico50 = 50;

        double quantidadeDeNotasDe100 = saqueDesejado / operadorArtimetico100;
        double porcentagem100 = saqueDesejado % operadorArtimetico100;
        double notasde100 = quantidadeDeNotasDe100 - porcentagem100;

        double quantidadeDeNotasDe50 = porcentagem100 / operadorAritmetico50;
        double porcentagem50 = quantidadeDeNotasDe50 % operadorAritmetico50;


        double quantidadeDeNotasDe10 = porcentagem50 / operadorAritmetico10;
        double porcentagem10 = quantidadeDeNotasDe10 % operadorAritmetico10;


        double quantidadeDeNotasDe5 = porcentagem10 / operadorAritmetico5;

        double quantidadeDeNotasDe1 = saqueDesejado % operadorAritmetico10;
        System.out.println("A quantidade de notas de 100 é: " + quantidadeDeNotasDe100);
        System.out.println("A quantidade de notas de 50 é: " + quantidadeDeNotasDe50);
        System.out.println("A quantidade de notas de 10 é: " + quantidadeDeNotasDe10);
        System.out.println("A quantidade de notas de 5 é: " + quantidadeDeNotasDe5);
        System.out.println("A quantidade de notas de 1 é: " + quantidadeDeNotasDe1);






    }
}
