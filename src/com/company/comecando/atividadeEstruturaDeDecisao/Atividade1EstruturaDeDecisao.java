package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade1EstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor " );
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite outro valor ");
        Double numero2 = scanner.nextDouble();
        boolean numero1MaiorQueNumero2 = numero1 > numero2;
        if (numero1MaiorQueNumero2) {
            System.out.print("O maior número é: " + numero1);
        } else {
            System.out.print("O maior número é: " + numero2);
        }
      }
    }

