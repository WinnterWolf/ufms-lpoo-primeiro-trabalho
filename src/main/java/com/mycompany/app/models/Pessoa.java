package com.mycompany.app.models;

public abstract class Pessoa {

    private String nome;


    abstract void imprime();
    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
