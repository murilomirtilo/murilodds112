package com.company.comecando.progamacao_orientada_a_objetos.Exercicio3;

import org.omg.CORBA.Object;

import java.util.Objects;

public class Encapsulamento {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCodigo("Sanduiche");
        cliente.setSubtotal(100);
        cliente.setDesconto(10);
        cliente.mostrarComanda(cliente);
    }
}