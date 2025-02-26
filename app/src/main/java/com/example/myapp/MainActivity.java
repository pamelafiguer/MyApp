package com.example.myapp;

import android.app.AlertDialog;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
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

    Button play;

    SoundPool sp;

    int sonido_de_reproduccion;



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

        play =(Button) findViewById(R.id.button_play_corto);
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        sonido_de_reproduccion = sp.load(this,R.raw.click,1);


    }


    public void Mostrar(View vista) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();

        String datos = "Nombres: " + valor1 + "\n" + "Apellidos: " + valor2 + "\n" + " Email: " + valor3 +"\n" ;
        tv1.setText(datos);

        MediaPlayer mp=MediaPlayer.create(this,R.raw.click);
        mp.start();
    }








}