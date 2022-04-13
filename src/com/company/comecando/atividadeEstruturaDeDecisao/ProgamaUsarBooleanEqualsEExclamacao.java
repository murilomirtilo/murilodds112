package com.company.comecando.atividadeEstruturaDeDecisao;

import java.util.Scanner;

public class ProgamaUsarBooleanEqualsEExclamacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto ");
        Double valorDoProduto = scanner.nextDouble();
        System.out.println("Digite o tipo de pagamento ");
        System.out.println("1 para a vista");
        System.out.println("2 para a juros");
        Integer escolhaDePagamento = scanner.nextInt();
        Boolean aVista = escolhaDePagamento.equals(1);
        Double juros = 0.0;
        if (!aVista) {
            juros = 10.0;
        }
        Double acrescimo = valorDoProduto * juros / 100;
        Double valorDoProdutoFinal = valorDoProduto + acrescimo;
        System.out.print("O valor final do produto é: " + valorDoProdutoFinal);
        scanner.close();
    }
}
