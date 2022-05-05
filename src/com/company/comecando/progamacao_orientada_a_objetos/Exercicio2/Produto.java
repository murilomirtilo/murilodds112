package com.company.comecando.progamacao_orientada_a_objetos.Exercicio2;

public class Produto {

    String nome;

    Double precoUnitario;

    Integer quantidade;

    public int estoque() {
        int estoque = quantidade;
        if (estoque > 10) {
            System.out.print("Necessário restocar");
        }
    }
}