package com.example.vlady.simpleandroidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view) {
        Toast myToast = Toast.makeText(this, "Hello, Toast!", Toast.LENGTH_SHORT);

        myToast.show();
    }

    public void countMe(View view) {
        TextView textView = findViewById(R.id.textView);

        String countString = textView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count++;
        String stringNumber = count.toString();

        textView.setText(stringNumber);
    }

    public void randomMe(View view) {
        Intent randomIntent = new Intent(this, SecondActivity.class);

        TextView textView = findViewById(R.id.textView);
        String countString = textView.getText().toString();
        Integer count = Integer.parseInt(countString);

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count);

        startActivity(randomIntent);
    }
}
