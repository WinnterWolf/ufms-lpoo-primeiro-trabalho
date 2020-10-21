package com.mycompany.app.models;

public class Professor extends Pessoa{

    private String matricula;

    public Professor(){
        super();
    }
    public Professor(String dados){
        super();

        String[] d = dados.split(" ");
        String nome = d[1];

        this.setMatricula(d[0]);
        for(int i=2;i<d.length;i++){
            nome += " " + d[i];
        }
        this.setNome(nome);
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
