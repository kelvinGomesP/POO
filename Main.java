package ex2;

public class Main {
    public static void main(String[] args) {
        // Criação de Cursos
        Curso cursoTI = new Curso("TI");
        Curso cursoADM = new Curso("ADM");

        // Criação de Disciplinas
        Disciplina pooTI = new Disciplina("POO do curso de TI");
        Disciplina estruturaDeDadosTI = new Disciplina("Estrutura de Dados do curso de TI");
        Disciplina biADM = new Disciplina("BI do curso de ADM");

        // Criação de Professores
        Professor mia = new Professor("Mia", "POO");
        Professor saulo = new Professor("Saulo", "Estrutura de Dados");
        Professor paula = new Professor("Paula", "BI");

        // Criação de Alunos
        Aluno alfredo = new Aluno("Alfredo", "TI", "MatriculaAlfredo");
        Aluno peterson = new Aluno("Peterson", "ADM", "MatriculaPeterson");
        Aluno wendel = new Aluno("Wendel", "TI", "MatriculaWendel");
        Aluno ian = new Aluno("Ian", "ADM", "MatriculaIan");
        Aluno debra = new Aluno("Debra", "TI", "MatriculaDebra");
        Aluno luana = new Aluno("Luana", "ADM", "MatriculaLuana");
        Aluno bruno = new Aluno("Bruno", "TI", "MatriculaBruno");
        Aluno romeu = new Aluno("Romeu", "ADM", "MatriculaRomeu");
        Aluno julieta = new Aluno("Julieta", "TI", "MatriculaJulieta");
        Aluno maria = new Aluno("Maria", "ADM", "MatriculaMaria");
        Aluno capitú = new Aluno("Capitú", "TI", "MatriculaCapitu");
        Aluno bentinho = new Aluno("Bentinho", "ADM", "MatriculaBentinho");
        Aluno amelia = new Aluno("Amélia", "TI", "MatriculaAmelia");

        // Vinculando Professores às Disciplinas
        mia.adicionarDisciplina(pooTI);
        saulo.adicionarDisciplina(estruturaDeDadosTI);
        paula.adicionarDisciplina(biADM);

        // Exibindo informações
        System.out.println("Alunos vinculados aos cursos:");
        System.out.println("Curso TI:");
        for (Aluno aluno : cursoTI.getAlunos()) {
            System.out.println(aluno.getNome());
        }

        System.out.println("\nCurso ADM:");
        for (Aluno aluno : cursoADM.getAlunos()) {
            System.out.println(aluno.getNome());
        }

        System.out.println("\nProfessores vinculados às disciplinas:");
        for (Disciplina disciplina : mia.getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome() + ", Professor: " + mia.getNome());
        }
        for (Disciplina disciplina : saulo.getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome() + ", Professor: " + saulo.getNome());
        }
        for (Disciplina disciplina : paula.getDisciplinas()) {
            System.out.println("Disciplina: " + disciplina.getNome() + ", Professor: " + paula.getNome());
        }
    }
}
