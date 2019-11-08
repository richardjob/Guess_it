package com.richie.guess_it;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GamePlay extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    EditText et1;
    Button bt1;

    int random, g, n = 10;
    int l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_play);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        et1 = findViewById(R.id.et1);
        bt1 = findViewById(R.id.bt1);

        try{
            l = getIntent().getIntExtra("last", 100);
        }catch(Exception e){}


        random = (int) (Math.random() * ((l - 1)+1)) + 1;
        tv1.setText("Guess the Number between 1 and "+l);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et1.getText().toString().matches("")){
                    et1.setError("Please Enter a Number");
                }
                else if (n > 0) {
                    g = Integer.parseInt(et1.getText().toString());
                    if (g >= 1 && g < l + 1) {
                        if (g > random) {
                            et1.setText("");
                            n--;
                            tv2.setText("Less then " + g + ". Try again... \n" + n + " chances left");
                            if (n == 0) {
                                Intent loser = new Intent(GamePlay.this, loser.class);
                                loser.putExtra("level", l);
                                startActivity(loser);
                                finish();
                            }
                        } else if (g < random) {
                            et1.setText("");
                            n--;
                            tv2.setText("Greater then " + g + ". Try again... \n" + n + " chances left");
                            if (n == 0) {
                                Intent loser = new Intent(GamePlay.this, loser.class);
                                loser.putExtra("level", l);
                                startActivity(loser);
                                finish();
                            }
                        } else if (g == random) {
                            Intent winner = new Intent(GamePlay.this, winner.class);
                            winner.putExtra("level", l);
                            startActivity(winner);
                            finish();
                        }
                    } else {
                        et1.setError("Enter Number between the given Range ");
                    }
                }

        }
        });

    }
}
