package com.company.comecando.atividadeEstruturaDeDecisao;
import java.util.Scanner;


public class ProgamaSeForAvistaSeForAPrazo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite o tipo do pagamento, 1 para a vista, 2 para juros: ");
        Integer tipoPagamento = scanner.nextInt();
        if (tipoPagamento ==2) {
            Double aumento = valorProduto * 10 / 100;
            Double valorTotal = aumento + valorProduto;
            System.out.println("Valor total: " + valorTotal);
        } else {
            System.out.println("Valor total: " + valorProduto);
        }
            scanner.close();
    }
}
