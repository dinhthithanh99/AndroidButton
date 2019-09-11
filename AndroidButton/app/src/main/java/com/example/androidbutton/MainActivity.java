package com.example.androidbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt = findViewById(R.id.bt);
        bt.setText("Submit 2");

        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
