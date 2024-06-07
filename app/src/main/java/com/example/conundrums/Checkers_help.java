package com.example.conundrums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Checkers_help extends AppCompatActivity {

    private long backPressedTime;

    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkers_help);
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

    public void quit (View v) {
        Intent intent = new Intent(this, Checkers.class);
        startActivity(intent);
    }
}