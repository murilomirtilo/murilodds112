package com.company.comecando.progamacao_orientada_a_objetos.encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Monicous HAHAHA" +
                "");
        cliente.setTelefone("27999990000");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("ÚLtimo nome: " + cliente.getUltimoNome());

    }
}