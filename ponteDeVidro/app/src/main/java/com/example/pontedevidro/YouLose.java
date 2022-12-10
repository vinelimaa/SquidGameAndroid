package com.example.pontedevidro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YouLose extends AppCompatActivity {

    Button inicio, jogar_novamente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_lose);

        jogar_novamente = findViewById(R.id.button);
        inicio = findViewById(R.id.button2);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                telaInicial();
            }
        });

        jogar_novamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogarNovamente();
            }
        });
    }

    public void jogarNovamente(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void telaInicial(){

        Intent intent = new Intent(this, Wellcome.class);
        startActivity(intent);
    }
}