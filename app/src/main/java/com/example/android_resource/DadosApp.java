package com.example.android_resource;

import java.util.ArrayList;
import java.util.List;



public class DadosApp extends MainActivity {

    private List<Tarefas> listaPassos;
    private int posicao;


    // singleton
    public DadosApp() {

        int tarefa = getPositionTarefa();

        listaPassos = new ArrayList<>();

        if(tarefa == 0){
            listaPassos.add(new Tarefas("1. Passo --> Preparação de ingredientes"));
            listaPassos.add(new Tarefas("2. Passo --> Mistura de ingredientes"));
            listaPassos.add(new Tarefas("3. Passo --> Coloque o bolo no forno"));
            listaPassos.add(new Tarefas("4. Passo --> Finalizar o bolo"));
        }else{
            if(tarefa == 1){
                listaPassos.add(new Tarefas("1. Passo --> Compra de terreno"));
                listaPassos.add(new Tarefas("2. Passo --> Preparação de terreno"));
                listaPassos.add(new Tarefas("3. Passo --> Plantar trigo"));
                listaPassos.add(new Tarefas("4. Passo --> Obter colheita"));
            }
        }

        posicao = 1;

        }





    public String getTextoPassoReceita() {

        return listaPassos.get(posicao - 1).getTexto();
    }

    public void avancar() {
        if (posicao < listaPassos.size()){
            posicao++;
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
