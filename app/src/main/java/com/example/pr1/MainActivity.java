package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void displayToast(String text){
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello World");
        displayToast("onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        displayToast("onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        displayToast("onStop");
    }
    @Override
    protected void onDestroy() {
        isFinishing();
        displayToast("onDestroy");
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        super.onPause();
        displayToast("onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        displayToast("onResume");
    }
}