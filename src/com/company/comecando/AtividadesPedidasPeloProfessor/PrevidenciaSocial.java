package com.company.comecando.AtividadesPedidasPeloProfessor;
import java.util.Scanner;
public class PrevidenciaSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte idadeMinimaParaAposentar = 55;
        byte tempoDeTrabalhoMinimo = 25;
        System.out.print("Informe o tempo de trabalho: ");
        int valorTempoDeTrabalho = scanner.nextInt();
        System.out.print("Informe a sua idade: ");
        int valorIdade = scanner.nextInt();
        if ((valorTempoDeTrabalho > tempoDeTrabalhoMinimo) && (valorIdade > idadeMinimaParaAposentar)) {
            System.out.print("Apto para se aposentar.");
        } else {
            System.out.print("Não é apto para se aposentar.");
        }
    }}
