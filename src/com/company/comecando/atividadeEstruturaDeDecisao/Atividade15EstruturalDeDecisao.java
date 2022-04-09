package com.company.comecando.atividadeEstruturaDeDecisao;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Atividade15EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro lado do triangulo ");
        Double primeiroLadoDoTriangulo = scanner.nextDouble();
        System.out.print("Informe o segundo lado do triangulo ");
        Double segundoLadoDoTriangulo = scanner.nextDouble();
        System.out.print("Informe o terceiro lado do triangulo ");
        Double terceiroLadoDoTriangulo = scanner.nextDouble();
        boolean eUmTriangulo = primeiroLadoDoTriangulo + segundoLadoDoTriangulo > terceiroLadoDoTriangulo || primeiroLadoDoTriangulo + terceiroLadoDoTriangulo > segundoLadoDoTriangulo || terceiroLadoDoTriangulo + segundoLadoDoTriangulo > primeiroLadoDoTriangulo;
        if (eUmTriangulo) {
            if (primeiroLadoDoTriangulo.equals(segundoLadoDoTriangulo) && primeiroLadoDoTriangulo.equals(terceiroLadoDoTriangulo)) {
                System.out.print("É um triangulo equilatero");
            } else if ((primeiroLadoDoTriangulo.equals(segundoLadoDoTriangulo) && !primeiroLadoDoTriangulo.equals(terceiroLadoDoTriangulo)) || (primeiroLadoDoTriangulo.equals(terceiroLadoDoTriangulo) && !primeiroLadoDoTriangulo.equals(segundoLadoDoTriangulo))) {
                System.out.print("É um triangulo isóceles");
            } else if (primeiroLadoDoTriangulo != segundoLadoDoTriangulo && !segundoLadoDoTriangulo.equals(terceiroLadoDoTriangulo)) {
                System.out.print("É um triangulo escaleno");
           }
        } else {
            System.out.print("Com os valores impostos, a forma que você informou não é um triangulo.");
        }
    }
}
