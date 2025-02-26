package Entities;

public class Aluno extends Pessoa {
    private int id_Aluno;

    // Constructor
    public Aluno(String nome, int idade, int id_Aluno) {
        super(nome, idade);
        id_Aluno = id_Aluno;
    }

    // Getters
    public int getId_Aluno() {
        return id_Aluno;
    }
}
