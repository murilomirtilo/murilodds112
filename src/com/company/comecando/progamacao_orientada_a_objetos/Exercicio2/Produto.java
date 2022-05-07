package com.company.comecando.progamacao_orientada_a_objetos.Exercicio2;

public class Produto {

    static int quantidadeMinimaEstoque = 10;
    String nome;
    Double precoUnitario;
    Integer quantidade;

    public Boolean verificarEstoque (Produto produto) {
        if (produto.quantidade > produto.quantidadeMinimaEstoque) {
            System.out.print("Não precisa repor estoque");
        } else {
            System.out.print("Precisa repor estoque");
        }
        return null;
    }
}
