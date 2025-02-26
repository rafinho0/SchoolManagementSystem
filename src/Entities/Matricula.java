package Entities;

public class Matricula {
    private Aluno aluno;
    private Curso curso;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    public void exibirMatricula() {
        System.out.println("Aluno: " + aluno.getId_Aluno() + ", " + aluno.getNome() +
                " | Curso: " + curso.getNome());
    }
}
