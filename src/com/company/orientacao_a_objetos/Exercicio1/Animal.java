package com.company.orientacao_a_objetos.Exercicio1;

public class Animal {

    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    static void mostrarFicha(Animal qualCachorro) {
        System.out.println("A raça é: " + qualCachorro.raca +
                "\nO nome é: " + qualCachorro.nome +
                "\nA idade é: " + qualCachorro.idade +
                "\nO sexo é: " + qualCachorro.sexo +
                "\n");
    }
    String raca;
    String sexo;
    Integer idade;

}
