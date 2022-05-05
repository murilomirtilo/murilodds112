package com.company.comecando.atividades.atividadeEstruturaDeDecisao;

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


        double quantidadeDeNotasde50 = porcentagem100 / operadorAritmetico50;
        double porcetagem50 = porcentagem100 % operadorAritmetico50;

        double quantidadeDeNotasde10 = porcetagem50 / operadorAritmetico5;
        double porcetagem10 = porcetagem50 % operadorAritmetico10;

        double quantidadeDeNotasDe1 = saqueDesejado % operadorAritmetico10;
        System.out.println("A quantidade de notas de 100 é: " + quantidadeDeNotasDe100);
        System.out.println("A quantidade de notas de 50 é: " + quantidadeDeNotasde50);
        System.out.println("A quantidade de notas de 10 é: " + quantidadeDeNotasde10);
        //System.out.println("A quantidade de notas de 5 é: " + notasde5);
        System.out.println("A quantidade de notas de 1 é: " + quantidadeDeNotasDe1);






    }
}
