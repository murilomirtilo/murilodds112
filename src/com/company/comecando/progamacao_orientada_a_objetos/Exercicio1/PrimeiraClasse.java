package com.company.comecando.progamacao_orientada_a_objetos.Exercicio1;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "SmartPhone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 10;
        exibirQuantidadeEmEstoque(produto);
    }





    private static void exibirQuantidadeEmEstoque(Produto produto) {
        System.out.println("Quantidade em estoque do produto " + "'" + produto.nome + "'" +  " é de " + "'" + produto.quantidade + "'" + " unidade(s) ");
    }
}
