package com.company.orientacao_a_objetos._5_22_desafio_polimorfismo_e_classes_abstrata;


import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.CANCELADA;
import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.PENDENTE;

public class ContaReceber extends Conta {


    public ContaReceber(String descricao, Double valor, String dataVencimento, Cliente cliente) {
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
        super.cliente = cliente;
    }

    public ContaReceber() {

    }

    @Override
    public void exibirListagem() {

    }

    public void setCliente(Cliente cliente) {

    }

    public void cancelar() {
        if (super.getValor() > 50000) {
            System.out.println("Valor acima de 50k, impossivel cancelar");
            super.situacaoConta = PENDENTE;
        }
    }

    public void receber() {
        if (this.situacaoConta == CANCELADA) {
            System.out.println("Não pode receber uma conta que está cancelada: "
                    + this.getDescricao() + ".");            return;
        }
        if (this.situacaoConta == com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.PAGA) {
            System.out.println("Não pode pagar uma conta que já está paga: "
                    + this.getDescricao() + ".");
            return;
        }
        com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta situacaoConta = PENDENTE;
        System.out.println("Pagando conta " + this.getDescricao() + " no valor de "
                + this.getValor() + " e vencimento em " + this.getDataVencimento()
                 + ".");
        this.situacaoConta = com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.PAGA;

    }
}