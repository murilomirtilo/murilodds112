package com.company.comecando.progamacao_orientada_a_objetos.MetodoInstancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Monicous";
        cliente.ultimoNome = "Rossa";
        cliente.telefone =  "2740028922";
        cliente.email = "MonicaRossaNelas@gmail.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "Murilous";
        cliente2.ultimoNome = "Henricous";
        cliente2.telefone = "279999356359";

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", " + cliente.obterDDD());
        System.out.println("Nome cliente dois: " + cliente2.obterNomeCompleto() + ", " + cliente2.obterDDD());
    }
}
