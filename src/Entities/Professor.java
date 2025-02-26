package Entities;

public class Professor extends Pessoa{
    private int Id_Professor;
    private String Materia;

    public Professor(String nome, int idade, int id_Professor, String materia) {
        super(nome, idade);
        Id_Professor = id_Professor;
        Materia = materia;
    }

    public int getId_Professor() {
        return Id_Professor;
    }

    public String getMateria() {
        return Materia;
    }
}
