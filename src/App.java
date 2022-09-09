import system.dominio.Aluno;
import system.dominio.Professor;
import system.dominio.Curso;
import system.dominio.Certificado;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Professor p1 = new Professor("Bob", "Engenharia de Software");
        Curso c1 = new Curso("Análise e Desenvolvimento de Sistemas", "Superior", 200, p1);

        System.out.println("Nome do curso: " + c1.getNome() + ", Nome do professor: " + c1.getNomeProfessor());

        for(int i = 0; i < 3; i++) {
            String nomeAluno = JOptionPane.showInputDialog(null, "Insira o nome do aluno: ");
            String emailAluno = JOptionPane.showInputDialog(null, "Insira o email do aluno: ");
            
            c1.realizarMatricula(new Aluno(nomeAluno, emailAluno, 1234));
        }

        JOptionPane.showMessageDialog(null,
        "Curso: " + c1.getNome() + "\n Alunos: " + c1.getAlunos(), "Dados do curso", 1);
    }


    
}
