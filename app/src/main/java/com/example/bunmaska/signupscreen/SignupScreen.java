package com.example.bunmaska.signupscreen;

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
import com.example.bunmaska.loginscreen.LoginScreen;

public class SignupScreen extends AppCompatActivity {
    AppCompatButton button,button1,button2;
    CardView cardView,cardView1,cardView3;
    EditText editText,editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup_screen);
        button = findViewById(R.id.loginbtn);
        button1 = findViewById(R.id.signupbtn);
        button2 = findViewById(R.id.sigup);
        cardView = findViewById(R.id.cardview1);
        cardView1 = findViewById(R.id.cardview2);
        cardView3 = findViewById(R.id.cardview3);
        editText = findViewById(R.id.entername);
        editText1 = findViewById(R.id.enterpassword);
        editText2 = findViewById(R.id.phoneno);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupScreen.this, LoginScreen.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText1.getText().toString().isEmpty() || editText1.getText().toString().isEmpty()){
                    Toast.makeText(SignupScreen.this, "Username or Password Empty", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SignupScreen.this,HomeScreen.class);
                    startActivity(intent);
                }
                if (editText2.getText().toString().length() !=10 || editText2.getText().toString().length() >10){
                    Toast.makeText(SignupScreen.this,"Invalid Phone number",Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent2 = new Intent(SignupScreen.this, HomeScreen.class);
                    startActivity(intent2);
                }
            }
        });
    }
}