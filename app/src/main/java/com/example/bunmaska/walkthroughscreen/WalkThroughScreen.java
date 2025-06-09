package com.example.bunmaska.walkthroughscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bunmaska.R;
import com.example.bunmaska.loginscreen.LoginScreen;

public class WalkThroughScreen extends AppCompatActivity {
    CardView cardView;
    AppCompatButton button,button1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_walk_through_screen);
        cardView = findViewById(R.id.cardview);
        button = findViewById(R.id.skipbtn);
        button1 = findViewById(R.id.nextbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WalkThroughScreen.this, LoginScreen.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(WalkThroughScreen.this, WalkThroughScreen2.class);
                startActivity(intent1);
            }
        });

    }
}