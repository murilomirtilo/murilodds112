package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade17EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o ano desejado: ");
        int anoDesejado = scanner.nextInt();
        if (anoDesejado % 4 == 0) {
            System.out.print("O ano é bissexto");
        } else {
            System.out.print("O ano não é bissexto");
        }
    }}
