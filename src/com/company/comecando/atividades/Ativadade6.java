package com.company.comecando.atividades;

import java.util.Scanner;

public class Ativadade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de seu raio.");
        Double numero1 = scanner.nextDouble();
        Double numero2 = 3.14*(numero1*numero1);
        System.out.print("A área do seu circulo é:   " + numero2 );
        scanner.close();
        }
    }
