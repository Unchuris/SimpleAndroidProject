package com.example.vlady.simpleandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    public static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber() {
        Integer count = getIntent().getIntExtra(SecondActivity.TOTAL_COUNT, 0);

        Random random = new Random();
        Integer randomInt = 0;

        if(count > 0) {
            randomInt = random.nextInt(count+1);
        }
        TextView textViewRandom = findViewById(R.id.textViewRandom);
        String randomString =  Integer.toString(randomInt);
        textViewRandom.setText(randomString);

        TextView textViewLabel = findViewById(R.id.textViewLabel);
        textViewLabel.setText(getString(R.string.random_heading, count));
    }
}
