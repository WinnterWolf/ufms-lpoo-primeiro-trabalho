package com.mycompany.app.models;

public class Aluno extends Pessoa {

    private String rga;


    public Aluno(){
        super();
    }

    public Aluno(String dados){
        super();
        String[] d = dados.split(" ");
        String nome = d[1];

        this.setRga(d[0]);
        for(int i=2;i<d.length;i++){
            nome += " " + d[i];
        }
        this.setNome(nome);
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
