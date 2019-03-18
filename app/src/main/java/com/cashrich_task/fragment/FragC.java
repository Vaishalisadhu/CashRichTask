package com.cashrich_task.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.cashrich_task.MainActivity;
import com.cashrich_task.R;

import java.util.Objects;


public class FragC extends Fragment {


    View view;
    public TextView txtC;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_c, container, false);
        getViewControlls(view);

        return view;

    }

    @SuppressLint("SetTextI18n")
    private void getViewControlls(View view) {

        txtC = view.findViewById(R.id.textViewC);

    }

}
