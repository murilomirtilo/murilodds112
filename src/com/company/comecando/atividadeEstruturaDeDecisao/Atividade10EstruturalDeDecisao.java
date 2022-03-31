package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class Atividade10EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seu turno");
        System.out.print("M para Matutino e V para Vespertino e N para Noturno.  ");
        String letra = scanner.nextLine();
        if (Objects.equals(letra, "M")) {
            System.out.print("Bom dia!");
        } else if (Objects.equals(letra, "V")) {
            System.out.print("Boa tarde!");
        } else if (Objects.equals(letra, "N")) {
            System.out.print("Boa noite!");
        } else System.out.print("Indefinido :(");
    scanner.close();
    }}


