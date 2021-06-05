package com.example.android_resource;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity_tarefas2 extends AppCompatActivity {

    boolean estadoBoton;
    Button boton;
    TextView TFeito;
    boolean estadoFeito;
    TextView cajadetexto;
    ImageView ver_imagen;

    private DadosAppT2 dadosAppT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dadosAppT2 = new DadosAppT2();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);

        estadoBoton=true;
        boton=findViewById(R.id.Button);
        TFeito = findViewById(R.id.textView3);
        cajadetexto= findViewById(R.id.textView);

        cajadetexto.setText(dadosAppT2.getTextoPassoReceita());
        TFeito.setText("Por fazer");


    }

    //Metodos
    @Override
    public boolean dispatchKeyEvent( KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        switch (keyCode) {
            case KeyEvent.KEYCODE_VOLUME_UP:
                if (action == KeyEvent.ACTION_DOWN) {


                    dadosAppT2.avancar();
                    dadosAppT2.marcarFeito();
                    cajadetexto.setText(dadosAppT2.getTextoPassoReceita());

                    estadoBoton= false;

                    if(dadosAppT2.getPosicao() == dadosAppT2.getSizeListaPassos()){
                        TFeito.setText("Feito");
                    }else{
                        TFeito.setText("Por fazer");
                    }
                }
                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                if (action == KeyEvent.ACTION_DOWN) {

                    dadosAppT2.retroceder();
                    cajadetexto.setText(dadosAppT2.getTextoPassoReceita());

                    estadoBoton= false;

                }

                return true;
            case KeyEvent.KEYCODE_ENTER:
                if (action == KeyEvent.ACTION_DOWN) {
                    Intent inicio = new Intent(this,MainActivity.class);
                    startActivity(inicio);
                }

                return true;
            default:
                return super.dispatchKeyEvent(event);
        }
    }
}
