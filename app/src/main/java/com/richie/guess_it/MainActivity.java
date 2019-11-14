package com.richie.guess_it;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;

    Boolean lock_unlock;

    ImageView img1;



    //declaring last value
    int l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img1 = findViewById(R.id.img1);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });


        try {
            bt2 = findViewById(R.id.bt2);
            bt3 = findViewById(R.id.bt3);
            bt4 = findViewById(R.id.bt4);
            bt5 = findViewById(R.id.bt5);
            bt6 = findViewById(R.id.bt6);
            bt7 = findViewById(R.id.bt7);
            bt8 = findViewById(R.id.bt8);
            bt9 = findViewById(R.id.bt9);
            bt10 = findViewById(R.id.bt10);
        }catch(Exception e){
            e.printStackTrace();
        }

        SharedPreferences sharedPref = getSharedPreferences("storage",MODE_PRIVATE);

        lock_unlock = sharedPref.getBoolean("level2",false);
        if(lock_unlock) {
            bt2.setEnabled(true);
            bt2.setText("Level 2");
            bt2.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt2.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level3",false);
        if(lock_unlock) {
            bt3.setEnabled(true);
            bt3.setText("Level 3");
            bt3.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt3.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level4",false);
        if(lock_unlock) {
            bt4.setEnabled(true);
            bt4.setText("Level 4");
            bt4.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt4.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level5",false);
        if(lock_unlock) {
            bt5.setEnabled(true);
            bt5.setText("Level 5");
            bt5.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt5.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level6",false);
        if(lock_unlock) {
            bt6.setEnabled(true);
            bt6.setText("Level 6");
            bt6.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt6.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level7",false);
        if(lock_unlock) {
            bt7.setEnabled(true);
            bt7.setText("Level 7");
            bt7.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt7.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level8",false);
        if(lock_unlock) {
            bt8.setEnabled(true);
            bt8.setText("Level 8");
            bt8.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt8.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level9",false);
        if(lock_unlock) {
            bt9.setEnabled(true);
            bt9.setText("Level 9");
            bt9.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt9.setEnabled(false);

        lock_unlock = sharedPref.getBoolean("level10",false);
        if(lock_unlock) {
            bt10.setEnabled(true);
            bt10.setText("Level 10");
            bt10.setCompoundDrawablesWithIntrinsicBounds(0,0,0,0);
        }else bt10.setEnabled(false);
    }

    private void openHelp() {
        help help =new help();
        help.show(getSupportFragmentManager(),"help");
    }


    //assigning levels to each button
    public void startGamePlay(View view) {

        int id = view.getId();
        switch(id){
            case R.id.bt1 : {
                l=100;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt2 : {
                l=200;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last",l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt3 : {
                l=300;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt4 : {
                l=400;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt5 : {
                l=500;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt6 : {
                l=600;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt7 : {
                l=700;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt8: {
                l=800;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt9 : {
                l=900;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

            case R.id.bt10 : {
                l=1000;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
                finish();
            }break;

        }
    }

}




