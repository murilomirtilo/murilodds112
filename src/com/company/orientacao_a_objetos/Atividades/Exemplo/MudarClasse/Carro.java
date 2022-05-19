package com.company.orientacao_a_objetos.Atividades.Exemplo.MudarClasse;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Propietario dono;
    void alterarModelo(String modelo){
        if (modelo != null) {
            this.modelo = modelo;
        }
    }
}
