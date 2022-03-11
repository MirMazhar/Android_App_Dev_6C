package com.example.android_app_dev_lec_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnLoginClick(View view){
        EditText userName = findViewById(R.id.editTextUsername);
        EditText password = findViewById(R.id.editTextPassword);
        Log.i("info", userName.getText().toString());
        Log.i("info", password.getText().toString());
        if( !( userName.getText().toString().equals("mir"))){
            Log.i("info", "INCORRECT USERNAME");
        }
        if( !(password.getText().toString().equals("123"))){
            Log.i("info", "INCORRECT PASSWORD");
        }
    }
}