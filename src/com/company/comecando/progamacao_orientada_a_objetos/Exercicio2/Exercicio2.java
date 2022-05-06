package com.company.comecando.progamacao_orientada_a_objetos.Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "SmartPhone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 12;
        produto.quantidadeMinimaEstoque = 10;
        produto.verificarEstoque(produto);
    }
}



