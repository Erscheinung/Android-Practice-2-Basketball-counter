package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int scoreA=0;
    private int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * Display Scores for Team A and Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     *
     * Score Manipulator For Team A
     */
    public void addThreeForTeamA(View view) {
        displayForTeamA(scoreA+=3);
    }

    public void addTwoForTeamA(View view) {
        displayForTeamA(scoreA+=2);
    }

    public void FreeThrowA(View view) {
        displayForTeamA(scoreA+=1);
    }

    /**
     *
     * Score Manipulator for Team B
     */
    public void addThreeForTeamB(View view) {
        displayForTeamB(scoreB+=3);
    }

    public void addTwoForTeamB(View view) {
        displayForTeamB(scoreB+=2);
    }

    public void FreeThrowB(View view) {
        displayForTeamB(scoreB+=1);
    }

    //Reset score
    public void Reset(View view) {
        displayForTeamA(scoreA=0);
        displayForTeamB(scoreB=0);
    }

}
