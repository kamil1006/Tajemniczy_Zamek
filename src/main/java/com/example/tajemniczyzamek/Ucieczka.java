package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Ucieczka extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ucieczka);


    }

    public void clickKoniec(View view)
    {

        this.finish();


    }
    //---------------------------------------------------------------
    public void clickRestart(View view)
    {

        Intent i = new Intent(view.getContext(), MainActivity.class);
        startActivity(i);
        this.finish();

    }
    //---------------------------------------------------------------

}
