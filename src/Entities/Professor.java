package Entities;

public class Professor extends Pessoa{
    private int id_Professor;
    private String materia;

    // Constructor
    public Professor(String nome, int idade, int id_Professor, String materia) {
        super(nome, idade);
        this.id_Professor = id_Professor;
        this.materia = materia;
    }

    // Getterrs
    public int getId_Professor() {
        return id_Professor;
    }

    public String getMateria() {
        return materia;
    }
}
