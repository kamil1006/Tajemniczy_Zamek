package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Korytarz extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korytarz);


    }

    public void clickLustro(View view)
    {
        Intent i = new Intent(view.getContext(),Korytarz2.class);
        startActivity(i);
        this.finish();


    }
    public void clickNieLustro(View view)
    {
        Intent i = new Intent(view.getContext(),Porazka.class);
        startActivity(i);
        this.finish();


    }



}
