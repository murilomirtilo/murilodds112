package com.company.comecando.atividadeEstruturaDeDecisao;
import java.util.Objects;
import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class Atividade14EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("informe sua primeira nota ");
        Double primeiraNota = scanner.nextDouble();
        System.out.print("informe sua segunda nota ");
        Double segundaNota = scanner.nextDouble();
        Double mediaDasNotas = (primeiraNota + segundaNota) / 2;
        String conceito = "Z";
        Boolean aprovado = mediaDasNotas >= 6;
        if (mediaDasNotas > 9) {
            conceito = "A";
        } else if (mediaDasNotas > 7.5 && mediaDasNotas < 9) {
            conceito = "B";
        } else if (mediaDasNotas > 6 && mediaDasNotas < 7.5) {
            conceito = "C";
        } else if (mediaDasNotas > 4 && mediaDasNotas < 6) {
            conceito = "D";
        } else if (mediaDasNotas > 0 && mediaDasNotas < 4) {
            conceito = "E";
        } else {
            System.out.print("Nota indefinida");
        }
        if ((aprovado) && Objects.equals(conceito, "A") || Objects.equals(conceito, "B") || Objects.equals(conceito, "C")) {
            System.out.print("Aprovado || seu conceito é: " + conceito);
        } else {
            System.out.print(("Reprovado || seu conceito é: " + conceito));
        }
    }}
