package com.example.datatootheractivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class FirstFragment extends Fragment{

    Button ffbtn;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        ffbtn = view.findViewById(R.id.ffbtn);
        tv = view.findViewById(R.id.textView2);

        ffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(MainActivity.ll, new SecondFragment())
                            .addToBackStack(null)
                            .commit();
                }
        });

        Bundle args = getActivity().getIntent().getExtras().getBundle().getSerializable("textToFirst");
        TransObj transObj;
//        transObj = (TransObj) args.getSerializable("textToFirst");
//        transObj = (TransObj) args.getSerializable("textToFirst");
//        tv.setText("Your name: " + transObj.getName() + " " + transObj.getSurname());
        return view;


    }





//    public void setFrag(){
//        first = (FirstFragment) getFragmentManager()
//                .findFragmentById(R.id.first_fragment);
//        ((LinearLayout) first.getView().setLeftTopRightBottom(100,100,100,100));
//    }



}
