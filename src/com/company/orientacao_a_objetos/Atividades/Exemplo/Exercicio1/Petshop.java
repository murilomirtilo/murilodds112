package com.company.orientacao_a_objetos.Atividades.Exemplo.Exercicio1;

import static com.company.orientacao_a_objetos.Atividades.Exemplo.Exercicio1.Animal.mostrarFicha;

public class Petshop {
    public static void main(String[] args) {

        Animal cachorro = new Animal();
        cachorro.setRaca("Collie");
        cachorro.setIdade(2);
        cachorro.setSexo("Fêmea");
        cachorro.setNome("Laika");
        mostrarFicha(cachorro);

        Animal cachorro2 = new Animal();
        cachorro2.setRaca("Pug");
        cachorro2.setIdade(6);
        cachorro2.setSexo("Macho");
        cachorro2.setNome("Romeu");
        mostrarFicha(cachorro2);

    }
}

