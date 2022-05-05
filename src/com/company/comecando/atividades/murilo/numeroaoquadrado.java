package com.company.comecando.atividades.murilo;

import java.util.Scanner;

public class numeroaoquadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        Double numero1 = scanner.nextDouble();
        Double resultado1 = numero1 * numero1;
        System.out.print("seu numero ao quadrado é: " +resultado1);
        scanner.close();
    }
}
