package com.alex.teste.appcaracoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private Button buttonVolta;
    private ImageView imagemMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        buttonVolta = findViewById(R.id.buttonVoltar);
        imagemMoeda = findViewById(R.id.imagemMoeda);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){
            imagemMoeda.setImageResource(R.drawable.moeda_cara);
        }
        else{
            imagemMoeda.setImageResource(R.drawable.moeda_coroa);
        }

        buttonVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intents = new Intent(getApplicationContext(), MainActivity.class);
                //startActivity(intents);

                finish();
            }
        });

    }
}