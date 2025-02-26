import Entities.Aluno;
import Entities.Curso;
import Entities.Matricula;
import Entities.Professor;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Jose Aldo", 34, 01, "Matematica");
        Curso curso1 = new Curso(01, "Calculo 1", 3, prof1);
        Aluno aluno1 = new Aluno("Rafael Oliveira", 18, 01);
        Aluno aluno2 = new Aluno("Joao Carvalho", 24, 02);
        Matricula matricula1 = new Matricula(aluno1, curso1);
        Matricula matricula2 = new Matricula(aluno2, curso1);

        matricula1.exibirMatricula();
        matricula2.exibirMatricula();
    }
}