package com.example.onoff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


   // public class MainActivity extends Activity {

        String editString="";

        Button btn;
        EditText ed;
        ToggleButton toggle;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btn = (Button)findViewById(R.id.btn);
            ed  = (EditText)findViewById(R.id.ed);
            toggle = (ToggleButton)findViewById(R.id.btn);

            editString = ed.getText().toString();

            btn.setOnClickListener(new View.OnClickListener() {


                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    toggle.toggle();
                    if(editString.equals("1")){

                        toggle.setTextOff("TOGGLE ON");

                    }
                    else if(editString.equals("0")){

                        toggle.setTextOn("TOGGLE OFF");

                    }
                }
            });
        }
    }

