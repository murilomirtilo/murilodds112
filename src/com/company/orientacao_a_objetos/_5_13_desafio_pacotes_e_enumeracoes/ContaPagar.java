package com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes;

import com.company.orientacao_a_objetos.Atividades.Exemplo.Desafio.Fornecedor;

import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.*;

public class ContaPagar {
    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public ContaPagar() {
    }


    SituacaoConta situacaoConta;


    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void cancelar() {
        if (this.situacaoConta == CANCELADA) {
            System.out.println("CONTA JA CANCELADA, IMPOSSIBILITADO DE CANCELAR");
        }
        if (this.situacaoConta == PAGA) {
            System.out.println("CONTA JA PAGA, IMPOSSIBILITADO DE CANCELAR");
        }
        this.situacaoConta = CANCELADA;
        System.out.println("Conta cancelada");
    }
    public void pagar() {
        if (this.situacaoConta == CANCELADA) {
            System.out.println("Não pode pagar, conta já cancelada");
            return;
        }
        if (this.situacaoConta == PAGA) {
            System.out.println("Não pode pagar, conta já paga");
            return;
        }
        SituacaoConta situacaoConta = PENDENTE;
        System.out.println("Conta Paga");
        this.situacaoConta = PAGA;

    }
}
