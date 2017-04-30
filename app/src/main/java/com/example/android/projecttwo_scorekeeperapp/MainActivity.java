package com.example.android.projecttwo_scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int catA = 0;
    private int catB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayCatAScore(catA);
        displayCatBScore(catB);
    }

    /**
     * Display score for catA
     */
    private void displayCatAScore(int catA) {
        TextView scoreView = (TextView) findViewById(R.id.catA);
        scoreView.setText(String.valueOf(catA));
    }

    /**
     * Plus point for catA
     */
    public void plusPointForCatA(View view) {
        if (catA > 9) {
            Toast toast= Toast.makeText(this, "Viki wins!!!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        catA = catA + 1;
        displayCatAScore(catA);
    }

    /**
     * Lost point for catA
     */
    public void minusPointForCatA(View view) {
        if (catA < 0) {
            Toast toast= Toast.makeText(this, "Cernovous wins!!!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }
        catA = catA - 1;
        displayCatAScore(catA);
    }

    /**
     * Display score for catB
     */
    private void displayCatBScore(int catB) {
        TextView scoreView = (TextView) findViewById(R.id.catB);
        scoreView.setText(String.valueOf(catB));
    }

    /**
     * Plus point for catB
     */
    public void plusPointForCatB(View view) {
        if (catB > 9) {
            Toast toast= Toast.makeText(this, "Cernovous wins!!!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }
        catB = catB + 1;
        displayCatBScore(catB);
    }

    /**
     * Lost point for catB
     */
    public void minusPointForCatB(View view) {
        if (catB < 0) {
            Toast toast= Toast.makeText(this, "Viki wins!!!", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }
        catB = catB - 1;
        displayCatBScore(catB);
    }

    /**
     * Resets score
     */
    public void resetScore(View view) {
        int resetScore = 0;
        catA = resetScore;
        displayCatAScore(resetScore);
        catB = resetScore;
        displayCatBScore(resetScore);
    }
}
