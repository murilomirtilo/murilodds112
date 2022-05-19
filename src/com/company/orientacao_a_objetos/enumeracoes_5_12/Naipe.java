package com.company.orientacao_a_objetos.enumeracoes_5_12;

public enum Naipe {
    OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");
    private String cor;
    public String getCor() {
        return cor;
    }
    Naipe(String cor) {
        this.cor = cor;
    }

}
