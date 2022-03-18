package com.example.android_app_dev_lec_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean DisplaySzab =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnLoginClick(View view){
        EditText userName = findViewById(R.id.edittxtusername);
        EditText password = findViewById(R.id.edittxtpassword);
        Log.i("info", userName.getText().toString());
        Log.i("info", password.getText().toString());
        if( !( userName.getText().toString().equals("mir"))){
            Log.i("info", "INCORRECT USERNAME");
        }
        if( !(password.getText().toString().equals("123"))){
            Log.i("info", "INCORRECT PASSWORD");
        }
    }

    public void OnBtnResetClick(View view){
        EditText userName = findViewById(R.id.edittxtusername);
        EditText password = findViewById(R.id.edittxtpassword);
        userName.setText("");
        password.setText("");
    }

    public void OnImageClick(View view){
        ImageView SzabistImage = (ImageView)findViewById(R.id.imgViewzab);
        ImageView TomImage = (ImageView)findViewById(R.id.imgViewTom);


        if(DisplaySzab){
            SzabistImage.animate().rotation(360).alpha(0).setDuration(3000);
            TomImage.animate().rotation(360).alpha(1).setDuration(3000);
            DisplaySzab= false;
            Toast.makeText(this, "Display Szabist", Toast.LENGTH_LONG).show();
        }else{
            SzabistImage.animate().rotation(360).alpha(1).setDuration(3000);
            TomImage.animate().rotation(360).alpha(0).setDuration(3000);
            DisplaySzab= true;
            Toast.makeText(this, "Display Szabist", Toast.LENGTH_LONG).show();
        }
//        SzabistImage.animate().alpha(0).setDuration(3000);

//        SzabistImage.setTranslationY(100);
//        SzabistImage.animate().translationY(100);
//        SzabistImage.animate().translationYBy(100);
//        SzabistImage.animate().translationX(100);
    }
}