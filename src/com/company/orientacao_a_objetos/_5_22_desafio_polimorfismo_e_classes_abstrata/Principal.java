package com.company.orientacao_a_objetos._5_22_desafio_polimorfismo_e_classes_abstrata;

import com.company.orientacao_a_objetos.Atividades.Exemplo.Desafio.Fornecedor;
import com.company.orientacao_a_objetos._5_13_desafio_pacotes_e_enumeracoes.ContaPagar;


public class Principal {
    public static void main(String[] args) {
        // instanciando fornecedores
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");
        // instanciando clientes
        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");
        // instanciando contas a pagar
        ContaPagar contaPagar1 = new ContaPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);
        ContaPagar contaPagar2 = new ContaPagar("Compras do mês", 390d, "19/05/2012", mercado);
        // instanciando contas a receber
        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);
        ContaReceber contaReceber2 = new ContaReceber("Manutenção em sistema de conta online", 53200d, "13/05/2012", telecom);
        // exibe listagem de todas as contas com detalhamento
        RelatorioContas relatorio = new RelatorioContas();
        Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
        relatorio.exibirListagem(contas);
    }
}