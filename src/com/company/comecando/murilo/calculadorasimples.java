package com.company.comecando.murilo;

import java.util.Scanner;

public class calculadorasimples {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("digite um numero");
            Double numero1 = scanner.nextDouble();
            System.out.print("digite outro numero?");
            Double numero2 = scanner.nextDouble();
            Double resultado1 = numero1 + numero2;
            Double resultado2 = numero1 * numero2;
            System.out.println("ambos numeros somados são: " + resultado1);
            System.out.print("ambos numeros multiplicados são: " + resultado2);
            scanner.close();
        }
    }


