package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //valores fixos

        byte quantidadeDeLitrosPorMetros = 6;
        byte quantidadeDeLataporTinta = 18;
        byte preçoDaLata = 80;
        double quantidadeDeTintaporGalao = 3.6;
        int preçoDoGalao = 25;

        System.out.print("Qual o tamanho, em metros quadrados, da área desejada:  ");
            double tamanhoEmMetrosQuadrados = scanner.nextDouble();


        System.out.print("Escolha 1 para latas, 2 para galões e 3 para ambos misturados ");
            int escolha = scanner.nextInt();

        //calculo para lata

        double coberturaDaTintaEmLata = tamanhoEmMetrosQuadrados / quantidadeDeLitrosPorMetros;
        double quantidadeDeLata = coberturaDaTintaEmLata / quantidadeDeLataporTinta;
        double quantidadePagaPorLata = quantidadeDeLata * preçoDaLata;

        //calculo para galão

        double coberturaDaTintaEmGalao = tamanhoEmMetrosQuadrados / quantidadeDeTintaporGalao;
        double quantidadeDeMetrosQuadradosQueUmGalaoPinta = quantidadeDeTintaporGalao * quantidadeDeLitrosPorMetros;
        double quantidadeDeGalao = tamanhoEmMetrosQuadrados / quantidadeDeMetrosQuadradosQueUmGalaoPinta;
        double quantidadePagaPorGalao = quantidadeDeGalao * preçoDoGalao;

        //calculo arredondademento galao

        double quantidadePagaPorLataArredondado = Math.ceil(quantidadePagaPorLata);
        double quantidadePagaPorGalaoArrendado = Math.ceil(quantidadePagaPorGalao);

        //calculo para misturado

        double misturado = coberturaDaTintaEmGalao + coberturaDaTintaEmLata;
        double misturadoLata =  coberturaDaTintaEmLata / misturado;
        double misturadoLataArredondado = Math.ceil(misturadoLata);
        double restoDivisao = misturado % misturadoLata;
        double misturadoGalao = restoDivisao / quantidadePagaPorGalaoArrendado;
        double misturadoGalaoArredondado = Math.ceil(misturadoGalao);

        if (escolha==1){

        } else if (escolha ==2){
            System.out.println("O preço pago em galão é: " + quantidadePagaPorGalaoArrendado);
            System.out.println("A quantidade de galão é: " + quantidadeDeGalao);
        } else if (escolha==3){
            System.out.println("A quantidade de lata usada quando se mistura os dois é: " + misturadoLataArredondado);
            System.out.println("A quantidade de galão usada quando se mistura os dois é: " + misturadoGalaoArredondado);
        }
        scanner.close();
    }}
