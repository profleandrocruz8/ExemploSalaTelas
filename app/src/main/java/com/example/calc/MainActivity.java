package com.example.calc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declaração de variáveis para os elementos de interface
    private EditText TxtN1; // Campo de entrada para o primeiro número
    private EditText TxtN2; // Campo de entrada para o segundo número
    private TextView txtResult; // Campo de exibição para o resultado da soma

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define o layout da atividade

        // Associa os elementos de interface com as variáveis
        TxtN1 = findViewById(R.id.TxtN1); // Associa o campo TxtN1 com o EditText do layout
        TxtN2 = findViewById(R.id.TxtN2); // Associa o campo TxtN2 com o EditText do layout
        txtResult = findViewById(R.id.txtResult); // Associa o campo txtResult com o TextView do layout
    }

    // Método chamado quando o botão de soma é clicado
    public void somar(View view) {
        // Obtém os valores dos campos de entrada e converte para inteiros
        int valor1 = Integer.parseInt(TxtN1.getText().toString());
        int valor2 = Integer.parseInt(TxtN2.getText().toString());

        // Calcula a soma dos valores e converte para String
        String resultado = String.valueOf(valor1 + valor2);

        // Define o resultado da soma no campo de exibição
        txtResult.setText(resultado);
    }

    public void Teladois(View view) {
        Intent in = new Intent(MainActivity.this, TelaDois.class);
        startActivity(in);
    }


}
