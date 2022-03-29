package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade5EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:   ");
        Double primeiraNota = scanner.nextDouble();
        System.out.println("Digite a segunda nota:   ");
        Double segundaNota = scanner.nextDouble();
        Double media = (segundaNota + primeiraNota) / 2;
        if (media >= 10) {
            System.out.print(("Você foi aprovado com distinção"));
        } else if  (media > 7) {
            System.out.print("Você passou de ano");
        } else if (media < 7) {
            System.out.print("Você foi reprovado");
        }


    }}
