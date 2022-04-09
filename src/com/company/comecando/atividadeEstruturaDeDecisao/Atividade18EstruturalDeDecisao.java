package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade18EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o dia desejado: ");
        int dataDesejado = scanner.nextInt();
        if (dataDesejado <= 31) {
            System.out.print("Escreva o mês desejado: ");
            int mesDesejado = scanner.nextInt();
            if (mesDesejado <= 12) {
                System.out.print("Escreva o ano desejado: ");
                int anoDesejado = scanner.nextInt();
                System.out.print(dataDesejado+"/"+mesDesejado+"/"+anoDesejado);
            } else {
                System.out.print("Data invalida");
            }
        } else {
            System.out.print("Data invalida");
        }


    }}
