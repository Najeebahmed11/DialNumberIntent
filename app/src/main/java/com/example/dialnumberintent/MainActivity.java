package com.example.dialnumberintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button dial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dial=findViewById(R.id.dial);
    }
    public void onDialButton(View v){
        Intent intent =new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:03069329892"));
        startActivity(intent);

    }
}