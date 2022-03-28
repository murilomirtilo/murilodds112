package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso do seu peixe");
        byte limiteDoPesoDoPeixe = 50;
        byte taxaExcedente = 4;
        double pesoDoPeixe = scanner.nextDouble();
        double valorExcedente = (pesoDoPeixe - limiteDoPesoDoPeixe);
        double valorDaMulta = (valorExcedente * taxaExcedente);
        System.out.println(("O peso do seu peixe é:  " + pesoDoPeixe) + ("O valor da sua multa é:  " + valorDaMulta));
    }
}
