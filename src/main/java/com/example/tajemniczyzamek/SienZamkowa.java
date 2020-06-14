package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class SienZamkowa extends Activity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sien_zamkowa);


    }

    public void clickDrzwiCzarne(View view)
    {
        Intent i = new Intent(view.getContext(),Loch.class);
        startActivity(i);
        this.finish();


    }
    //---------------------------------------------------------------
    public void clickDrzwiNiebieskie(View view)
    {

        Intent i = new Intent(view.getContext(), Powodz.class);
        startActivity(i);
        this.finish();

    }
    //---------------------------------------------------------------
//---------------------------------------------------------------
    public void clickUciekaj(View view)
    {

        Intent i = new Intent(view.getContext(), Ucieczka.class);
        startActivity(i);
        this.finish();

    }
    //---------------------------------------------------------------



}
