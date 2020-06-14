package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Loch extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loch);


    }

    public void clickWorek(View view)
    {
        Intent i = new Intent(view.getContext(),LochCd.class);
        startActivity(i);
        this.finish();


    }
    //---------------------------------------------------------------
    public void clickPistolet(View view)
    {

        Intent i = new Intent(view.getContext(), Porazka2.class);
        startActivity(i);
        this.finish();

    }
    //---------------------------------------------------------------
//---------------------------------------------------------------
    public void clickCzapka(View view)
    {

        Intent i = new Intent(view.getContext(), LochCd2.class);
        startActivity(i);
        this.finish();

    }
    //---------------------------------------------------------------
}
