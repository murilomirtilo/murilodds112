package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SALARIO BRUTO

        System.out.println("Digite o número de horas trabalhadas por mês");
        Double numerodehorastrabalhadas = scanner.nextDouble();

        System.out.println("Digite quanto você ganhar por hora");
        Double numeroqueganhaporhora = scanner.nextDouble();

        Double salariobruto = (numerodehorastrabalhadas * numeroqueganhaporhora);
        System.out.print(salariobruto);

       // IMPOSTOS

        Double impostoderenda = 0.11;
        Double inss = 0.8;
        Double sindicato = 0.5;

        // SALARIO LIQUIDO

        Double salariobrutoimpostoderenda = salariobruto * impostoderenda;
        Double salariobrutoinss = salariobrutoimpostoderenda * inss;
        Double salariobrutosindicato = salariobrutoimpostoderenda * sindicato;

        scanner.close();
    }
}
