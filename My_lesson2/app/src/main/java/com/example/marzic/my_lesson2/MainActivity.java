package com.example.marzic.my_lesson2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView myText;
    Button buttonOk;
    Button buttonCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        myText = (TextView) findViewById(R.id.textView1);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button) findViewById(R.id.btnCancel);
        View.OnClickListener clickBtn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               switch (view.getId()){
                   case R.id.btnOk:
                       myText.setText("Нажата кнопка Ok");
                       break;
                   case R.id.btnCancel:
                       myText.setText("Нажата кнопочка Cancel");
                       break;
               }

            }
        };
        buttonCancel.setOnClickListener(clickBtn);
        buttonOk.setOnClickListener(clickBtn);

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
}
