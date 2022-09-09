package system.dominio;

public class Professor {
    private String nome;
    private String formacao;

    public Professor(String nome, String formacao){
        this.nome = nome;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.nome.equals(((Professor) obj).nome);
    }
}
