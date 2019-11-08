package com.richie.guess_it;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class winner extends AppCompatActivity {
    Button bt1;
    Button bt2;
    int l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winner);

        try{
            l = getIntent().getIntExtra("level",0);
        }catch(Exception e){}

        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(winner.this, GamePlay.class);
                intent.putExtra("last",l);
                startActivity(intent);
                finish();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(winner.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
