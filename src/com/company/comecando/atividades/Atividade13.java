package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura:    ");
        Double altura = scanner.nextDouble();
        System.out.println("1 para homem, 0 para mulher ");
        Integer homemOuMulher = scanner.nextInt();
        Boolean escolha = homemOuMulher.equals(1);
        if (escolha) {
            Double seuPesoIdealMasculino = ((72.2 * altura) - 58);
            System.out.println(("Seu peso ideal masculino é:   ") + seuPesoIdealMasculino);
        } else if (!escolha) {
            Double seuPesoIdealFeminino = ((62.1 * altura) - 44.7);
            System.out.println(("Seu peso ideal feminino é:   ") + seuPesoIdealFeminino);
            scanner.close();
        } else {
        System.out.print("Valor Indefinido");
        }
    }
}

