package com.company.orientacao_a_objetos.Exemplo.MudarClasse;

public class ExemploThis {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";
        System.out.println("Modelo antes " + carro.modelo);
        carro.alterarModelo("Civic");
    }}
