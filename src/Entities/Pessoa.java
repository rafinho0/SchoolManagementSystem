package Entities;

abstract class Pessoa {
    private String Nome;
    private int Idade;

    public Pessoa(String nome, int idade) {
    }

    public String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }
}
