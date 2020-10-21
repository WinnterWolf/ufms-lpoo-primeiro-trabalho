package com.mycompany.app.models;

public class Aluno extends Pessoa {

    private String rga;


    public Aluno(String dados){
        super();
        String[] d = dados.split("");

        this.setRga(d[1]);
        this.setNome(d[0]);
    }

    @Override
    public void imprime(){

    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }
}
