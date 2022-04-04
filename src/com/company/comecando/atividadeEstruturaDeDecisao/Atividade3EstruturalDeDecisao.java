package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Objects;
import java.util.Scanner;

public class Atividade3EstruturalDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INFORME SEU SEXO");
        System.out.print("M para Masculino e F para Feminino, qualquer outra s para indefinido ");
        String letra = scanner.nextLine();
        if (Objects.equals(letra, "M") || (Objects.equals(letra, "m"))){
            System.out.print("Masculino");
        } else if (Objects.equals(letra, "F") || (Objects.equals(letra, "f"))) {
            System.out.print("Feminino");
        } else System.out.print("Indefinido");
    }}
