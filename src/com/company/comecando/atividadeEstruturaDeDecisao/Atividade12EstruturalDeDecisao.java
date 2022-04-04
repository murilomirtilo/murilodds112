package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade12EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas por mês ");
        int horasTrabalhadasPorMes = scanner.nextInt();
        System.out.print("Informe quanto você ganha por hora trabalhada ");
        double quantoGanhaPorHoraTrabalhada = scanner.nextDouble();
        double salarioBruto = horasTrabalhadasPorMes * quantoGanhaPorHoraTrabalhada;
        double valorDaTaxaDoSindicato = 0.03;
        double valorDaTaxaDoFGTS = 0.11;
        double valorImpostoDeRenda = 0.00;
        double valorDaTaxaDoINSS = 0.10;
        if (salarioBruto <= 1500) {
            valorImpostoDeRenda = 0.05;
        } else if (salarioBruto <= 2500) {
            valorImpostoDeRenda = 0.10;
        } else if (salarioBruto > 2500) {
            valorImpostoDeRenda = 0.20;
        }
        double descontoDoINSS = salarioBruto * valorDaTaxaDoINSS;
        double descontoDoImpostoDeRenda = salarioBruto * valorImpostoDeRenda;
        double descontoDoSindicato = salarioBruto * valorDaTaxaDoSindicato;
        double descontoDoFGTS = salarioBruto * valorDaTaxaDoFGTS;
        double salarioLiquido = salarioBruto - descontoDoImpostoDeRenda - descontoDoINSS;
        double totalDeDescontos = descontoDoImpostoDeRenda + descontoDoINSS;
        System.out.println("Salário Bruto           : R$" + salarioBruto);
        System.out.println("-  Imposto de renda     : R$" + descontoDoImpostoDeRenda);
        System.out.println("-  INSS                 : R$" + descontoDoINSS);
        System.out.println("FGTS                    : R$" + descontoDoFGTS);
        System.out.println("Total de desconto       : R$" + totalDeDescontos);
        System.out.println("---------------------------------------------");
        System.out.println("Salário liquído         : R$" + salarioLiquido);
    }
}
