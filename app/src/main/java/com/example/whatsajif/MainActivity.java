package com.example.whatsajif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView nextPage = findViewById(R.id.imageView);
        nextPage.setOnClickListener(v -> startJif());
    }

    private void startJif() {
        Intent openJif = new Intent(this, WhatsAJifActivity.class);
        startActivity(openJif);
    }
}