package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor em metros.");
        Double numero1 = scanner.nextDouble();
        System.out.print("Seu valor em centimetros é:   " + numero1 * 100);
        scanner.close();
        }
    }
