package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.textView);
        Intent intent =getIntent();
        Intent intent1 =getIntent();
        if(intent.getIntExtra("help",0)==1){

            textView.setText("\t\t\t\t\t\t\t\t\t\t\tVARIOUS FULL FORMS\n\n" +
                    "USD - United States Dollar\n" +
                    "AED - United Arab Emirates Dirham\n" +
                    "EUR - Euro\n" +
                    "SAR - Saudi Riyal\n" +
                    "GBP - Great Britain Pound\n" +
                    "QAR - Qatari Riyal\n"+
                    "OMR - Omani Riyal\n"+
                    "CAD - Canadian Dollar\n"+
                    "AUD - Australian Dollar\n"+
                    "CHY - Chinese Yuan\n"+
                    "JPY - Japanese Yen\n"+
                    "MXN - Mexican Peso\n"+
                    "SGD - Singapore dollar\n"+
                    "CHF - Swiss Franc\n"+
                    "INR - Indian Rupee\n");

        }
        else if(intent1.getIntExtra("aboutMe",0)==1){
            textView.setText("NAME - SAHIL HARJAI\n"+
                    "MOZILLA FIREFOX CLUB");
        }


    }
}
