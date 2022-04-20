package com.company.comecando.AtividadesPedidasPeloProfessor;
import java.util.Arrays;
import java.util.Scanner;
public class CincoatividadesImportantesDoDia {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] cincoTarefasImportantes = new String[5];
    for(int i = 0; i < cincoTarefasImportantes.length; i++) {
        System.out.print("Tarefa " + i + ":");
        cincoTarefasImportantes[i] = scanner.next(); }
    System.out.println(Arrays.toString(cincoTarefasImportantes));
    }
}
