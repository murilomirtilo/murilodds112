package com.company.orientacao_a_objetos.Exemplo;

public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.modelo = "Palio";
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "João";
        meuCarro.dono.bairro = "Centro";
    }

}
