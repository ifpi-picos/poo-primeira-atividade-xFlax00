package system.dominio;

public class Aluno {
    private String nome;
    private String email;
    private int matricula;


    public Aluno(String nome, String email, int matricula){
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;

    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + "]";
    }

    public String getEmail() {
        return email;
    }

    public int getMatricula() {
        return matricula;
    }
    
}
