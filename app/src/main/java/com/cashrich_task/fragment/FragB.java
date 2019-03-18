package com.cashrich_task.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.cashrich_task.MainActivity;
import com.cashrich_task.R;

import java.util.Objects;


public class FragB extends Fragment {


    View view;
    private EditText edtB;
    private int resultB;
    private int resultA;
    private int outputBa;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_b, container, false);
        getViewControlls(view);

        edtB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    resultB = Integer.parseInt(s.toString().trim());
                    resultA = ((MainActivity) Objects.requireNonNull(getActivity())).getFragAvalue();
                    outputBa = resultB + resultA;

                    ((MainActivity) Objects.requireNonNull(getActivity())).setFragBvalue(outputBa);

                } catch (NumberFormatException e) {
                    e.printStackTrace();

                }

            }
        });

        return view;
    }

    private void getViewControlls(View rootView) {

        edtB = rootView.findViewById(R.id.editTextB);


    }


}
