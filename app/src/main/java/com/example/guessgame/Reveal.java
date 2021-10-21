package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Reveal extends AppCompatActivity {

    private TextView jug1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reveal);

        jug1 = (TextView)findViewById(R.id.jugador);

        String player = getIntent().getStringExtra("j1");
        jug1.setText(player);

    }

}
