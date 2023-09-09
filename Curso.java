package ex2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }


    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

   
    public String getNome() {
        return nome;
    }

   
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

   
    public List<Aluno> getAlunos() {
        return alunos;
    }
}
