package com.company.orientacao_a_objetos.Exercicio2;

public class Caminhada {
    public void andar(Pessoa pessoa) {
        System.out.println("Eu \"" + pessoa.nome + "\""
                + " estou andando com o \"" + pessoa.cachorro.nome + "\"");
    }
}