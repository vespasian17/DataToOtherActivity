package com.example.datatootheractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mainl;

    LinearLayout linlay;
    LinearLayout linlay2;
    static int ll;
    TransObj trans;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainl = findViewById(R.id.container);
        trans = new TransObj("Vlad", "Erofeev");

        linlay = new LinearLayout(this);
        linlay.setId(123);
        linlay2 = new LinearLayout(this);
        linlay2.setId(124);
        ll = linlay.getId();

        RelativeLayout.LayoutParams lParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        lParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        linlay.setBackgroundColor(R.color.colorPrimary);
        linlay2.setBackgroundColor(R.color.colorAccent);
        mainl.addView(linlay, lParams);

        FragmentManager fm = getSupportFragmentManager();


        if (savedInstanceState == null) {
            fm.beginTransaction()
                    .add(linlay.getId(), new FirstFragment())
                    .commit();
        }

        Intent intent = new Intent(MainActivity.this, FirstFragment.class);
        intent.putExtra("textToFirst", trans);
    }


}
