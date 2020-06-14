package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

public class Korytarz2 extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korytarz2);


    }

    public void clickOK(View view)
    {
        Intent i = new Intent(view.getContext(),Korytarz3.class);
        startActivity(i);
        this.finish();


    }

}
