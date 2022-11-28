package ClassesEmJava_2;

import java.util.ArrayList;

public class Aluno {

    String nome;
    String sobrenome;
    String matricula;
    String nomeCurso;
    ArrayList<String> disciplinasAprovadas = new ArrayList<>();
    ArrayList<Double> notasObtidas = new ArrayList<>();
    ArrayList<String> disciplinasAtuais = new ArrayList<>();

    Aluno() {}

    Aluno(String nome, String sobrenome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
    }

    void atualizarNome(String nome) {
        this.nome = nome;
    }

    void atualizarSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    void atualizarMatricula(String matricula) {
        this.matricula = matricula;
    }

    void atualizarCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

}

class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Fernando", "Lins", "123213", "Eng. Software");

        aluno.disciplinasAprovadas.add("Programação Orientada a Objetos");
        aluno.notasObtidas.add(10.0);

        aluno.disciplinasAtuais.add("POO");
        aluno.disciplinasAtuais.add("Inteligencia Artificial");

        aluno.disciplinasAprovadas.add(aluno.disciplinasAtuais.get(0));
        aluno.notasObtidas.add(8.5);
        aluno.disciplinasAtuais.remove(0);

        System.out.println("Quantidade de disciplinas aprovadas: " + aluno.disciplinasAprovadas.size());
        System.out.println("Quantidade de disciplinas atuais: " + aluno.disciplinasAtuais.size());

        System.out.println("Dados do aluno");
        System.out.println("Nome: " + aluno.nome + " " + aluno.sobrenome);
        System.out.println("Matricula: " + aluno.matricula);
        System.out.println("Curso: " + aluno.nomeCurso);

        double notaMedia = 0.0;

        for(double nota : aluno.notasObtidas) {
            notaMedia += nota;
        }

        notaMedia = notaMedia / aluno.notasObtidas.size();

        System.out.println("Nota média: " + notaMedia);
    }

}