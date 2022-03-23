package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite outro número");
        Double nota2 = scanner.nextDouble();
        System.out.println("Digite um número");
        Double nota3 = scanner.nextDouble();
        System.out.println("Digite outro número");
        Double nota4 = scanner.nextDouble();

        System.out.print("A média deles é:   " + (nota1 + nota2 + nota3 + nota4) / 4); // 4 pois pede a média das 4 notas bimestrais.


        scanner.close();










    }
}
