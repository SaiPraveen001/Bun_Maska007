package com.example.bunmaska.loginscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bunmaska.R;
import com.example.bunmaska.homescreen.HomeScreen;
import com.example.bunmaska.signupscreen.SignupScreen;

public class LoginScreen extends AppCompatActivity {
    AppCompatButton button,button1,button2;
    CardView cardView,cardView1,cardView3;
    EditText editText,editText1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_screen);

        button = findViewById(R.id.loginbtn);
        button1 = findViewById(R.id.signupbtn);
        button2 = findViewById(R.id.login);
        cardView = findViewById(R.id.cardview1);
        cardView1 = findViewById(R.id.cardview2);
        cardView3 = findViewById(R.id.cardview3);
        editText = findViewById(R.id.entername);
        editText1 = findViewById(R.id.enterpassword);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreen.this, LoginScreen.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(LoginScreen.this, SignupScreen.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().equals(getString(R.string.User)) || editText1.getText().toString().equals(getString(R.string.Password))){
                    Intent intent2 = new Intent(LoginScreen.this, HomeScreen.class);
                    startActivity(intent2);
                } else {
                    Toast.makeText(LoginScreen.this, "UserName or Password Incorrect", Toast.LENGTH_SHORT).show();
                }
                if (editText1.getText().toString().isEmpty() || editText1.getText().toString().isEmpty()){
                    Toast.makeText(LoginScreen.this, "Username or Password Empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}