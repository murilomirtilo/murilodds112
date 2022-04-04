package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade7EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número:  ");
        double numero1 = scanner.nextDouble();
        System.out.print("Informe outro número:  ");
        double numero2 = scanner.nextDouble();
        System.out.print("Informe um terceiro número:  ");
        double numero3 = scanner.nextDouble();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.print("O maior número é:  " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.print("O maior número é " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.print("O maior número é " + numero3);
        }
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O menor número é:  " + numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O menor número é " + numero2);
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("O menor número é " + numero3);

        }
        scanner.close();
        }
    }
