package com.company.comecando.progamacao_orientada_a_objetos.MetodoInstancia;

public class Cliente {

    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;


    public String obterNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }


    public String obterDDD() {
        String ddd = telefone.substring(0,2);
        return ddd;
    }
}
