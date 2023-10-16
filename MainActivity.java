package com.example.myblackjackapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View view) {
        EditText betEditText = findViewById(R.id.betEditText);
        int betAmount = Integer.parseInt(betEditText.getText().toString());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("BET_AMOUNT", betAmount);
        startActivity(intent);
    }
}
