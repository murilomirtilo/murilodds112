package com.company.comecando.atividades.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade16EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A " );
        double valorDeA = scanner.nextDouble();

        if (valorDeA > 0) {
            System.out.print("Digite o valor de B ");
            double valorDeB = scanner.nextDouble();
            System.out.print("Digite o valor de C ");
            double valordeC = scanner.nextDouble();
            double valorDeBaoQuadrado = valorDeB * valorDeB;
            double delta = (valorDeBaoQuadrado)  - (4*valorDeA*valordeC);
            double raizDoDelta = Math.sqrt(delta);
            double raizReal;
            double raizRealPositivo;
            double raizRealNegativo;
            if (delta > 0) {
                raizRealPositivo = (-valorDeB + raizDoDelta) / (2 * valorDeA);
                raizRealNegativo = (-valorDeB - raizDoDelta) / (2 * valorDeA);
                System.out.print("Sua raiz postiva é: " +raizRealPositivo);
                System.out.print("Sua raiz negativa é: " +raizRealNegativo);
            } else if (delta == 0) {
                raizReal = (-valorDeB + raizDoDelta) / 2 * valorDeA;
                System.out.print("Sua raiz é :" + raizReal);
            } else {
                System.out.print("O valor de delta é < 0 e não possui raizes reais.");
            }
        } else {
            System.out.print("Se o A for < 0, a equação não é de segundo grau.");
        }
    }}
