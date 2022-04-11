package com.company.comecando.AtividadesPedidasPeloProfessor;

import java.util.Scanner;

public class AtividadeFretes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do seu produto, sabendo que se o valor for acima de R$100, a frete será grátis: ");
        double valorDoProduto = scanner.nextDouble();
        boolean valorDoProdutoComFrete = valorDoProduto < 100;
        Byte precoDaFrete = null;
        if (valorDoProdutoComFrete) {
            precoDaFrete = 15;
        } else {
            precoDaFrete = 0;
        }
        Double valorDoProdutoFinal = valorDoProduto + precoDaFrete;
        System.out.print("O custo final do produto é: " + valorDoProdutoFinal);
    }
}
