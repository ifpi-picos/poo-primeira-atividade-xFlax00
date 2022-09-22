import system.dominio.Aluno;
import system.dominio.Professor;
import system.dominio.Curso;
import system.dominio.Certificado;

import javax.swing.JOptionPane;
import java.time.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    static List<Curso> cursos = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        Professor p1 = new Professor("Bob", "Engenharia de Software");
        List<Integer> opcoes = new ArrayList<>();
        opcoes.add(6);
        opcoes.add(5);
        opcoes.add(4);
        opcoes.add(3);
        opcoes.add(2);
        opcoes.add(1);

        int opcaoSelecionada = 1;

        while(opcoes.get(opcaoSelecionada) != 6) {
            opcaoSelecionada = exibeMenu(opcoes);
            if(opcoes.get(opcaoSelecionada) == 1){
                cadastrarCurso(p1);
            }else if(opcoes.get(opcaoSelecionada) == 2){
                matricularALuno();
            }else if(opcoes.get(opcaoSelecionada) == 3){
                exibeCursos();
            }else if(opcoes.get(opcaoSelecionada) == 4){
                exibeAlunos();
            }
        }
        System.out.println(cursos.size());
    }

    private static void exibeAlunos() {

    }

    private static void exibeCursos() {
        String info = "";

        for(Curso curso : cursos) {
            info = info + curso.getNome() + " ch: " + curso.getCh() + "\n";
            for(Aluno aluno : curso.getAlunos()) {
                info = info + " - " + aluno.getNome() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, info, "Cursos", JOptionPane.PLAIN_MESSAGE);
    }

        // Curso c1 = new Curso("Análise e Desenvolvimento de Sistemas", "Superior", 200, p1);
        // Aluno a1 = new Aluno("João", "jão@gmail.com", 12345);
        // Certificado ct1 = new Certificado(c1, a1, LocalDate.now());

        // System.out.println("Nome do curso: " + c1.getNome() + ", Nome do professor: " + c1.getNomeProfessor());
        // System.out.println("Data de expedição certificado: " + ct1.getDataExpedicao());

        // for(int i = 0; i < 3; i++) {
        //     String nomeAluno = JOptionPane.showInputDialog(null, "Insira o nome do aluno: ");
        //     String emailAluno = JOptionPane.showInputDialog(null, "Insira o email do aluno: ");
            
        //     c1.realizarMatricula(new Aluno(nomeAluno, emailAluno, 1234));
        // }

        // JOptionPane.showMessageDialog(null,
        // "Curso: " + c1.getNome() + "\n Alunos: " + c1.getAlunos(), "Dados do curso", 1);
   


    
}
