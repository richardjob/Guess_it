package com.richie.guess_it;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class winner extends AppCompatActivity {

    //declaring views and variables
    Button bt1;
    Button bt2;
    int l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winner);

        //getting last value from intent
        try{
            l = getIntent().getIntExtra("level",0);
        }catch(Exception e){
            e.printStackTrace();
        }

        //initialising views
        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);

        StoreLevel(l+100);

        //play again
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(winner.this, GamePlay.class);
                intent.putExtra("last",l);
                startActivity(intent);
                finish();
            }
        });

        //change level
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(winner.this, GamePlay.class);
                intent.putExtra("last",l+100);
                startActivity(intent);
                finish();
            }
        });

    }

    private void StoreLevel(int l) {

        String level = String.valueOf(l/100);
        level = "level"+level;
        SharedPreferences sharedPref = getSharedPreferences("storage",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(level,true);
        editor.apply();
    }
}
