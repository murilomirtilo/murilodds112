package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua altura:   ");
        Double altura = scanner.nextDouble();
        Double fatorMultiplicaçao = 72.2;
        byte fatorSubtraçao = 58;
        double seuPesoIdeal = ((fatorMultiplicaçao *altura) - fatorSubtraçao);
        System.out.println(("Seu peso ideal é:   ") + seuPesoIdeal);
        scanner.close();
    }
}
