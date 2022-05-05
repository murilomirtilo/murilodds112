package com.company.comecando.atividades.atividadeEstruturaDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class Atividade4EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra ");
        String letra = scanner.nextLine();
        if (Objects.equals(letra, "A")) {
            System.out.print("Sua letra é uma vogal");
        } else if (Objects.equals(letra, "E")) {
                System.out.print("Sua letra é uma vogal");
                    } else if (Objects.equals(letra, "I")) {
                        System.out.print("Sua letra é uma vogal");
        }               else if (Objects.equals(letra,  "O")) {
                            System.out.print("Sua letra é uma vogal");
        }                   else if (Objects.equals(letra, "U")) {
                                System.out.print("Sua letra é uma vogal");
        }
        else {
            System.out.print("Sua letra é uma consoante");
        }
    }}