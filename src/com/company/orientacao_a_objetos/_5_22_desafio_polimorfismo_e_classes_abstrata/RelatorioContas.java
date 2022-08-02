package com.company.orientacao_a_objetos._5_22_desafio_polimorfismo_e_classes_abstrata;

public class RelatorioContas {

    //Conta[] contas = {};

    public void exibirListagem(Conta[] conta) {

        for (int contador = 1; contador < conta.length; contador++) {
            System.out.println("A descrição é: " + conta[contador].getDescricao());
            System.out.println("A data de vencimento é:" + conta[contador].getDataVencimento());
            System.out.println("O valor é de: " + conta[contador].getValor());
            System.out.println("");
        }
    }
}
