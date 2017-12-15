package com.example.sugandhabansal.diceroll;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2,your_score,other_score;
    ImageView dice;
    Button roll,hold,reset,start;
    int score1 = 0, score2 = 0;
    boolean flag = true;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView);
        your_score = (TextView) findViewById(R.id.textView3);
        other_score = (TextView) findViewById(R.id.textView4);
        dice = (ImageView) findViewById(R.id.imageView2);
        roll = (Button) findViewById(R.id.button);
        hold = (Button) findViewById(R.id.button2);
        reset = (Button) findViewById(R.id.button3);
        start = (Button) findViewById(R.id.button4);

        roll.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                if(flag) {
                    Player_turn();
                }
            }
        });

        if(flag == false){
            Computer_turn();

        }

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll.setEnabled(true);
                hold.setEnabled(true);
                score1 = 0;
                score2 = 0;
                t2.setText(String.valueOf(score1));
                other_score.setText(String.valueOf(score2));
                flag = true;
            }
        });

        hold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll.setEnabled(false);
                start.setEnabled(true);
                hold.setEnabled(false);
                Toast.makeText(MainActivity.this, "Click Start to Start again...", Toast.LENGTH_SHORT).show();
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll.setEnabled(true);
                hold.setEnabled(true);
                reset.setEnabled(true);
                flag = true;
                start.setEnabled(false);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Player_turn(){
        Random random = new Random();
        int x = random.nextInt(6 - 1 + 1) + 1;
        switch (x) {
            case 1:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice1, getApplicationContext().getTheme()));
                t2.setText(String.valueOf(score1));
                flag = false;
                Toast.makeText(MainActivity.this, "Sorry no points awarded..Player 2's turn", Toast.LENGTH_LONG).show();
                break;
            case 2:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice2, getApplicationContext().getTheme()));
                score1 = score1 + 2;
                t2.setText(String.valueOf(score1));
                flag = false;
                Toast.makeText(MainActivity.this, "Player 2's turn", Toast.LENGTH_LONG).show();
                break;
            case 3:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice3, getApplicationContext().getTheme()));
                score1 = score1 + 3;
                t2.setText(String.valueOf(score1));
                flag = false;
                Toast.makeText(MainActivity.this, "Player 2's turn", Toast.LENGTH_LONG).show();
                break;
            case 4:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice4, getApplicationContext().getTheme()));
                score1 = score1 + 4;
                t2.setText(String.valueOf(score1));
                flag = false;
                Toast.makeText(MainActivity.this, "Player 2's turn", Toast.LENGTH_LONG).show();
                break;
            case 5:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice5, getApplicationContext().getTheme()));
                score1 = score1 + 5;
                t2.setText(String.valueOf(score1));
                flag = false;
                Toast.makeText(MainActivity.this, "Player 2's turn", Toast.LENGTH_LONG).show();
                break;
            case 6:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice6, getApplicationContext().getTheme()));
                score1 = score1 + 6;
                t2.setText(String.valueOf(score1));
                flag = false;
                Toast.makeText(MainActivity.this, "Player 2's turn", Toast.LENGTH_LONG).show();
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Computer_turn(){
        Toast.makeText(MainActivity.this,"comp",Toast.LENGTH_LONG).show();
        roll.setEnabled(false);
        Random random = new Random();
        int x = random.nextInt(6 - 1 + 1) + 1;
        switch (x) {
            case 1:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice1, getApplicationContext().getTheme()));
                t2.setText(String.valueOf(score1));
                flag = false;
                Toast.makeText(MainActivity.this, "Sorry no points awarded..Player 1's turn", Toast.LENGTH_LONG).show();
                break;
            case 2:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice2, getApplicationContext().getTheme()));
                score2 = score2 + 2;
                other_score.setText(String.valueOf(score2));
                flag = true;
                Toast.makeText(MainActivity.this, "Player 1's turn", Toast.LENGTH_LONG).show();
                break;
            case 3:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice3, getApplicationContext().getTheme()));
                score2 = score2 + 3;
                other_score.setText(String.valueOf(score2));
                flag = true;
                Toast.makeText(MainActivity.this, "Player 1's turn", Toast.LENGTH_LONG).show();
                break;
            case 4:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice4, getApplicationContext().getTheme()));
                score2 = score2 + 4;
                other_score.setText(String.valueOf(score2));
                flag = true;
                Toast.makeText(MainActivity.this, "Player 1's turn", Toast.LENGTH_LONG).show();
                break;
            case 5:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice5, getApplicationContext().getTheme()));
                score2 = score2 + 5;
                other_score.setText(String.valueOf(score2));
                flag = true;
                Toast.makeText(MainActivity.this, "Player 1's turn", Toast.LENGTH_LONG).show();
                break;
            case 6:
                dice.setImageDrawable(getResources().getDrawable(R.drawable.dice6, getApplicationContext().getTheme()));
                score2 = score2 + 6;
                other_score.setText(String.valueOf(score2));
                flag = true;
                Toast.makeText(MainActivity.this, "Player 1's turn", Toast.LENGTH_LONG).show();
                break;
        }
        roll.setEnabled(true);
    }
}
