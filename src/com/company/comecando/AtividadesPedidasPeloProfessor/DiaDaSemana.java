package com.company.comecando.AtividadesPedidasPeloProfessor;
import java.util.Scanner;
public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o dia da semana");
        System.out.print("1 para domingo, 2 para segunda, 3 para terça, 4 para quarta, 5 para quinta, 6 para sexta, 7 para sábado ");
        Byte numeroDoDiaDaSemana = scanner.nextByte();
        String diaDaSemana = null;
        switch (numeroDoDiaDaSemana) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                System.err.println("Digite um número válido!");
                System.exit(1);
        }
    System.out.print("O dia da semana é " + diaDaSemana);
    }
}
