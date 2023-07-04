package com.biometrics.gitsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("this is contained in my second commit");
        System.out.println("Change 4");
        System.out.println("This line will be merged");
    }
}