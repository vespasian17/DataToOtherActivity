package com.example.datatootheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        tvView = findViewById(R.id.tvView);

        Bundle args = getIntent().getExtras();
        TransObj transObj;
        transObj = (TransObj) args.getSerializable("а так можно?");
        tvView.setText("Your name: " + transObj.getName() + " " + transObj.getSurname());


//        Intent intent = getIntent();

//        String fname = intent.getStringExtra("fname");
//        String lname = intent.getStringExtra("lname");

//        tvView.setText("Твое имя: " + fname + " " + lname);

    }
}
