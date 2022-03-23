package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        Double numero1 = scanner.nextDouble();

        Double numeroAreaDoQuadrado = (numero1 * numero1);

        Double numeroAreaDoQuadradoVezes2 = (numeroAreaDoQuadrado * 2);

        System.out.print("A area do quadrado ao dobro é:   " + numeroAreaDoQuadradoVezes2);


        scanner.close();
    }
}
