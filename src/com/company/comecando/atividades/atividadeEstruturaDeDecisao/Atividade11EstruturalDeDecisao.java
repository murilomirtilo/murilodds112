package com.company.comecando.atividades.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade11EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o salário do seu colaborador ");
        double valorSalarioAntesDoAumento = scanner.nextDouble();
        int salarioAte280 = 280;
        double aumentoAte280 = 0.20;
        int salarioAte700 = 700;
        double aumentoAte700 = 0.15;
        int salarioAte1500 = 1500;
        double aumentoAte1500 = 0.10;
        double aumentoApos1500 = 0.05;
        double aumentoSalario280 = valorSalarioAntesDoAumento * aumentoAte280;
        double aumentoSalario700 = valorSalarioAntesDoAumento * aumentoAte700;
        double aumentoSalario1500 = valorSalarioAntesDoAumento * aumentoAte1500;
        double aumentoSalarioApos1500 = valorSalarioAntesDoAumento * aumentoApos1500;
        Double salarioComAumento = 0.0;
        if (valorSalarioAntesDoAumento <= 280) {
            salarioComAumento = valorSalarioAntesDoAumento + aumentoSalario280;
            System.out.println("O salário antes do reajuste era: " + valorSalarioAntesDoAumento);
            System.out.println("O percentual de aumento aplicado é: " + aumentoAte280);
            System.out.println("O valor do aumento é de: " + aumentoSalario280);
            System.out.println("O salário reajustado é de: "+ salarioComAumento);
        } else if (valorSalarioAntesDoAumento <= 700) {
            salarioComAumento = valorSalarioAntesDoAumento + aumentoSalario700;
            System.out.println("O salário antes do reajuste era: " + valorSalarioAntesDoAumento);
            System.out.println("O percentual de aumento aplicado é: " + aumentoAte700);
            System.out.println("O valor do aumento é de: " + aumentoSalario700);
            System.out.println("O salário reajustado é de: "+ salarioComAumento);
        } else if (valorSalarioAntesDoAumento <= 1500) {
            salarioComAumento = valorSalarioAntesDoAumento + aumentoSalario1500;
            System.out.println("O salário antes do reajuste era: " + valorSalarioAntesDoAumento);
            System.out.println("O percentual de aumento aplicado é: " + aumentoAte1500);
            System.out.println("O valor do aumento é de: " + aumentoSalario1500);
            System.out.println("O salário reajustado é de: "+ salarioComAumento);
        } else if (valorSalarioAntesDoAumento > 1500) {
            salarioComAumento = valorSalarioAntesDoAumento + aumentoSalario1500;
            System.out.println("O salário antes do reajuste era: " + valorSalarioAntesDoAumento);
            System.out.println("O percentual de aumento aplicado é: " + aumentoApos1500);
            System.out.println("O valor do aumento é de:  " + aumentoSalarioApos1500);
            System.out.println("O salário reajustado é de: "+ salarioComAumento);
        } else {
            System.out.print("Valor indefinido");
        }









    }}
