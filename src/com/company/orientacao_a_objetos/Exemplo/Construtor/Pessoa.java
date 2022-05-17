package com.company.orientacao_a_objetos.Exemplo.Construtor;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome) {
        this.nome = nome;

    }
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
}
