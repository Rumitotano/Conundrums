package com.example.conundrums;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Checkers extends AppCompatActivity {

    private long backPressedTime;

    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkers);
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

    public void help(View v){
        Intent intent = new Intent(this, Checkers_help.class);
        startActivity(intent);
        finish();
    }

    public void info(View v){
        Intent intent = new Intent(this, Checkers_info.class);
        startActivity(intent);
        finish();
    }

    public void quit (View v) {
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
        finish();
    }
}