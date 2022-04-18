package com.company.comecando.AtividadesPedidasPeloProfessor;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua primeira nota ");
        byte primeiraNota = scanner.nextByte();
        System.out.print("Informe sua segunda nota ");
        byte segundaNota = scanner.nextByte();
        Integer notaSomada = null;
        if ((primeiraNota >= 60) && (segundaNota >= 60)) {
            notaSomada = primeiraNota + segundaNota;
            if (notaSomada > 150) {
                System.out.print("Canditado conseguiu.");
            } else {
                System.out.print("Candidato não conseguiu.");
            }
        } else {
            System.out.print("Candidato não conseguiu.");
        }
    }
}
