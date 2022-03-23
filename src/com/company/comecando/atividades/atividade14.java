package com.company.comecando.atividades;

import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso do seu peixe");
        Double pesodopeixe = scanner.nextDouble();

        Double valorexcedente = (pesodopeixe - 50);
        Double valordamulta = (valorexcedente * 4);

        System.out.println(("O peso do seu peixe é:  " + pesodopeixe) + ("O valor da sua multa é:  " + valordamulta));

    }
}
