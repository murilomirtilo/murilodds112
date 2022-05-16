package com.company.comecando.leitura_e_escrita_de_dados_em_arquivos.leitura_e_escrita_de_dados_em_arquivos.Exercicio2;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get("C:\\Users\\Administrador\\Desktop\\arquivo.txt");
        ArrayList<String> linhas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (x >= 0) {
            x++;
            System.out.println("Jogador " + x + ": ");
            String nome = scanner.nextLine();
            if (Objects.equals(nome, "X")) {
                break;
            }
            linhas.add(nome);
        }
        for (int i = 0; i < linhas.size(); i++) {
            String nome = linhas.get(i);
            System.out.println("Jogador " + i + ": " + nome);
        }
    }
}
