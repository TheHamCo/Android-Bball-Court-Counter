package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Respective team scores
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize team scores on the View
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given scoreTeamA for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds 3 points to team A.
     */
    public void threePointsTeamA(View view){
        displayForTeamA(scoreTeamA +=3);
    }

    /**
     * Adds 2 points to team A.
     */
    public void twoPointsTeamA(View view){
        displayForTeamA(scoreTeamA +=2);
    }

    /**
     * Free throw: Adds 1 point to team A.
     */
    public void freeThrowTeamA(View view){
        displayForTeamA(++scoreTeamA);
    }

    /**
     * Adds 3 points to team B.
     */
    public void threePointsTeamB(View view){
        displayForTeamB(scoreTeamB +=3);
    }

    /**
     * Adds 2 points to team B.
     */
    public void twoPointsTeamB(View view){
        displayForTeamB(scoreTeamB +=2);
    }

    /**
     * Free throw: Adds 1 point to team B.
     */
    public void freeThrowTeamB(View view){
        displayForTeamB(++scoreTeamB);
    }

    /**
     * Reset both team A and team B scores.
     */
    public void reset(View view){
        displayForTeamA(scoreTeamA=0);
        displayForTeamB(scoreTeamB=0);
    }
}
