package com.example.marzic.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity  extends Activity implements View.OnClickListener {

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        btn0 = (Button)findViewById(R.id.btn0);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnPoint = (Button)findViewById(R.id.btnPoint);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMultiply = (Button)findViewById(R.id.btnMultiply);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnEquals = (Button)findViewById(R.id.btnEquals);
        btnDel = (Button)findViewById(R.id.btnDel);
        btnC = (Button)findViewById(R.id.btnC);
        display = (EditText) findViewById(R.id.display);

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


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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
