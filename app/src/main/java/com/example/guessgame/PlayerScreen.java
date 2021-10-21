package com.example.guessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerScreen extends AppCompatActivity {

    private EditText jugador1,jugador2,jugador3,jugador4,jugador5,jugador6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_screen);

        EditText jugador1 = (EditText)findViewById(R.id.jugador1);
        EditText jugador2 = (EditText)findViewById(R.id.jugador2);
        EditText jugador3 = (EditText)findViewById(R.id.jugador3);
        EditText jugador4 = (EditText)findViewById(R.id.jugador4);
        EditText jugador5 = (EditText)findViewById(R.id.jugador5);
        EditText jugador6 = (EditText)findViewById(R.id.jugador6);

    }




    public void Aceptar(View view){
        Intent siguiente= new Intent(this,Reveal.class);
        siguiente.putExtra("j1",jugador1.getText().toString());
        startActivity(siguiente);
    }




}


