package com.company.comecando.AtividadesPedidasPeloProfessor;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número ");
        Integer numero = scanner.nextInt();
        System.out.println("-----------------");
        imprimirTabuada(numero,0);
    }
    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }}}





