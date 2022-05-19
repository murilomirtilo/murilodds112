package com.company.orientacao_a_objetos.modificador_de_acesso_default_5_9;

public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Marley");
        DonoCachorro donoCachorro = new DonoCachorro();
        donoCachorro.ensinarCachorroSentar(cachorro);

    }
}
