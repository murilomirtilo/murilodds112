package com.company.orientacao_a_objetos.Desafio;

public class ContaPagar {
    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;

    public ContaPagar() {
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
    void pagar(){
        System.out.println("Pagando conta " + this.getDescricao() +
                        " no valor de " + this.getValor() +
                        " no forcendor de " + this.getFornecedor().getNome()
                );
    }
}
