package com.example.android_resource;

public class Tarefas {

    private String texto;
    private Boolean feito;


    Tarefas(String texto) {
        this.texto = texto;
        this.feito = false;

    }



    public String getTexto() {
        return texto;
    }

    public void setFeito(Boolean feito) {
        this.feito = feito;
    }
}
