package com.company.comecando.atividades.AtividadesPedidasPeloProfessor;

import java.util.Scanner;

public class calculadorasimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("digite outro numero: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite o sinal desejado. 1 para soma, 2 para subtração, 3 para divisão, 4 para multiplicação: ");
        byte sinalDesejado = scanner.nextByte();
        double resultado;
        if (sinalDesejado == 1) {
            resultado = numero1 + numero2;
            System.out.print("ambos numeros somados são: " + resultado);
        } else if (sinalDesejado == 2) {
            resultado = numero1 - numero2;
            System.out.print("ambos numeros subtraidos são: " + resultado);
        } else if (sinalDesejado == 3) {
            resultado = numero2 / numero1;
            System.out.print("ambos numeros divididos são: " + resultado);
        } else if (sinalDesejado == 4) {
            resultado = numero1 * numero2;
            System.out.print("ambos numeros multiplicados são: " + resultado);
        } else {
            System.out.print("Valor invalido");
        }
    }
}


