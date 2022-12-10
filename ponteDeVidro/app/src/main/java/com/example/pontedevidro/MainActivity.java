package com.example.pontedevidro;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button  rightGlass1, rightGlass2, rightGlass3, rightGlass4, rightGlass5,
            rightGlass6, rightGlass7, rightGlass8, rightGlass9, rightGlass10,
            leftGlass1, leftGlass2, leftGlass3, leftGlass4, leftGlass5,
            leftGlass6, leftGlass7, leftGlass8, leftGlass9, leftGlass10;

    boolean buttonValue = true;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rightGlass1 = findViewById(R.id.rightGlass1);
        rightGlass2 = findViewById(R.id.rightGlass2);
        rightGlass3 = findViewById(R.id.rightGlass3);
        rightGlass4 = findViewById(R.id.rightGlass4);
        rightGlass5 = findViewById(R.id.rightGlass5);
        rightGlass6 = findViewById(R.id.rightGlass6);
        rightGlass7 = findViewById(R.id.rightGlass7);
        rightGlass8 = findViewById(R.id.rightGlass8);
        rightGlass9 = findViewById(R.id.rightGlass9);
        rightGlass10 = findViewById(R.id.rightGlass10);

        leftGlass1 = findViewById(R.id.leftGlass1);
        leftGlass2 = findViewById(R.id.leftGlass2);
        leftGlass3 = findViewById(R.id.leftGlass3);
        leftGlass4 = findViewById(R.id.leftGlass4);
        leftGlass5 = findViewById(R.id.leftGlass5);
        leftGlass6 = findViewById(R.id.leftGlass6);
        leftGlass7 = findViewById(R.id.leftGlass7);
        leftGlass8 = findViewById(R.id.leftGlass8);
        leftGlass9 = findViewById(R.id.leftGlass9);
        leftGlass10 = findViewById(R.id.leftGlass10);

        rightGlass2.setEnabled(false);
        leftGlass2.setEnabled(false);
        rightGlass3.setEnabled(false);
        leftGlass3.setEnabled(false);
        rightGlass4.setEnabled(false);
        leftGlass4.setEnabled(false);
        rightGlass5.setEnabled(false);
        leftGlass5.setEnabled(false);
        rightGlass6.setEnabled(false);
        leftGlass6.setEnabled(false);
        rightGlass7.setEnabled(false);
        leftGlass7.setEnabled(false);
        rightGlass8.setEnabled(false);
        leftGlass8.setEnabled(false);
        rightGlass9.setEnabled(false);
        leftGlass9.setEnabled(false);
        rightGlass10.setEnabled(false);
        leftGlass10.setEnabled(false);

        // create random object
        Random random = new Random();

        rightGlass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass1.setBackgroundColor(GREEN);
                    rightGlass2.setEnabled(true);
                    leftGlass2.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                rightGlass1.setEnabled(false);
                leftGlass1.setEnabled(false);
            }
        });

        leftGlass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass1.setBackgroundColor(GREEN);
                    rightGlass2.setEnabled(true);
                    leftGlass2.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass1.setEnabled(false);
                rightGlass1.setEnabled(false);
            }
        });

        rightGlass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass2.setBackgroundColor(GREEN);
                    rightGlass3.setEnabled(true);
                    leftGlass3.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass2.setEnabled(false);
                rightGlass2.setEnabled(false);
            }
        });

        leftGlass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass2.setBackgroundColor(GREEN);
                    rightGlass3.setEnabled(true);
                    leftGlass3.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass2.setEnabled(false);
                rightGlass2.setEnabled(false);
            }
        });

        rightGlass3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass3.setBackgroundColor(GREEN);
                    rightGlass4.setEnabled(true);
                    leftGlass4.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass3.setEnabled(false);
                rightGlass3.setEnabled(false);
            }
        });

        leftGlass3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass3.setBackgroundColor(GREEN);
                    rightGlass4.setEnabled(true);
                    leftGlass4.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass3.setEnabled(false);
                rightGlass3.setEnabled(false);
            }
        });

        rightGlass4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass4.setBackgroundColor(GREEN);
                    rightGlass5.setEnabled(true);
                    leftGlass5.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass4.setEnabled(false);
                rightGlass4.setEnabled(false);
            }
        });

        leftGlass4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass4.setBackgroundColor(GREEN);
                    rightGlass5.setEnabled(true);
                    leftGlass5.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass4.setEnabled(false);
                rightGlass4.setEnabled(false);
            }
        });

        rightGlass5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass5.setBackgroundColor(GREEN);
                    rightGlass6.setEnabled(true);
                    leftGlass6.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass5.setEnabled(false);
                rightGlass5.setEnabled(false);
            }
        });

        leftGlass5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass5.setBackgroundColor(GREEN);
                    rightGlass6.setEnabled(true);
                    leftGlass6.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass5.setEnabled(false);
                rightGlass5.setEnabled(false);
            }
        });

        rightGlass6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass6.setBackgroundColor(GREEN);
                    rightGlass7.setEnabled(true);
                    leftGlass7.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass6.setEnabled(false);
                rightGlass6.setEnabled(false);
            }
        });

        leftGlass6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass6.setBackgroundColor(GREEN);
                    rightGlass7.setEnabled(true);
                    leftGlass7.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass6.setEnabled(false);
                rightGlass6.setEnabled(false);
            }
        });

        rightGlass7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass7.setBackgroundColor(GREEN);
                    rightGlass8.setEnabled(true);
                    leftGlass8.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass7.setEnabled(false);
                rightGlass7.setEnabled(false);
            }
        });

        leftGlass7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass7.setBackgroundColor(GREEN);
                    rightGlass8.setEnabled(true);
                    leftGlass8.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass7.setEnabled(false);
                rightGlass7.setEnabled(false);
            }
        });

        rightGlass8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass8.setBackgroundColor(GREEN);
                    rightGlass9.setEnabled(true);
                    leftGlass9.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass8.setEnabled(false);
                rightGlass8.setEnabled(false);
            }
        });

        leftGlass8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass8.setBackgroundColor(GREEN);
                    rightGlass9.setEnabled(true);
                    leftGlass9.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass8.setEnabled(false);
                rightGlass8.setEnabled(false);
            }
        });

        rightGlass9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass9.setBackgroundColor(GREEN);
                    rightGlass10.setEnabled(true);
                    leftGlass10.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass9.setEnabled(false);
                rightGlass9.setEnabled(false);
            }
        });

        leftGlass9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass9.setBackgroundColor(GREEN);
                    rightGlass10.setEnabled(true);
                    leftGlass10.setEnabled(true);
                }
                else {
                    proximaTela();
                }
                leftGlass9.setEnabled(false);
                rightGlass9.setEnabled(false);
            }
        });

        rightGlass10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    rightGlass10.setBackgroundColor(GREEN);
                }
                else {
                    proximaTela();
                }
                leftGlass10.setEnabled(false);
                rightGlass10.setEnabled(false);
            }
        });

        leftGlass10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonValue = random.nextBoolean();
                if (buttonValue == true){
                    leftGlass10.setBackgroundColor(GREEN);
                }
                else {
                    proximaTela();
                }
                leftGlass10.setEnabled(false);
                rightGlass10.setEnabled(false);
            }
        });
    }

    public void proximaTela(){

        Intent intent = new Intent(this, YouLose.class);
        startActivity(intent);
    }

    public void youWin(){

        Intent intent = new Intent(this, YouLose.class);
        startActivity(intent);
    }
}