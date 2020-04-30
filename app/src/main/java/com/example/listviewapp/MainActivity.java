package com.example.listviewapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ListView listView1;
    ArrayList<String> friends;
    EditText rsAmount;
    String rs,eddy,rupeesString;
    int k;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.help:
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("help",1);
                startActivity(intent);
                return true;
            case R.id.aboutMe:
                Intent intent1 = new Intent(getApplicationContext(),Main2Activity.class);
                intent1.putExtra("aboutMe",1);
                startActivity(intent1);
                return true;
                default:
                    return false;
        }

    }

    public void rupees_to_dollars(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.013333;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in USD is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_aed(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.04797;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in AED is " + dollarsString,Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_eur(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.01021;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in EUR is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_sar(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.04898;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in SAR is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_gbp(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.0104;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in GBP is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_qar(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.04754;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in QAR is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_omr(String rs)
    {
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.00502;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in OMR is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_cad(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.013333;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in CAD is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_aud(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.02053;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in AUD is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_cny(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.09236;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in CNY is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_jpy(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *1.4048;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in JPY is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_mxn(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.3092;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in MXN is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_sgd(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.01857;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in SGD is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_chf(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *0.01263;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in CHF is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public void rupees_to_inr(String rs){
        String t = rs;
        double rupees = Double.parseDouble(t);
        double Dollars = rupees *1;
        String dollarsString = String.format("%.2f",Dollars);
        Toast.makeText(this,"Amount in INR is " + dollarsString, Toast.LENGTH_SHORT).show();
    }
    public String to_rupees(int k){
        eddy=rsAmount.getText().toString();
        if(k==0){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*76.5619;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==1){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*20.8677;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==2){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*83.1101;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==3){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*20.4353;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==4){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*95.4621;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==5){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*21.0507;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==6){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*199.271;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==7){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*54.3941;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==8){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*48.6452;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==9){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*10.8264;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==10){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*0.71037;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==11){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*3.17683;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==12){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*53.8575;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==13){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*79.0631;
            rupeesString = String.format("%.2f",rupees);
        }
        else if(k==14){
            double dollars = Double.parseDouble(eddy);
            double rupees = dollars*1;
            rupeesString = String.format("%.2f",rupees);
        }
        return rupeesString;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         listView = (ListView) findViewById(R.id.listView);
         listView1 = (ListView) findViewById(R.id.listView1);

          rsAmount = (EditText) findViewById(R.id.editText);
         friends = new ArrayList<String>();

        friends.add("USD");
        friends.add("AED");
        friends.add("EUR");
        friends.add("SAR");
        friends.add("GBP");
        friends.add("QAR");
        friends.add("OMR");
        friends.add("CAD");
        friends.add("AUD");
        friends.add("CNY");
        friends.add("JPY");
        friends.add("MXN");
        friends.add("SGD");
        friends.add("CHF");
        friends.add("INR");




        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friends);
        listView.setAdapter(arrayAdapter);

        listView.setFriction(ViewConfiguration.getScrollFriction() * 1000);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                if(i==0){
                    k=0;
                }
                else if(i==1){
                    k=1;
                }
                else if(i==2){
                    k=2;
                }
                else if(i==3){
                    k=3;
                }
                else if(i==4){
                    k=4;
                }
                else if(i==5){
                    k=5;
                }
                else if(i==6){
                    k=6;
                }
                else if(i==7){
                    k=7;
                }
                else if(i==8){
                    k=8;
                }
                else if(i==9){
                    k=9;
                }
                else if(i==10){
                    k=10;
                }
                else if(i==11){
                    k=11;
                }
                else if(i==12){
                    k=12;
                }
                else if(i==13){
                    k=13;
                }
                else if(i==14){
                    k=14;
                }
                Toast.makeText(getApplicationContext(), friends.get(i), Toast.LENGTH_LONG).show();
                rsAmount.setHint("Enter the amount in "+friends.get(i));
            }
        });

        listView1.setAdapter(arrayAdapter);
        listView1.setFriction(ViewConfiguration.getScrollFriction() * 1000);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                try {

                    if (i == 0) {
                        rs = to_rupees(k);
                        rupees_to_dollars(rs);
                    } else if (i == 1) {
                        rs = to_rupees(k);
                        rupees_to_aed(rs);
                    } else if (i == 2) {
                        rs = to_rupees(k);
                        rupees_to_eur(rs);
                    } else if (i == 3) {
                        rs = to_rupees(k);
                        rupees_to_sar(rs);
                    } else if (i == 4) {
                        rs = to_rupees(k);
                        rupees_to_gbp(rs);
                    } else if (i == 5) {
                        rs = to_rupees(k);
                        rupees_to_qar(rs);
                    } else if (i == 6) {
                        rs = to_rupees(k);
                        rupees_to_omr(rs);
                    } else if (i == 7) {
                        rs = to_rupees(k);
                        rupees_to_cad(rs);
                    } else if (i == 8) {
                        rs = to_rupees(k);
                        rupees_to_aud(rs);
                    } else if (i == 9) {
                        rs = to_rupees(k);
                        rupees_to_cny(rs);
                    } else if (i == 10) {
                        rs = to_rupees(k);
                        rupees_to_jpy(rs);
                    } else if (i == 11) {
                        rs = to_rupees(k);
                        rupees_to_mxn(rs);
                    } else if (i == 12) {
                        rs = to_rupees(k);
                        rupees_to_sgd(rs);
                    } else if (i == 13) {
                        rs = to_rupees(k);
                        rupees_to_chf(rs);
                    } else if (i == 14) {
                        rs = to_rupees(k);
                        rupees_to_inr(rs);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(),"First Choose from the convert from list",Toast.LENGTH_LONG);
                }
            }
        });

    }


}
