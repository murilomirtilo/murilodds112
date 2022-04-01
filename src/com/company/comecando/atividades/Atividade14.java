package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso do seu peixe ");
        byte limiteDoPesoDoPeixe = 50;
        byte taxaExcedente = 4;
        double pesoDoPeixe = scanner.nextDouble();
        double valorExcedente = (pesoDoPeixe - limiteDoPesoDoPeixe);
        double valorDaMulta = (valorExcedente * taxaExcedente);
        if (pesoDoPeixe > limiteDoPesoDoPeixe) {

            System.out.print("O peso do seu peixe é: " + pesoDoPeixe);
            System.out.println("O valor da sua multa é:  " + valorDaMulta);
        } else {
            System.out.println("O peso do seu peixe é: " + pesoDoPeixe);
            System.out.print("O peso do seu peixe está dentro das normas. Sem taxação.");
        }
    }
}
