package com.company.comecando.progamacao_orientada_a_objetos.ClasseInstancia;

public class ClasseInstancia {
    public static void main(String[] args) {
        System.out.println("Quantidade minima de estoque: " + Produto.quantidadeMinimaEstoque);

        Produto xicara = new Produto();
        xicara.nome = "Xicara";
        Impressao.informacao("Produto 1: " + xicara.nome);

        Produto bonecaHelloKitty = new Produto();
        bonecaHelloKitty.nome = "Boneca Hello Kitty";
        Impressao.informacao("Produto 2: " + bonecaHelloKitty.nome);
    }
}
