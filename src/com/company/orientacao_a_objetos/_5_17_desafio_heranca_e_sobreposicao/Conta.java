package com.company.orientacao_a_objetos._5_17_desafio_heranca_e_sobreposicao;

import com.company.orientacao_a_objetos.Atividades.Exemplo.Desafio.Fornecedor;
import com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta;

import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.CANCELADA;
import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.PAGA;
import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.PENDENTE;

public class Conta {
    protected Cliente cliente;
    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected com.company.orientacao_a_objetos.Atividades.Exemplo.Desafio.Fornecedor fornecedor;
    protected com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta situacaoConta;

    public Conta() {
        this.situacaoConta = PENDENTE;
    }

    public Conta(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public void pagar() {
        if (this.situacaoConta == CANCELADA) {
            System.out.println("Não pode pagar " + "'" + getDescricao() + "'" + " conta já cancelada");
            return;
        }
        if (this.situacaoConta == PAGA) {
            System.out.println("Não pode pagar " + "'" + getDescricao() + "'" + " conta já paga");
            return;
        }
        com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta situacaoConta = PENDENTE;
        System.out.println("Conta paga " + "'" + getDescricao() + "'");
        this.situacaoConta = PAGA;

    }

    public void cancelar(){
        if (this.situacaoConta == CANCELADA) {
            System.out.println("CONTA "+ "'" + getDescricao() + "'" + " JA CANCELADA, IMPOSSIBILITADO DE CANCELAR");
        }
        if (this.situacaoConta == PAGA) {
            System.out.println("CONTA " + "'" + getDescricao() + "'" + " JA PAGA, IMPOSSIBILITADO DE CANCELAR");
        }
        this.situacaoConta = CANCELADA;
        System.out.println("Conta " + "'" + getDescricao() + "'" + " cancelada");
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public com.company.orientacao_a_objetos.Atividades.Exemplo.Desafio.Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
}
