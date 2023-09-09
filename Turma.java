package ex2;
import java.util.ArrayList;
import java.util.List;

public class Turma {
	private Professor professor;
	private List<Aluno> alunos;

public Turma(Professor professor) {
	this.professor = professor;
	this.alunos = new ArrayList<>();
	
}



public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
}

public Professor getProfessor() {
    return professor;
}


public List<Aluno> getAlunos() {
    return alunos;
}
}
	
