package com.company.comecando.coisadoprofessor;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class TipoLogico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a nota final do aluno?");

        Double nota = scanner.nextDouble();


        Boolean variavelVerdadeira = true;
        Boolean variavelFalsa = false;

        System.out.println("-------------------------------------------------");


        Boolean podeTirarCarteira = nota >= 70;
        scanner.close();

        if (podeTirarCarteira) {
            System.out.print("Aluno  passou de ano. Parabéns!!!");
        } else {
            System.out.print("ALuno não passou de ano ;-(");

        }
    }
}