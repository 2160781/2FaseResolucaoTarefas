package com.example.android_resource;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;



public class DadosApp extends MainActivity {

    private List<PassoReceita> listaPassos;
    private int posicao;


    // singleton
    public DadosApp() {

        int tarefa = getPositionTarefa();


        if( tarefa == 0){

            listaPassos = new ArrayList<>();
            listaPassos.add(new PassoReceita("1. Passo --> Preparação de ingredientes"));
            listaPassos.add(new PassoReceita("2. Passo --> Mistura de ingredientes"));
            listaPassos.add(new PassoReceita("3. Passo --> Coloque o bolo no forno"));
            listaPassos.add(new PassoReceita("4. Passo --> Finalizar o bolo"));
            posicao = 1;

        }
      /*  listaPassos = new ArrayList<>();

        listaPassos.add(new PassoReceita("1. Passo --> Preparação de ingredientes"));
        listaPassos.add(new PassoReceita("2. Passo --> Mistura de ingredientes"));
        listaPassos.add(new PassoReceita("3. Passo --> Coloque o bolo no forno"));
        listaPassos.add(new PassoReceita("4. Passo --> Finalizar o bolo"));
        posicao = 1;*/



    }


    public String getTextoPassoReceita() {

        return listaPassos.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < listaPassos.size()){
            posicao++;
/*
            if (posicao == listaPassos.size()){
                listviewTarefas();
            }*/
        }
    }

    public void retroceder() {
        if (posicao > 1)
            posicao--;
    }

    public int getPosicao()  {
        return posicao;
    }
    public int getSizeListaPassos()  {
        return listaPassos.size();
    }

        public void marcarFeito() {
        listaPassos.get(posicao - 1).setFeito(true);
    }


}
