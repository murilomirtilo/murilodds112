package com.company.comecando.atividades;


import java.util.Scanner;

public class atividade2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        Integer numero = scanner.nextInt();
        System.out.print("seu numero é: " + numero);

        scanner.close();
    }
}