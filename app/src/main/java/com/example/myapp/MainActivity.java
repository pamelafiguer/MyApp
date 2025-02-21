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

    private EditText et3;

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
        et3 = (EditText) findViewById(R.id.editTextText3);
        tv1 = (TextView) findViewById(R.id.textView2);


    }

    public void Mostrar(View vista) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();

        String datos = valor1 + " " + valor2 + " " + "\n" + valor3;
        tv1.setText(datos);
    }





}