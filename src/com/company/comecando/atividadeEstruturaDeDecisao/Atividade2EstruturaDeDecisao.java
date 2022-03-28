package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade2EstruturaDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor   ");
        Double numero1 = scanner.nextDouble();
        if (numero1 > 0) {
            System.out.print("Número informado é positivo");
        } else {
            System.out.print("O número informado é negativo");
        }
    }}
