package system.dominio;

import java.time.*;

public class Certificado {
    private Curso curso;
    private Aluno aluno;
    private LocalDate dataExpedicao;

    public Certificado(Curso curso, Aluno aluno, LocalDate dataExpedicao){
        this.curso = curso;
        this.aluno = aluno;
        this.dataExpedicao = dataExpedicao;
    }

    public Aluno getAluno() {

        return aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public LocalDate getDataExpedicao() {
        return dataExpedicao;
    }

    
}
