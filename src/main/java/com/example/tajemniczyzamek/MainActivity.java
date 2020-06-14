package com.example.tajemniczyzamek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDrzwi = null;
    ImageView ivSchody = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDrzwi= (ImageView) findViewById(R.id.ivDrzwi);
        ivSchody= (ImageView) findViewById(R.id.ivSchody);



    }

    //---------------------------------------------------------------

    public void clickDrzwi(View view)
    {
        Intent i = new Intent(view.getContext(),Loch.class);
        startActivity(i);
        this.finish();


    }
    //---------------------------------------------------------------
     public void clickSchody(View view)
    {

        Intent i = new Intent(view.getContext(), SienZamkowa.class);
        startActivity(i);
        this.finish();

    }
    //---------------------------------------------------------------



}
