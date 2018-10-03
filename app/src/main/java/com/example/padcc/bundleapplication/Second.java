package com.example.padcc.bundleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        Visitor visitor=(Visitor)intent.getSerializableExtra("visitor");
        Toast.makeText(getApplicationContext(),visitor.getName()+" "+visitor.getEmail(),Toast.LENGTH_SHORT).show();
    }
}
