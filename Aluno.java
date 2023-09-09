package ex2;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private Curso curso;

    public Aluno(String nome,Curso curso) {
        super(nome);
        this.curso = curso;
        curso.adicionarAluno(this);
    }


    public Curso getCurso() {
        return curso;
    }
}
