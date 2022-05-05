package com.company.comecando.atividades.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade13EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia correpondente da semana");
        System.out.println("------------------");
        System.out.print("1 para domingo, 2 para segunda, 3 para terça, 4 para quarta, 5 para quinta, 6 para sexta, 7 para sabádo ");
        int valorDaSemanaDado = scanner.nextInt();
        if (valorDaSemanaDado == 1) {
            System.out.print("O dia atual é domingo");
        } else if (valorDaSemanaDado == 2) {
            System.out.print("O dia atual é segunda");
        } else if (valorDaSemanaDado == 3) {
            System.out.print("O dia atual é terça");
        } else if (valorDaSemanaDado == 4) {
            System.out.print("O dia atual é quarta");
        } else if (valorDaSemanaDado == 5) {
            System.out.print("O dia atual é quinta");
        } else if (valorDaSemanaDado == 6) {
            System.out.print("O dia atual é sexta");
        } else if (valorDaSemanaDado == 7) {
            System.out.print("O dia atual é sabádo");
        } else {
            System.out.print("valor indefinido");
        }
    }}
