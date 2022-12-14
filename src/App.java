import system.dominio.Aluno;
import system.dominio.Professor;
import system.dominio.Curso;
import system.dominio.Certificado;

import javax.swing.JOptionPane;
import java.time.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    static List<Curso> cursos = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        Professor p1 = new Professor("Bob", "Engenharia de Software");
        List<Integer> opcoes = new ArrayList<>();
        opcoes.add(1);
        opcoes.add(2);
        opcoes.add(3);
        opcoes.add(4);
        opcoes.add(5);
        opcoes.add(6);

        int opcaoSelecionada = 1;

        while(opcoes.get(opcaoSelecionada) != 6) {
            opcaoSelecionada = exibeMenu(opcoes);
            if(opcoes.get(opcaoSelecionada) == 1){
                cadastrarCurso(p1);
            }else if(opcoes.get(opcaoSelecionada) == 2){
                matricularAluno();
            }else if(opcoes.get(opcaoSelecionada) == 3){
                exibeCursos();
            }else if(opcoes.get(opcaoSelecionada) == 4){
                exibeAlunos();
            }else if(opcoes.get(opcaoSelecionada) == 5){
                imprimeCertificado();
            }
        }
        System.out.println(cursos.size());
    }

    private static void exibeAlunos() {
        String alumn = "";
        for(Curso curso : cursos) {
            
            for(Aluno aluno : curso.getAlunos()) {
                alumn = alumn + " - " + aluno.getNome() + "\n" + "email: "+ aluno.getEmail() + ", curso: " + curso.getNome() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, alumn, "Alunos", JOptionPane.PLAIN_MESSAGE);

    }

    private static void exibeCursos() {
        String info = "";

        for(Curso curso : cursos) {
            info = info + curso.getNome() + " - CH: " + curso.getCh() + ", nível: " +  curso.getNivel() + "\n";
        }
        JOptionPane.showMessageDialog(null, info, "Cursos", JOptionPane.PLAIN_MESSAGE);
    }

    private static int exibeMenu(List<Integer> opcoes) {
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "1. Cadastrar curso \n2. Cadastrar aluno \n3. Exibir cursos \n4. Exibir alunos \n5. Certificado \n6. Encerrar",
        "Selecione", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
        optionsArray, null);

        return opcaoSelecionada;
    }

    private static void matricularAluno() {
        Random random = new Random();

        List<String> opcoes = new ArrayList<>();
        for (Curso curso : cursos) {
            opcoes.add(curso.getNome());
        }
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null,
                "Selecione o curso: ",
                "Cursos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);

        String nomeCursoSelecionado = opcoes.get(opcaoSelecionada);
        String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno");
        String emailAluno = JOptionPane.showInputDialog("Informe o email do aluno");
        int matricula = random.nextInt(100);

        Aluno novoAluno = new Aluno(nomeAluno, emailAluno, matricula);

        for (Curso curso : cursos) {
            if (curso.getNome().equals(nomeCursoSelecionado)) {
                curso.realizarMatricula(novoAluno);
                break;
            }
        }
    }

    private static void imprimeCertificado() {

        List<String> opcoes = new ArrayList<>();
        for (Curso curso : cursos) {
            opcoes.add(curso.getNome());
        }
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null,
                "Selecione o curso: ",
                "Cursos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);

        String nomeCursoSelecionado = opcoes.get(opcaoSelecionada);

        for(Curso curso : cursos) {
            if(curso.getNome() == nomeCursoSelecionado){
                List<String> newOpcoes = new ArrayList<>();
                for (Aluno aluno : curso.getAlunos()) {
                    newOpcoes.add(aluno.getNome());
                }
                Object[] newOptionsArray = newOpcoes.toArray();
                int newOpcaoSelecionada = JOptionPane.showOptionDialog(null,
                        "Selecione o Aluno: ",
                        "Aluno",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                        newOptionsArray, null);

                String nomeAlunoSelecionado = newOpcoes.get(newOpcaoSelecionada);

                for (Aluno aluno : curso.getAlunos()) {
                    if(aluno.getNome() == nomeAlunoSelecionado){
                        JOptionPane.showMessageDialog(null, "Nome: " + aluno.getNome() + ", Matricula: " + aluno.getMatricula() + ", Formação: " + curso.getNome() + ", Data: " + LocalDate.now() + ".");
                    }
                }
            }
            
        }
        
    }

    private static void cadastrarCurso(Professor p1) {
        String nomeCurso = JOptionPane.showInputDialog("Informe o nome do curso");
        String nivelCurso = JOptionPane.showInputDialog("Informe o nível do curso");
        String chCurso = JOptionPane.showInputDialog("Informe a CH do curso");
        Curso novoCurso = new Curso(nomeCurso, nivelCurso, Integer.parseInt(chCurso), p1);
        cursos.add(novoCurso);
    }
    
}