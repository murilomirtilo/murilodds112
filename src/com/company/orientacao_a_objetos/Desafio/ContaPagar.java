package com.company.orientacao_a_objetos.Desafio;

public class ContaPagar {
    String descricao;
    Double valor;
    String DataVencimento;
    String fornecedor;

    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
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
        return DataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        DataVencimento = dataVencimento;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContaPagar() {
    }

    public void pagar() {
        System.out.println("\n A conta é: " + this.fornecedor + "\n Com o valor de: " + this.valor + "\n E a data de Vencimento de: " + this.DataVencimento);

    }
}
