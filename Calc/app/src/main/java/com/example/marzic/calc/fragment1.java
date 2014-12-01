package com.example.marzic.calc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Zimovit on 22.10.2014.
 */
public class fragment1 extends Fragment implements View.OnClickListener {

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnPoint;
    Button btnAdd;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    Button btnEquals;
    Button btnDel;
    Button btnC;
    String displayContent;
    EditText display;
    ArrayList<Double> list = new ArrayList<Double>();
    public double num1;
    public double num2;
    public boolean add = false;
    public double result = 0;
    public boolean clickEquals = false;
    public boolean minus = false;
    public boolean multiply = false;
    public boolean divide = false;
    public boolean deleteDisplay = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.calc,null);

        btn0 = (Button)v.findViewById(R.id.btn0);
        btn1 = (Button)v.findViewById(R.id.btn1);
        btn2 = (Button)v.findViewById(R.id.btn2);
        btn3 = (Button)v.findViewById(R.id.btn3);
        btn4 = (Button)v.findViewById(R.id.btn4);
        btn5 = (Button)v.findViewById(R.id.btn5);
        btn6 = (Button)v.findViewById(R.id.btn6);
        btn7 = (Button)v.findViewById(R.id.btn7);
        btn8 = (Button)v.findViewById(R.id.btn8);
        btn9 = (Button)v.findViewById(R.id.btn9);
        btnPoint = (Button)v.findViewById(R.id.btnPoint);
        btnAdd = (Button)v.findViewById(R.id.btnAdd);
        btnMinus = (Button)v.findViewById(R.id.btnMinus);
        btnMultiply = (Button)v.findViewById(R.id.btnMultiply);
        btnDivide = (Button)v.findViewById(R.id.btnDivide);
        btnEquals = (Button)v.findViewById(R.id.btnEquals);
        btnDel = (Button)v.findViewById(R.id.btnDel);
        btnC = (Button)v.findViewById(R.id.btnC);
        display = (EditText) v.findViewById(R.id.display);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnC.setOnClickListener(this);



        return v;
    }

    @Override
    public void onClick(View view) {

        displayContent = display.getText().toString();



        switch (view.getId())
        {
            case R.id.btn0:
//                if (displayContent.equals("0"))
//                    break;
//                else
//                    display.setText(displayContent + "0");
                printButton(view);
                break;
            case R.id.btn1:
//                if (displayContent.equals("0"))
//                     display.setText("1");
//                 else
//                    display.setText(displayContent + "1");
                printButton(view);
                break;
            case R.id.btn2:
//                if (displayContent.equals("0"))
//                    display.setText("2");
//                else
//                    display.setText(displayContent + "2");
                printButton(view);

                break;
            case R.id.btn3:
//                if (displayContent.equals("0"))
//                    display.setText("3");
//                else
//                    display.setText(displayContent + "3");
                printButton(view);
                break;
            case R.id.btn4:
//                if (displayContent.equals("0"))
//                    display.setText("4");
//                else
//                    display.setText(displayContent + "4");
                printButton(view);
                break;
            case R.id.btn5:
//                if (displayContent.equals("0"))
//                    display.setText("5");
//                else
//                    display.setText(displayContent + "5");
                printButton(view);
                break;
            case R.id.btn6:
//                if (displayContent.equals("0"))
//                    display.setText("6");
//                else
//                    display.setText(displayContent + "6");
                printButton(view);
                break;
            case R.id.btn7:
//                if (displayContent.equals("0"))
//                    display.setText("7");
//                else
//                    display.setText(displayContent + "7");
                printButton(view);
                break;
            case R.id.btn8:
//                if (displayContent.equals("0"))
//                    display.setText("8");
//                else
//                    display.setText(displayContent + "8");
                printButton(view);
                break;
            case R.id.btn9:
//                if (displayContent.equals("0"))
//                    display.setText("9");
//                else
//                    display.setText(displayContent + "9");
                printButton(view);
                break;
            case R.id.btnDel:
                display.setText("0");
                breakFlags();
                num1 = 0;
                num2 = 0;
                result = 0;
                break;
            case R.id.btnC:
                if (displayContent.equals("Infinity"))
                {
                    break;
                }
                if (!displayContent.equals("0")) {
                    CharSequence Buff = display.getText();
                    display.setText(Buff.subSequence(0, (display.getText().length() - 1)));
                }
                break;
            case R.id.btnPoint:
                displayContent = display.getText().toString();
                if (!displayContent.contains("."))
                    display.setText(displayContent + ".");
                break;
            case R.id.btnAdd:
                num1 = Double.parseDouble(displayContent);

                //display.setText("0");
                breakFlags();
                deleteDisplay = true;
                add = true;

                break;


            case R.id.btnMinus:
                num1 = Double.parseDouble(displayContent);

                //display.setText("0");
                breakFlags();
                deleteDisplay = true;
                minus = true;
                break;

            case R.id.btnMultiply:
                num1 = Double.parseDouble(displayContent);


                breakFlags();
                deleteDisplay = true;
                multiply = true;
                break;
            case R.id.btnDivide:
                num1 = Double.parseDouble(displayContent);


                breakFlags();
                deleteDisplay = true;
                divide = true;
                break;

            case R.id.btnEquals:
                if (clickEquals) {
                    break;
                }

                clickEquals = true;

                if (add) {
                    num2 = Double.parseDouble(displayContent);

                    result = num1 + num2;

                    display.setText(Double.toString(result));
                } else if (minus) {
                    num2 = Double.parseDouble(displayContent);
                    result = num1 - num2;
                    display.setText(Double.toString(result));
                } else if (multiply) {
                    num2 = Double.parseDouble(displayContent);
                    result = num1 * num2;
                    display.setText(Double.toString(result));
                } else if (divide) {
                    num2 = Double.parseDouble(displayContent);

                    result = num1 / num2;

                }
                display.setText(Double.toString(result));

                break;
        }

    }
    public void breakFlags()
    {
        minus = false;
        add = false;
        multiply = false;
        divide = false;
        clickEquals = false;
    }
    public void printButton(View view)
    {
        Button button = (Button) view;
        if (deleteDisplay || clickEquals)
        {
            display.setText(button.getText().toString());
            deleteDisplay = false;
            clickEquals = false;
        }
        else {
            if (displayContent.equals("0")) {

                display.setText(button.getText().toString());

            } else
                display.setText(displayContent + button.getText().toString());
        }
    }
}
