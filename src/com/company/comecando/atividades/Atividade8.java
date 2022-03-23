package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas por mês:  ");
        Double numeroDeHorasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite quanto você ganhar por hora:  ");
        Double numeroQueGanhaPorHora = scanner.nextDouble();

        Double valorSalarioMensal = numeroDeHorasTrabalhadas * numeroQueGanhaPorHora;
        System.out.print("seu salario mensal é:   " + valorSalarioMensal);

        scanner.close();

    }
}

