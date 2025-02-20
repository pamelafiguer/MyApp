package com.example.myapp;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    private EditText et2;

    private TextView tv1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        et1 = (EditText) findViewById(R.id.editTextText1);
        et2 = (EditText) findViewById(R.id.editTextText2);
        tv1 = (TextView) findViewById(R.id.textView2);


    }

    public void suma(View vista) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int total = num1 + num2;

        String resultado = String.valueOf(total);
        tv1.setText(resultado);
    }

    public void resta(View vista) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int total = num1 - num2;

        String resultado = String.valueOf(total);
        tv1.setText(resultado);
    }

    public void multiplicacion(View vista) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int total = num1 * num2;

        String resultado = String.valueOf(total);
        tv1.setText(resultado);
    }

    public void division(View vista) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if (num2 != 0) {
            int total = num1 / num2;
            String resultado = String.valueOf(total);
            tv1.setText(resultado);

        } else {
            Toast.makeText(this, "El segundo valor ingresado debe ser distinto a 0", Toast.LENGTH_SHORT).show();
        }

    }

}