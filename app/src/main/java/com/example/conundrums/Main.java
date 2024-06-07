package com.example.conundrums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    private long backPressedTime;

    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    @Override
    public void onBackPressed() {

        if(backPressedTime + 2000 > System.currentTimeMillis())
        {
            System.exit(0);
            super.onBackPressed();
            return;
        }
        else
        {
            backToast = Toast.makeText(getBaseContext(), "Нажмите ещё раз чтобы выйти", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    public void startNewActivityRub(View v){
        Intent intent = new Intent(this, Rubick_cub.class);
        startActivity(intent);
        finish();
    }

    public void startNewActivityChess(View v){
        Intent intent = new Intent(this, Chess.class);
        startActivity(intent);
        finish();
    }

    public void startNewActivityCheckers(View v){
        Intent intent = new Intent(this, Checkers.class);
        startActivity(intent);
        finish();
    }

}