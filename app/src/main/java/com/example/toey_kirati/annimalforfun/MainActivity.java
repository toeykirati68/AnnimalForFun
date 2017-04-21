package com.example.toey_kirati.annimalforfun;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    MediaPlayer mediaPlayer;
    int soundId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton = (Button) findViewById(R.id.btnStart);
        final EditText editText = (EditText) findViewById(R.id.editName);


        clickButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (editText.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please Enter Your Name", Toast.LENGTH_SHORT).show();

                } else {name = editText.getText().toString().trim();


                    Toast.makeText(getApplicationContext(), "Hello "+name, Toast.LENGTH_SHORT).show();


                    Intent intent = new Intent(MainActivity.this, Game.class);
                    startActivity(intent);
                }
            }
        });
    }
    private void playsound(int soundId) {

        mediaPlayer = MediaPlayer.create(getApplicationContext(),soundId);
        mediaPlayer.start();

    }


}
