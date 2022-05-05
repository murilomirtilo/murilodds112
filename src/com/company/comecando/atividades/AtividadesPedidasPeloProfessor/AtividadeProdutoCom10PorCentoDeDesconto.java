package com.company.comecando.atividades.AtividadesPedidasPeloProfessor;

import java.util.Scanner;

public class AtividadeProdutoCom10PorCentoDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nossa loja oferece 10% de desconto em comprar a partir de 10 unidades.");
        System.out.print("Infore a quantidade do produto: ");
        Integer quantidadeDoProduto = scanner.nextInt();
        System.out.print("Informe o valor do produto: ");
        Double valorDoProduto = scanner.nextDouble();
        Double subtotal = quantidadeDoProduto * valorDoProduto;
        Byte valorDivisaoFormula = 100;
        Double desconto = 0.0;
        Double produtoComDesconto;
        Boolean descontoAplicado = quantidadeDoProduto >= 10;
        if (descontoAplicado) {
            desconto = 0.90;
            produtoComDesconto = subtotal * desconto;
            System.out.print("O preço da sua compra, com desconto é : R$"+ produtoComDesconto);
        } else {
            System.out.print("O preço da sua compra, sem desconto é: R$" + subtotal);
        }
        scanner.close();
    }
}
