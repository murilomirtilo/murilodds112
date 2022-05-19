package com.company.orientacao_a_objetos.Atividades.Exemplo.DesafioStaticFinal;
public class MatematicaUtil {
    public static final double PI = 3.14;
    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }
    public static Double calcularAreaCirculo(Double raio) {
        return (raio * raio) * PI;
    }
}
