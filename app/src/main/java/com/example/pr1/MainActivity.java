package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();
    public void displayToast(String text){
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello World");
        displayToast("onCreate");
        Log.i(TAG, "InformationCreate");
        Log.w(TAG, "Warning");
        Log.e(TAG, "Error");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbode");
    }
    @Override
    protected void onStart() {
        super.onStart();
        displayToast("onStart");
        Log.i(TAG, "InformationStart");
        Log.w(TAG, "Warning");
        Log.e(TAG, "Error");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbode");
    }
    @Override
    protected void onStop() {
        super.onStop();
        displayToast("onStop");
        Log.i(TAG, "InformationStop");
        Log.w(TAG, "Warning");
        Log.e(TAG, "Error");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbode");
    }
    @Override
    protected void onDestroy() {
        isFinishing();
        displayToast("onDestroy");
        super.onDestroy();
        Log.i(TAG, "InformationDestroy");
        Log.w(TAG, "Warning");
        Log.e(TAG, "Error");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbode");
    }
    @Override
    protected void onPause() {
        super.onPause();
        displayToast("onPause");
        Log.i(TAG, "InformationPause");
        Log.w(TAG, "Warning");
        Log.e(TAG, "Error");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbode");
    }
    @Override
    protected void onResume() {
        super.onResume();
        displayToast("onResume");
        Log.i(TAG, "InformationResume");
        Log.w(TAG, "Warning");
        Log.e(TAG, "Error");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbode");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        displayToast("onRestart");
        Log.i(TAG, "InformationRestart");
        Log.w(TAG, "Warning");
        Log.e(TAG, "Error");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbode");
    }
}