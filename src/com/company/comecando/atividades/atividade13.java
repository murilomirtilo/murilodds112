package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura:    ");
        Double altura = scanner.nextDouble();
        Double seupesoidealmasculino= ((72.2*altura) - 58);
        System.out.println(("Seu peso ideal masculino é:   ") + seupesoidealmasculino);
        Double seupesoidealfeminino= ((62.1*altura) - 44.7);
        System.out.println(("Seu peso ideal feminino é:   ") + seupesoidealfeminino);


        scanner.close();




    }
}
