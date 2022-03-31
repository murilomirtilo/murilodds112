package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class Atividade11EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o salário do seu colaborador");
        double valorSalario = scanner.nextDouble();
        int salarioAte280 = 280;
        double aumentoAte280 = 0.20;
        int salarioAte700 = 700;
        double aumentoAte700 = 0.15;
        int salarioAte1500 = 1500;
        double aumentoAte1500 = 0.10;
        double aumentoApos1500 = 0.05;

        double aumentoSalario280 = valorSalario * aumentoAte280;
        double aumentoSalario700 = valorSalario * aumentoAte700;
        double aumentoSalario1500 = valorSalario * aumentoAte1500;
        double aumentoSalarioApos1500 = valorSalario * aumentoApos1500;

       // if valorSalario <= 280;









    }}
