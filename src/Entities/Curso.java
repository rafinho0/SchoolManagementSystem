package Entities;

public class Curso {
    private int id_Curso;
    private String nome;
    private int duracaoMeses;
    private Professor professor;

    // Constructor
    public Curso(int id_Curso, String nome, int duracaoMeses, Professor professor) {
        this.id_Curso = id_Curso;
        this.nome = nome;
        this.duracaoMeses = duracaoMeses;
        this.professor = professor;
    }

    // Getters
    public int getId_Curso() {
        return id_Curso;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }

    public Professor getProfessor() {
        return professor;
    }
}
