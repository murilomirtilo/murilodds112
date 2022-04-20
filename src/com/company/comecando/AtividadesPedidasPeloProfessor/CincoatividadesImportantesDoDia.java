package com.company.comecando.AtividadesPedidasPeloProfessor;
import java.util.Arrays;
import java.util.Scanner;
public class CincoatividadesImportantesDoDia {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] cincoTarefasImportantes = new String[5];
    System.out.print("Informe as 1ª de 5 tarefas importantes no seu dia: ");
    cincoTarefasImportantes [0] = scanner.nextLine();
    System.out.print("Informe as 2ª de 5 tarefas importantes no seu dia: ");
    cincoTarefasImportantes [1] = scanner.nextLine();
    System.out.print("Informe as 3ª de 5 tarefas importantes no seu dia: ");
    cincoTarefasImportantes [2] = scanner.nextLine();
    System.out.print("Informe as 4ª de 5 tarefas importantes no seu dia: ");
    cincoTarefasImportantes [3] = scanner.nextLine();
    System.out.print("Informe as 5ª de 5 tarefas importantes no seu dia: ");
    cincoTarefasImportantes [4] = scanner.nextLine();
    System.out.println(Arrays.toString(cincoTarefasImportantes));
    }
}
