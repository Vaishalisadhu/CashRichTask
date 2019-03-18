package com.cashrich_task;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;

import com.cashrich_task.fragment.FragA;
import com.cashrich_task.fragment.FragB;
import com.cashrich_task.fragment.FragC;

public class MainActivity extends FragmentActivity {

    int valueofA;
    int valueofB;
    FragA frga;
    FragB frgb;
    FragC frgc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        frga = new FragA();
        frgb = new FragB();
        frgc = new FragC();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.My_Container_A, frga, "Frag_A");
        transaction.add(R.id.My_Container_B, frgb, "Frag_B");
        transaction.add(R.id.My_Container_C, frgc, "Frag_C");
        transaction.commit();


    }


    public int setFragAvalue(int value) {

        setTotalResult(value);
        return valueofA = value;
    }


    public int getFragAvalue() {
        return valueofA;
    }

    public int setFragBvalue(int value) {

        setTotalResult(value);

        return valueofB = value;
    }

    public int getFragBvalue() {
        return valueofB;
    }


    @SuppressLint("SetTextI18n")
    public void setTotalResult(int totalofAB) {

        frgc.txtC.setText(Integer.toString(totalofAB));

    }


}
