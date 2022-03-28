package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu valor em Celsius");
        Double valorCelsius = scanner.nextDouble();
        Double valorEmFahrenheit = (valorCelsius * 1.8 + 32);
        System.out.print("seu valor em Fahrenheit é:    " + valorEmFahrenheit);
    }
}
