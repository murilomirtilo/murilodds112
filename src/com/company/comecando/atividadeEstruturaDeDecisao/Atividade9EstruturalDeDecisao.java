package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade9EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primero numero:  ");
        double numero1 = scanner.nextDouble();
        System.out.print("Informe o segundo numero:  ");
        double numero2 = scanner.nextDouble();
        System.out.print("Informe o terceiro numero:  ");
        double numero3 = scanner.nextDouble();
        if ((numero1 > numero2 && numero1 > numero3) || (numero2 < numero3))   {

            System.out.print("Os numeros em ordem decrescente é " + numero1 + "  " + numero2 + "  " + numero3);

        } else if ((numero1 > numero2 && numero1 > numero3) || (numero3 < numero2))   {

            System.out.print("Os numeros em ordem decrescente é " + numero1 + "  " + numero3 + "  " + numero2);

        } else if ((numero2 > numero1 && numero2 > numero3) || (numero1 < numero3))   {

            System.out.print("Os numeros em ordem decrescente é " + numero2 + "  " + numero1 + "  " + numero3);

        } else if ((numero2 > numero1 && numero2 > numero3) || (numero3 < numero1)) {

            System.out.print("Os numeros em ordem decrescente é " + numero2 + "  " + numero3 + "  " + numero1);

        } else if ((numero3 > numero1 && numero3 > numero2) || (numero1 < numero2)) {

            System.out.print("Os numeros em ordem decrescente é " + numero3 + "  " + numero1 + "  " + numero2);

        } else if ((numero3 > numero1 && numero3 > numero2) || (numero2 < numero1)) {

            System.out.print("Os numeros em ordem decrescente é " + numero3 + "  " + numero2 + "  " + numero1);

        }





        scanner.close();
    }}
