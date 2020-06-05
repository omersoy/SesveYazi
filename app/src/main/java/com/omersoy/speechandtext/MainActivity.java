package com.omersoy.speechandtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sesyazi(View view) {
        Intent sesyazi = new Intent ( this, SpeechText.class );
        startActivity ( sesyazi );
    }

    public void yazises(View view) {
        Intent yazises = new Intent ( this, TextSpeech.class );
        startActivity ( yazises );
    }
}
