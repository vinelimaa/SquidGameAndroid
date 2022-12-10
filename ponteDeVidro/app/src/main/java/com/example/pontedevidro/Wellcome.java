package com.example.pontedevidro;

import static android.graphics.Color.GREEN;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wellcome extends AppCompatActivity {

    Button jogar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        jogar = findViewById(R.id.jogar);

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar();
            }
            });
    }
    public void jogar(){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}