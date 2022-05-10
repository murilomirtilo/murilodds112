package com.company.comecando.leitura_e_escrita_de_dados_em_arquivos.leitura_e_escrita_de_dados_em_arquivos.Exercicio1;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();
        int i = 0;
        while (i >= 0) {
            i++;
            System.out.println("Jogador " + i + ": ");
            String nome = scanner.nextLine();
            linhas.add(nome);
            if (Objects.equals(nome, "x"))
            {
                break;
            }

        }
        Path arquivo = Paths.get("C:\\Users\\Aluno\\Desktop\\exercicio.txt");
        Files.write(arquivo, linhas);
    }
}

