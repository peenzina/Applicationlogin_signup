package com.example.applicationlogin_signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textView = findViewById(R.id.text);
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("key");
        textView.setText("Привет, " + username);
    }
}