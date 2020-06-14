package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class LochCd2 extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loch_cd2);

    }


    //---------------------------------------------------------------
    public void clickDoKorytarza(View view)
    {

        Intent i = new Intent(view.getContext(), Korytarz.class);
        startActivity(i);
        this.finish();

    }
    //---------------------------------------------------------------



}
