package com.example.cliker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView mainText, lastCount;
    ImageButton plusBtn, minBtn;
    int score = 0;
    ArrayList<Integer> dynamicArray = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.mainTxt);
        lastCount = (TextView) findViewById(R.id.last_count);
        plusBtn = (ImageButton) findViewById(R.id.plus_btn);
        minBtn = (ImageButton) findViewById(R.id.min_btn);
    }
    public void onClickPlus(View v) {
        score++;
        String s = "Кликов: " + score;
        mainText.setText(s);
    }
    public void onClickMin(View v) {
        score--;
        String s = "Кликов: " + score;
        mainText.setText(s);
    }
    public void onClickNull(View v) {
        dynamicArray.add(score);

        int lastElements = Math.min(5, dynamicArray.size());
        String ad = "";
        for (int i = dynamicArray.size() - lastElements; i < dynamicArray.size(); i++) {
            ad += dynamicArray.get(i) + "\n";
        }
        lastCount.setText(ad);

        score = 0;
        String s = "Кликов: " + score;
        mainText.setText(s);
    }
}