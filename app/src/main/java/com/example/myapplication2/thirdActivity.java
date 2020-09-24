package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {
  TextView t1,t2;
  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1=findViewById(R.id.name);
        t2=findViewById(R.id.Password);
        t1.setText(getIntent().getExtras().getString("s1"));
        t2.setText(getIntent().getExtras().getString("s2"));
        button=findViewById(R.id.Submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent intent=new Intent(getApplicationContext(),Fourth.class);
                  startActivity(intent);
            }
        });
    }
}