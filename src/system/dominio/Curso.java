package system.dominio;

import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private String nivel;
    private int ch;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, String nivel, int ch, Professor professor){
        this.nome = nome;
        this.nivel = nivel;
        this.ch = ch;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public int getAlunosMatriculados() {
        return this.alunos.size();
    }

    public void realizarMatricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int getQuantidadeAlunos() {
        return this.alunos.size();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getNome() {
        return nome;
    }

    public String getNivel() {
        return nivel;
    }

    public int getCh() {
        return ch;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNomeProfessor() {
        return this.professor.getNome();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
}
