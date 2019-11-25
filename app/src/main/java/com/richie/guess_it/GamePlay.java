package com.richie.guess_it;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class GamePlay extends AppCompatActivity {

    //declaring views and variables

    TextView tv1,tv2,tv3;

    ImageView backbtn;

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;

    int random, g, n = 10;
    int l;

    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_play);

        //initialising views
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        backbtn =findViewById(R.id.back_arrow);// back arrow

        btn1 = findViewById(R.id.btn1);   //OK button
        btn2 = findViewById(R.id.btn2);   //1
        btn3 = findViewById(R.id.btn3);   //2
        btn4 = findViewById(R.id.btn4);   //3
        btn5 = findViewById(R.id.btn5);   //4
        btn6 = findViewById(R.id.btn6);   //5
        btn7 = findViewById(R.id.btn7);   //6
        btn8 = findViewById(R.id.btn8);   //7
        btn9 = findViewById(R.id.btn9);   //8
        btn10 = findViewById(R.id.btn10); //9
        btn11 = findViewById(R.id.btn11); //10
        btn12 = findViewById(R.id.btn12);


        //getting last value from intent
        try{
            l = getIntent().getIntExtra("last", 100);
        }catch(Exception e){
            e.printStackTrace();
        }

        //generating random number
        random = (int) (Math.random() * ((l - 1)+1)) + 1;
        tv1.setText("Guess the Number between 1 and "+l);


        //Entering text in text view
        try {
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "1";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }


        try{
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "2";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }


        try{
            btn4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "3";
                    tv3.setText(text);
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }


        try{
            btn5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "4";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            btn6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "5";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            btn7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "6";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }


        try{
            btn8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "7";
                    tv3.setText(text);
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }


        try{
            btn9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "8";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            btn10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "9";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            btn11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = tv3.getText().toString() + "0";
                    tv3.setText(text);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }


        try{
            btn12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tv3.setText("");
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }



        //onClick OK
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (tv3.getText().toString().matches("")){
                    tv3.setText("");
                }
                else{
                    g = Integer.parseInt(tv3.getText().toString());
                    if (g >= 1 && g < l+1) {
                        if (g > random) {
                            tv3.setText("");
                            n--;
                            tv2.setText("Less than " + g + ". Try again... \n" + n + " chances left");
                            if (n == 0) {
                                Intent loser = new Intent(GamePlay.this, loser.class);
                                loser.putExtra("level", l);
                                startActivity(loser);
                                finish();
                            }
                        } else if (g < random) {
                            tv3.setText("");
                            n--;
                            tv2.setText("Greater than " + g + ". Try again... \n" + n + " chances left");
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
                        tv3.setText("");
                    }
                }

        }
        });


        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Exit Level ?");
        builder.setMessage("Progress in current level won't be saved");

        builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(GamePlay.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.show();
    }
}
