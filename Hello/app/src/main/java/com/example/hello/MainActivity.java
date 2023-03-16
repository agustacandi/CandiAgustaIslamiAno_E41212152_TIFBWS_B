package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameText, passwordText;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameText = findViewById(R.id.usernametxt);
        passwordText = findViewById(R.id.passwordtxt);
        loginBtn = findViewById(R.id.loginbtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameData = usernameText.getText().toString();
                String passwordData = passwordText.getText().toString();
                Toast.makeText(MainActivity.this, "Username : " + usernameData + " & Password : " + passwordData, Toast.LENGTH_LONG).show();
            }
        });
    }
}