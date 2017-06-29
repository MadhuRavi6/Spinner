package com.example.andriod.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner sp;

        int pos,c;
    String str;
    String names[]={"Dollar","Rupee","Euro"};

    Button mybutton;
    EditText myet;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spinner);
        mybutton = (Button) findViewById(R.id.button);
        myet = (EditText) findViewById(R.id.editText);
        tv1=(TextView) findViewById(R.id.tv);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, names);
        sp.setAdapter(aa);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pos=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(myet.getText().toString());
                if(pos==0)
                {
                    c=a*60;
                    str=Integer.toString(c);
                    tv1.setText(str);

                }
                else if(pos==1)
                {
                    c=a*1;
                    str=Integer.toString(c);
                    tv1.setText(str);

                }
                else
                {
                    c=a*90;
                    str=Integer.toString(c);
                    tv1.setText(str);

                }


            }

        });
    }


}
