package system.dominio;

import java.util.Date;

public class Certificado {
    private Curso curso;
    private Aluno aluno;
    private Date dataExpedicao;

    public Certificado(Curso curso, Aluno aluno, Date dataExpedicao){
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

    public Date getDataExpedicao() {
        return dataExpedicao;
    }
}
