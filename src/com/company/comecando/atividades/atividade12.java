package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura:    ");
        Double altura = scanner.nextDouble();
        Double seupesoideal = ((72.2*altura) - 58);
        System.out.println(("Seu peso ideal é:   ") + seupesoideal);

        scanner.close();
    }
}
