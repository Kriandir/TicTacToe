package kriek.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public int ctr = 0;
    public boolean but1,but2,but3,but4,but5,but6,but7,but8,but9 = false;
    public char[] checkers = new char[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final TextView text1 = (TextView) findViewById(R.id.text1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but1 ==false && ctr % 2 == 0){
                    button1.setText("X");
                    but1 = true;
                    ctr+=1;
                    checkers[0] = 1;
                }
                else if(but1 == false && ctr % 2 !=0){
                    button1.setText("O");
                    but1 = true;
                    ctr+=1;
                    checkers[0] = 2;

                }


            }


        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but2 ==false && ctr % 2 == 0){
                    button2.setText("X");
                    but2 = true;
                    ctr+=1;
                    checkers[1]=1;
                }
                else if(but2 == false && ctr % 2 !=0){
                    button2.setText("O");
                    but2 = true;
                    ctr+=1;
                    checkers[1]=2;

                }


            }


        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but3 ==false && ctr % 2 == 0){
                    button3.setText("X");
                    but3 = true;
                    ctr+=1;
                    checkers[2]=1;
                }
                else if(but3 == false && ctr % 2 !=0){
                    button3.setText("O");
                    but3 = true;
                    ctr+=1;
                    checkers[2]=2;

                }


            }


        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but4 ==false && ctr % 2 == 0){
                    button4.setText("X");
                    but4 = true;
                    ctr+=1;
                    checkers[3]=1;
                }
                else if(but4 == false && ctr % 2 !=0){
                    button4.setText("O");
                    but4 = true;
                    ctr+=1;
                    checkers[3]=2;

                }


            }


        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but5 == false && ctr % 2 == 0) {
                    button5.setText("X");
                    but5 = true;
                    ctr += 1;
                    checkers[4]=1;

                } else if (but5 == false && ctr % 2 != 0) {
                    button5.setText("O");
                    but5 = true;
                    ctr += 1;
                    checkers[4]=2;

                }


            }


        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but6 ==false && ctr % 2 == 0){
                    button6.setText("X");
                    but6 = true;
                    ctr+=1;
                    checkers[5]=1;
                }
                else if(but6 == false && ctr % 2 !=0){
                    button6.setText("O");
                    but6 = true;
                    ctr+=1;
                    checkers[5]=2;

                }


            }


        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but7 ==false && ctr % 2 == 0){
                    button7.setText("X");
                    but7 = true;
                    ctr+=1;
                    checkers[6]=1;
                }
                else if(but7 == false && ctr % 2 !=0){
                    button7.setText("O");
                    but7 = true;
                    ctr+=1;
                    checkers[6]=2;

                }


            }


        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but8 ==false && ctr % 2 == 0){
                    button8.setText("X");
                    but8 = true;
                    ctr+=1;
                    checkers[7]=1;
                }
                else if(but8 == false && ctr % 2 !=0){
                    button8.setText("O");
                    but8 = true;
                    ctr+=1;
                    checkers[7]=2;

                }


            }


        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(but9 ==false && ctr % 2 == 0){
                    button9.setText("X");
                    but9 = true;
                    ctr+=1;
                    checkers[8]=1;
                    if(checkers[1] ==2){
                        text1.setText("Failure");
                    }
                    else if(checkers[1] == 1){
                        text1.setText("succes");
                    }

                }
                else if(but9 == false && ctr % 2 !=0){
                    button9.setText("O");
                    but9 = true;
                    ctr+=1;
                    checkers[8]=2;
                    if(checkers[1] == 1){
                        text1.setText("succes");
                    }
                    else if(checkers[1] == 2){
                        text1.setText("failure");
                    }


                }


            }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
