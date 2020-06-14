package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Korytarz3 extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korytarz3);


    }

    public void clickKoniec(View view)
    {

        this.finish();


    }


}
