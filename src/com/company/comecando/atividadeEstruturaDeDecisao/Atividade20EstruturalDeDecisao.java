package com.company.comecando.atividadeEstruturaDeDecisao;
import java.util.Scanner;
public class Atividade20EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a primeira nota: ");
        Double primeiraNota = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        Double segundaNota = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        Double terceiraNota = scanner.nextDouble();
        double mediasDasNotas = (primeiraNota + segundaNota + terceiraNota) / 3;
        if (mediasDasNotas == 10) {
            System.out.print("Aluno aprovado com disntinção.");
        } else if ((mediasDasNotas > 7) && (mediasDasNotas < 10)) {
            System.out.print("Aluno aprovado.");
        } else if (mediasDasNotas < 7 ) {
            System.out.print("Aluno reprovado.");
        } else {
            System.out.print("Nota invalida");
        }
    }
}
