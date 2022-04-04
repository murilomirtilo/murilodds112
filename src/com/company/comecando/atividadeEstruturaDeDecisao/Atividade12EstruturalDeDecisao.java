package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade12EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas por mês ");
        Integer horasTrabalhadasPorMes = scanner.nextInt();
        System.out.print("Informe quanto você ganha por hora trabalhada ")
        Double quantoGanhaPorHoraTrabalhada = scanner.nextDouble();

        Double salarioBruto = horasTrabalhadasPorMes * quantoGanhaPorHoraTrabalhada;



    }}
