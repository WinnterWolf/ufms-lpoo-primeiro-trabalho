package com.mycompany.app.models;

import java.util.Scanner;

public class Disciplina {

    Scanner sc = new Scanner(System.in);
    public String descricao;
    public int contaAlunos;


    public Aluno[] alunos = new Aluno[50];
    public Professor professor = new Professor();
    public double[][] notas = new double[50][2];




    public void adicionaNotas(Disciplina disciplina){
        int prova = 1;
        for(int i=0;i<contaAlunos;i++){
            for(int j=0;j<2;j++){

                System.out.printf("Informe o valor da p%d para o aluno numero %d: ", prova, i+1);
                disciplina.notas[i][j] = sc.nextInt();
                prova = 2;
            }
            prova = 1;
        }
    }
    public void imprimeMedias(Disciplina disciplina, int contaAlunos){
        double p1Media = 0.0;
        double p2Media = 0.0;
        boolean p1 = true;

        double p1Soma = 0.0;
        double p2Soma = 0.0;

        for(int i=0;i<2;i++){
            for(int j=0;j<50;j++){
                if(p1){
                    p1Soma += disciplina.notas[j][i];
                } else {
                    p2Soma += disciplina.notas[j][i];
                }
            }
            p1 = false;//Terminou de iterar as notas da p1
        }
        p1Media = p1Soma/contaAlunos;
        p2Media = p2Soma/contaAlunos;
        System.out.println("Media da turma na P1 " +p1Media+ " Media da turna na P2 " +p2Media);
    }

    public void imprimeMelhoresNotas(Disciplina disciplina, int contaAlunos){

        double melhorNotaP1 = 0.0;
        double melhorNotaP2 = 0.0;
        int alunoP1 = 0;
        int alunoP2 = 0;
        boolean p1 = true;

        for(int i=0;i<2;i++){
            for(int j=0;j<50;j++){
                if(p1){
                    if(melhorNotaP1 < disciplina.notas[j][i]){
                        melhorNotaP1 = disciplina.notas[j][i];
                        alunoP1 = j;
                    }
                } else {
                    if(melhorNotaP2 < disciplina.notas[j][i]){
                        melhorNotaP2 = disciplina.notas[j][i];
                        alunoP2 = j;
                    }
                }
            }
            p1 = false;//Terminou de iterar as notas da p1
        }

        System.out.println("Melhor nota P1: " +melhorNotaP1+ " Aluno: " +disciplina.alunos[alunoP1].getNome());
        System.out.println("Melhor nota P2: " +melhorNotaP2+ " Aluno: " +disciplina.alunos[alunoP2].getNome());
    }

}
