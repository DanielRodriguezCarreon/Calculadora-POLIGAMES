package com.calculadora_poligames_final;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button buttonSuma,buttonResta,buttonMultiplica,buttonDivide,buttonVolumen,buttonLibrasGramos, buttonAreaT, buttonPromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSuma = findViewById(R.id.buttonSuma);
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSuma();
            }
        });
        buttonResta = findViewById(R.id.buttonResta);
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirResta();
            }
        });
        buttonMultiplica= findViewById(R.id.buttonMultiplicacion);
        buttonMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirMultiplicacion();
            }
        });

        buttonDivide = findViewById(R.id.buttonDividir);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { abrirDivision(); }
        });
        buttonVolumen = findViewById(R.id.buttonVolumen);
        buttonVolumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { abrirVolumen(); }
        });
        buttonLibrasGramos = findViewById(R.id.buttonLibrasGramos);
        buttonLibrasGramos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirLibrasGramos();
            }
        });
        buttonAreaT = findViewById(R.id.buttonAreaT );
        buttonAreaT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirAreaT();
            }
        });
        buttonPromedio = findViewById(R.id.buttonPromedio);
        buttonPromedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPromedio();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    private void abrirSuma(){
        Intent intent = new Intent(this, SumaActivity.class);
        startActivity( intent );
    }
    private void abrirResta(){
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity( intent );
    }
    private void abrirMultiplicacion(){
        Intent intent = new Intent(this, MultiplicacionActivity.class);
        startActivity( intent );
    }
    private void abrirDivision(){
        Intent intent = new Intent(this, DivisionActivity.class);
        startActivity( intent );
    }
    private void abrirVolumen(){
        Intent intent = new Intent(this, VolumenEsferaActivity.class);
        startActivity( intent );
    }
    private void abrirLibrasGramos(){
        Intent intent = new Intent(this, LibrasGramosActivity.class);
        startActivity( intent );
    }
    private void abrirAreaT() {
        Intent intent = new Intent( this , AreaTActivity.class );
        startActivity( intent );
    }
    private void abrirPromedio(){
        Intent intent = new Intent(this, PromedioActivity.class);
        startActivity( intent );
    }
}