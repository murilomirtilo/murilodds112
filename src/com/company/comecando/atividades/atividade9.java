package com.company.comecando.atividades;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class atividade9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu valor em Fahrenheit");
        Double valorFahrenheit = scanner.nextDouble();

        Double formula = (5 *(valorFahrenheit - 32) / 9);
        Double valorEmCelsius = formula;

        System.out.print("seu valor em Celsius é:    " + valorEmCelsius);

    }
}
