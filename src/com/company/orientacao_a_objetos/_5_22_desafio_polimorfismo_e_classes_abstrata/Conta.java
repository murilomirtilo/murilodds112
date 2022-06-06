package com.company.orientacao_a_objetos._5_22_desafio_polimorfismo_e_classes_abstrata;

import com.company.orientacao_a_objetos.Atividades.Exemplo.Desafio.Fornecedor;
import com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta;

import static com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.SituacaoConta.*;

public abstract class Conta {
    protected Cliente cliente;
    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected Fornecedor fornecedor;
    protected SituacaoConta situacaoConta;

    public Conta() {
        this.situacaoConta = PENDENTE;
    }

    public Conta(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }
    public abstract void exibirListagem();

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

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }
}