package Entities;

public class Curso {
    private int id_Curso;
    private String nome;
    private int duracao;
    private Professor professor;

    // Constructor
    public Curso(int id_Curso, String nome, int duracao, Professor professor) {
        this.id_Curso = id_Curso;
        this.nome = nome;
        this.duracao = duracao;
        this.professor = professor;
    }

    // Getters
    public int getId_Curso() {
        return id_Curso;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public Professor getProfessor() {
        return professor;
    }
}
