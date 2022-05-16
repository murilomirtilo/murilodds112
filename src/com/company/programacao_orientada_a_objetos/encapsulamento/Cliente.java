package com.company.programacao_orientada_a_objetos.encapsulamento;

public class Cliente {

    public static void main(String[] args) {
        Encapsulamento cliente = new Encapsulamento();

        cliente.setNome("Alexandre Afonso");
        cliente.setTelefone("27999990000");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("ÚLtimo nome: " + cliente.getUltimoNome());

    }
}
