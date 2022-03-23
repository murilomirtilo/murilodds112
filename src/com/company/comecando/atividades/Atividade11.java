package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro número");
        Integer primeiro = scanner.nextInt();
        System.out.print("Digite seu segundo número");
        Integer segundo = scanner.nextInt();
        System.out.print("Digite seu terceiro número");
        Integer terceiro = scanner.nextInt();

        //O produto do dobro do primeiro com metade do segundo .

        Integer oProdutoDoDobroDoPrimeiroComMetadeDoSegundo = (primeiro * 2) * (segundo / 2);

        //a soma do triplo do primeiro com o terceiro.

        Integer aSomaDoTriploDoPrimeiroComOTerceiro = (primeiro * 3) + (terceiro);

       //o terceiro elevado ao cubo.

        Integer oTerceiroElevadoAoCubo = (terceiro * terceiro * terceiro);

        System.out.println("O produto do dobro do primeiro com metade do segundo:  " + oProdutoDoDobroDoPrimeiroComMetadeDoSegundo);
        System.out.println(("a soma do triplo do primeiro com o terceiro.     ") + aSomaDoTriploDoPrimeiroComOTerceiro);
        System.out.println("o terceiro elevado ao cubo:        " + oTerceiroElevadoAoCubo);


        scanner.close();
    }
}

.
