package com.example.tajemniczyzamek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class LochCd extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loch_cd);


    }

    public void clickPotwierdzLiczbe(View view)
    {


        showToast("NIEPRAWDA !! - Krzyczy Boruta");
        Intent i = new Intent(view.getContext(), Ucieczka.class);
        startActivity(i);
        this.finish();

    }

    public void showToast (String message)
    {
        View tastView=getLayoutInflater().inflate(R.layout.toast,(ViewGroup)findViewById(R.id.linlay));
        TextView tvToast =(TextView)tastView.findViewById(R.id.tvToast);
        tvToast.setText(message);
        Toast toast=new Toast(LochCd.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(tastView);
        toast.setGravity(Gravity.BOTTOM|Gravity.FILL_HORIZONTAL,0,0);
        toast.show();

    }

    //---------------------------------------------------------------


}
