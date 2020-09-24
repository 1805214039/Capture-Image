package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {
    Button button;
    EditText editText1, editText2;
    String s1, s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        editText1 = findViewById(R.id.name);
        editText2 = findViewById(R.id.Password);
        button = findViewById(R.id.Submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                s1 = editText1.getText().toString();
                s2 = editText2.getText().toString();
                if (s1.isEmpty()) {
                    Toast.makeText(NewActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
                } else if (s2.isEmpty()) {
                    Toast.makeText(NewActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intentpass = new Intent(getApplicationContext(), thirdActivity.class);
                    intentpass.putExtra("s1", s1);
                    intentpass.putExtra("s2", s2);
                    startActivity(intentpass);
                }
            }
        });

    }
}
