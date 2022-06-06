package com.company.orientacao_a_objetos._5_22_desafio_polimorfismo_e_classes_abstrata;

import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.*;
import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.PAGA;

public class ContaPagar extends Conta {
    public void pagar() {
        if (this.situacaoConta == CANCELADA) {
            System.out.println("Não pode pagar " + "'" + getDescricao() + "'" + " conta já cancelada");
            return;
        }
        if (this.situacaoConta == PAGA) {
            System.out.println("Não pode pagar " + "'" + getDescricao() + "'" + " conta já paga");
            return;
        }
        situacaoConta = PENDENTE;
        System.out.println("Pagando conta " + this.getDescricao() + " no valor de "
                + this.getValor() + " e vencimento em " + this.getDataVencimento()
                + ".");
        this.situacaoConta = PAGA;
    }

    public void cancelar() {
            if (this.situacaoConta == CANCELADA) {
                System.out.println("CONTA "+ "'" + getDescricao() + "'" + " JA CANCELADA, IMPOSSIBILITADO DE CANCELAR");
            }
            if (this.situacaoConta == PAGA) {
                System.out.println("CONTA " + "'" + getDescricao() + "'" + " JA PAGA, IMPOSSIBILITADO DE CANCELAR");
            }
            this.situacaoConta = CANCELADA;
            System.out.println("Conta " + "'" + getDescricao() + "'" + " cancelada");

    }


    @Override
    public void exibirListagem() {

    }
}

