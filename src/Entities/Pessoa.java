package Entities;

abstract class Pessoa {
    private String nome;
    private int idade;

    // Constructor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
