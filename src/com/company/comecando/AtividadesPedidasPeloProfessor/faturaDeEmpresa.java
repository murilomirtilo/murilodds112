package com.company.comecando.AtividadesPedidasPeloProfessor;

import java.util.Scanner;

public class faturaDeEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o faturamento anual projetado: ");
        Double meta = scanner.nextDouble();
        System.out.print("Insira o faturamento anual real: ");
        Double faturamentoReal = scanner.nextDouble();
        System.out.print("Insira a média salarial: ");
        double mediaSalarial = scanner.nextDouble();
        Double premioFuncionario = null;
        Double oitentaPorcentodaMeta = mediaSalarial * 0.80;
        boolean faturamentoRealMaiorIgualQueMeta = faturamentoReal >= meta;
        if (faturamentoRealMaiorIgualQueMeta) {
            premioFuncionario = mediaSalarial;
            System.out.print("O premio salario é de " + premioFuncionario);
        } else if ((faturamentoReal < meta) && (faturamentoReal >= oitentaPorcentodaMeta)) {
            premioFuncionario = mediaSalarial * 0.80;
            System.out.print("O premio salarial é de " + premioFuncionario);
        }
    }
}
