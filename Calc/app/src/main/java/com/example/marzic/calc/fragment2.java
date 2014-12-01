package com.example.marzic.calc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Zimovit on 31.10.2014.
 */
public class fragment2 extends Fragment implements View.OnClickListener{

    Spinner spinnerTop;
    Spinner spinnerBot;
    EditText display1;
    EditText display2;
    Button buttonTop;
    Button buttonBot;
    public String displayContent1;
    public String displayContent2;
    public int spinnerPosition1;
    public int spinnerPosition2;
    public double converctor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.convectr, null);

        spinnerTop = (Spinner)view1.findViewById(R.id.spinner1);
        spinnerBot = (Spinner)view1.findViewById(R.id.spinner2);
        display1 = (EditText)view1.findViewById(R.id.display1);
        display2 = (EditText)view1.findViewById(R.id.display2);
        buttonTop = (Button)view1.findViewById(R.id.buttonTop);
        buttonBot = (Button)view1.findViewById(R.id.buttonBot);

        buttonTop.setOnClickListener(this);
        buttonBot.setOnClickListener(this);



        ArrayAdapter<?> adapter =
                ArrayAdapter.createFromResource(view1.getContext(), R.array.valuesSpinner1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerTop.setAdapter(adapter);

        return view1;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonTop:
                if (display2.getText().toString().isEmpty())
                {
                    break;
                }
                else {
                    displayContent2 = display2.getText().toString();
                    spinnerPosition2 = spinnerBot.getSelectedItemPosition();
                    spinnerPosition1 = spinnerTop.getSelectedItemPosition();
                    converctor = Double.parseDouble(displayContent2) * getCoefficient1(spinnerPosition1, spinnerPosition2);

                    display1.setText(Double.toString(converctor));
                }


                break;
            case R.id.buttonBot:
                if (display1.getText().toString().isEmpty())
                {
                    break;
                }
                displayContent1 = display1.getText().toString();
                spinnerPosition2 = spinnerBot.getSelectedItemPosition();
                spinnerPosition1 = spinnerTop.getSelectedItemPosition();
                converctor = Double.parseDouble(displayContent1)*getCoefficient2(spinnerPosition1, spinnerPosition2);

                display2.setText(Double.toString(converctor));
                break;
        }


    }
    public double getCoefficient2(int spinnerPosition1, int spinnerPosition2)
    {
        double coefficient = 1.0;
        switch (spinnerPosition1){
            case 0:
                switch (spinnerPosition2){
                    case 0:
                        coefficient = 1;
                        break;
                    case 1:
                        coefficient = 0.001;
                        break;
                    case 2:
                        coefficient = 0.000001;
                        break;
                    case 3:
                        coefficient = 5;
                        break;
                    case 4:
                        coefficient = 0.03215;
                        break;
                    case 5:
                        coefficient = 0.00006105;
                        break;
                }
                break;
            case 1:
                switch (spinnerPosition2){
                    case 0:
                        coefficient = 1000;
                        break;
                    case 1:
                        coefficient = 1;
                        break;
                    case 2:
                        coefficient = 0.001;
                        break;
                    case 3:
                        coefficient = 5000;
                        break;
                    case 4:
                        coefficient = 32.15;
                        break;
                    case 5:
                        coefficient = 0.06105;
                        break;
                }
                break;
            case 2:
                switch (spinnerPosition2){
                    case 0:
                        coefficient = 1000000;
                        break;
                    case 1:
                        coefficient = 1000;
                        break;
                    case 2:
                        coefficient = 1;
                        break;
                    case 3:
                        coefficient = 5000000;
                        break;
                    case 4:
                        coefficient = 32150;
                        break;
                    case 5:
                        coefficient = 61.050061;
                        break;
                }
                break;
            case 3:
                switch (spinnerPosition2){
                    case 0:
                        coefficient = 0.2;
                        break;
                    case 1:
                        coefficient = 0.0002;
                        break;
                    case 2:
                        coefficient = 0.0000002;
                        break;
                    case 3:
                        coefficient = 1;
                        break;
                    case 4:
                        coefficient = 0.00643;
                        break;
                    case 5:
                        coefficient = 0.00001221;
                        break;
                }
                break;
            case 4:
                switch (spinnerPosition2){
                    case 0:
                        coefficient = 31.1;
                        break;
                    case 1:
                        coefficient = 0.311;
                        break;
                    case 2:
                        coefficient = 0.0000311;
                        break;
                    case 3:
                        coefficient = 155.5;
                        break;
                    case 4:
                        coefficient = 1;
                        break;
                    case 5:
                        coefficient = 0.001899;
                        break;
                }
                break;
            case 5:
                switch (spinnerPosition2){
                    case 0:
                        coefficient = 16380;
                        break;
                    case 1:
                        coefficient = 16.38;
                        break;
                    case 2:
                        coefficient = 0.01638;
                        break;
                    case 3:
                        coefficient = 81900;
                        break;
                    case 4:
                        coefficient = 526.6;
                        break;
                    case 5:
                        coefficient = 1;
                        break;
                }
                break;
        }

        return coefficient;
    }
    public double getCoefficient1(int spinnerPosition1, int spinnerPosition2)
    {
        double coefficient = 1;

        switch (spinnerPosition2){
            case 0:
                switch (spinnerPosition1){
                    case 0:
                        coefficient = 1;
                        break;
                    case 1:
                        coefficient = 0.001;
                        break;
                    case 2:
                        coefficient = 0.000001;
                        break;
                    case 3:
                        coefficient = 5;
                        break;
                    case 4:
                        coefficient = 0.03215;
                        break;
                    case 5:
                        coefficient = 0.00006105;
                        break;
                }
                break;
            case 1:
                switch (spinnerPosition1){
                    case 0:
                        coefficient = 1000;
                        break;
                    case 1:
                        coefficient = 1;
                        break;
                    case 2:
                        coefficient = 0.001;
                        break;
                    case 3:
                        coefficient = 5000;
                        break;
                    case 4:
                        coefficient = 32.15;
                        break;
                    case 5:
                        coefficient = 0.06105;
                        break;
                }
                break;
            case 2:
                switch (spinnerPosition1){
                    case 0:
                        coefficient = 1000000;
                        break;
                    case 1:
                        coefficient = 1000;
                        break;
                    case 2:
                        coefficient = 1;
                        break;
                    case 3:
                        coefficient = 5000000;
                        break;
                    case 4:
                        coefficient = 32150;
                        break;
                    case 5:
                        coefficient = 61.050061;
                        break;
                }
                break;
            case 3:
                switch (spinnerPosition1){
                    case 0:
                        coefficient = 0.2;
                        break;
                    case 1:
                        coefficient = 0.0002;
                        break;
                    case 2:
                        coefficient = 0.0000002;
                        break;
                    case 3:
                        coefficient = 1;
                        break;
                    case 4:
                        coefficient = 0.00643;
                        break;
                    case 5:
                        coefficient = 0.00001221;
                        break;
                }
                break;
            case 4:
                switch (spinnerPosition1){
                    case 0:
                        coefficient = 31.1;
                        break;
                    case 1:
                        coefficient = 0.311;
                        break;
                    case 2:
                        coefficient = 0.0000311;
                        break;
                    case 3:
                        coefficient = 155.5;
                        break;
                    case 4:
                        coefficient = 1;
                        break;
                    case 5:
                        coefficient = 0.001899;
                        break;
                }
                break;
            case 5:
                switch (spinnerPosition1){
                    case 0:
                        coefficient = 16380;
                        break;
                    case 1:
                        coefficient = 16.38;
                        break;
                    case 2:
                        coefficient = 0.01638;
                        break;
                    case 3:
                        coefficient = 81900;
                        break;
                    case 4:
                        coefficient = 526.6;
                        break;
                    case 5:
                        coefficient = 1;
                        break;
                }
                break;
        }

        return coefficient;
    }
}
