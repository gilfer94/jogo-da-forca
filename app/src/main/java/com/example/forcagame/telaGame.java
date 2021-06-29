package com.example.forcagame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class telaGame extends AppCompatActivity implements View.OnClickListener {

    TextView tvR;
    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_game);
         tvR = (TextView) findViewById(R.id.tvRes);
        bt1 = (Button) findViewById(R.id.btEnviarLetra)

    }


    public void enviarTentativa(view v){
        tvR.setText("voce enviou palpite");

    }

    @Override
    public void onClick(View v) {
        R.id.bt1
    }

/*
    @Override
    public void onClick(View v) {

    }*/
}