package com.mycompany.app.models;

public class Professor extends Pessoa{

    private String matricula;

    public Professor(){
        super();
    }

    @Override
    public void imprime(){

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
