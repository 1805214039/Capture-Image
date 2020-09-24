package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Fourth extends AppCompatActivity {
    Button button;
    ImageView imageView;
    private static final int CAMERA_REQUEST=500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        imageView=findViewById(R.id.imageview);
        button=findViewById(R.id.Capture);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Cameraintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(Cameraintent,CAMERA_REQUEST);

            }
        });
    }
    protected void onActivityResult( int requestcode,int resultcode,Intent data)
    {
        if(requestcode==CAMERA_REQUEST && resultcode==Activity.RESULT_OK)
        {
            Bitmap photo =(Bitmap)data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }

    }
}