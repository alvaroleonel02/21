package com.example.myblackjackapp; 

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int betAmount = intent.getIntExtra("BET_AMOUNT", 0);

        Random random = new Random();
        int dealerTotal = random.nextInt(11) + 12;
        int playerTotal = random.nextInt(11) + 12;

        String result;
        if (playerTotal > dealerTotal && playerTotal <= 21) {
            result = "Você ganhou $" + betAmount + "!";
        } else if (playerTotal == dealerTotal) {
            result = "Empate! Você recebe de volta $" + betAmount + ".";
        } else {
            result = "Você perdeu $" + betAmount + ".";
        }

        TextView resultTextView = findViewById(R.id.resultTextView);
        resultTextView.setText(result);
    }

    public void startNewGame(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
