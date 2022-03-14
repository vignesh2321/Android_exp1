package com.example.ex_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button in;
    Button out;
    TextView title;
    TextView prompt;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        in = (Button) findViewById(R.id.in);
        out = (Button) findViewById(R.id.out);
        title = (TextView) findViewById(R.id.titleid);
        prompt = (TextView) findViewById(R.id.promptid);
        i = 0;

        in.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.setBackgroundColor(Color.GREEN);
                i++;
                prompt.setText("You can go in\n " +
                        "Number of people inside is " + i);
                out.setBackgroundColor(Color.BLUE);

            }
        }));
        out.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out.setBackgroundColor(Color.RED);
                if(i>0)
                i--;
                prompt.setText("You can go out\n " +
                        "Number of people inside is " + i);
                in.setBackgroundColor(Color.BLUE);

            }
        }));

    }
}