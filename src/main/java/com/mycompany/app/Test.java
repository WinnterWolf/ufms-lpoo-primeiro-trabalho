package com.mycompany.app;

import com.mycompany.app.models.Aluno;
import com.mycompany.app.models.Professor;
import com.mycompany.app.models.Disciplina;

import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dados;

        System.out.printf("Digite o RGA e nome do primeiro aluno: ");
        dados = sc.nextLine();
        Aluno aluno1 = new Aluno(dados);


        System.out.printf("Digite o RGA e nome do segundo aluno: ");
        dados = sc.nextLine();
        Aluno aluno2 = new Aluno(dados);

        System.out.printf("Digite a Matricula e nome do Professor: ");
        dados = sc.nextLine();
        Professor professor = new Professor(dados);

        Disciplina disciplina = new Disciplina();

        disciplina.alunos[0] = aluno1;
        disciplina.contaAlunos +=1;
        disciplina.alunos[1] = aluno2;
        disciplina.contaAlunos +=1;
        disciplina.professor = professor;

        disciplina.adicionaNotas(disciplina);
        disciplina.imprimeMedias(disciplina, disciplina.contaAlunos);
        disciplina.imprimeMelhoresNotas(disciplina, disciplina.contaAlunos);

    }
}
