package com.mycompany.app;

import com.mycompany.app.models.Aluno;
import com.mycompany.app.models.Professor;
import com.mycompany.app.models.Disciplina;

import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String dados;
        Professor professor = new Professor();

        System.out.printf("Digite o nome e RGA do primeiro aluno: ");
        dados = sc.nextLine();
        Aluno aluno1 = new Aluno(dados);


        System.out.printf("Digite o nome e RGA do segundo aluno: ");
        dados = sc.nextLine();
        Aluno aluno2 = new Aluno(dados);

        System.out.printf("Digite o nome do segundo aluno: ");
        aluno2.setNome(sc.nextLine());
        System.out.printf("Digite o rga do segundo aluno: ");
        aluno2.setRga(sc.nextLine());
    }
}
