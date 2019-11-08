package com.richie.guess_it;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tv2;
    TextView tv3;
    int l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

    }

    public void startGamePlay(View view) {
        int id = view.getId();
        switch(id){
            case R.id.tv2 : {
                l=100;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv3 : {
                l=200;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last",l);
                startActivity(intent);
            }break;

            case R.id.tv4 : {
                l=300;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv5 : {
                l=400;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv6 : {
                l=500;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv7 : {
                l=600;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv8 : {
                l=700;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv9: {
                l=800;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv10 : {
                l=900;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

            case R.id.tv11 : {
                l=1000;
                Intent intent = new Intent(this, GamePlay.class);
                intent.putExtra("last", l);
                startActivity(intent);
            }break;

        }
    }
}




