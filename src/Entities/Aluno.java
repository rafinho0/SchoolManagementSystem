package Entities;

public class Aluno extends Pessoa {
    private int Id_Aluno;

    public Aluno(String nome, int idade, int id_Aluno) {
        super(nome, idade);
        Id_Aluno = id_Aluno;
    }

    public int getId_Aluno() {
        return Id_Aluno;
    }
}
