package com.company.comecando.AtividadesPedidasPeloProfessor;

import java.util.Scanner;

public class ContaDoMês {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da conta de água: ");
        double contadeagua = scanner.nextDouble();
        System.out.print("Informe o valor da conta da luz: ");
        double contadeluz = scanner.nextDouble();
        System.out.print("Informe a fatura do telefone: ");
        double contadetelefone = scanner.nextDouble();
        System.out.print("Informe a mensalidade da escola do seu filho: ");
        double contadeescola = scanner.nextDouble();
        System.out.print("Informe o gasto com o supermercado");
        double contasupermercado = scanner.nextDouble();
        double contaFinal = contadeagua + contadeescola + contadeluz + contadetelefone + contasupermercado;
        System.out.print("O valor a ser pago no final do mês é: " + contaFinal);
    }
}
