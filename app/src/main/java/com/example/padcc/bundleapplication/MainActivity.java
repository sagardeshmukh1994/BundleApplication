package com.example.padcc.bundleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btndata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndata=(Button)findViewById(R.id.data);

        btndata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Visitor visitor=new Visitor();
                visitor.setName("Sachin");
                visitor.setEmail("sachin@gmail.com");
                Intent intent=new Intent(MainActivity.this,Second.class);
                intent.putExtra("visitor",visitor);

                startActivity(intent);
            }
        });

    }
}
