package com.company.comecando.atividades.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class ProgamaNotaMaiorOuIgualA70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua nota:  ");
        Double nota = scanner.nextDouble();
        if (nota >= 70) {
            System.out.print("Parabéns você passou");
        } else {
            System.out.print("Você reprovou");
        }
   scanner.close();
    }
}
