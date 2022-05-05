package com.company.comecando.progamacao_orientada_a_objetos.Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "SmartPhone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 12;
        verificarPrecisaReporEstoque(produto);
        exibirQuantidadeEmEstoque(produto);
    }
    private static void verificarPrecisaReporEstoque(Produto produto) {
        boolean precisaDeReporEstoque = produto.quantidade < 10;
        if (precisaDeReporEstoque) {
            System.out.println("É necessário repor o estoque.");
            System.exit(1);
        }
    }
    private static void exibirQuantidadeEmEstoque(Produto produto) {
        System.out.println("Quantidade em estoque do produto " + "'" + produto.nome + "'" +  " é de " + "'" + produto.quantidade + "'" + " unidade(s) ");
    }
}
