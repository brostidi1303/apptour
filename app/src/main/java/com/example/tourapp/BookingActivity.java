package com.example.tourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class BookingActivity extends AppCompatActivity {
    String[] itemsPayment = {"Visa Card", "ZaloPay", "Momo"};
    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;
    Toolbar toolbar;
    TextView value;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        toolbar = findViewById(R.id.toolbar);
        value = findViewById(R.id.txt_amount);
        autoCompleteTextView =findViewById(R.id.autotext);
        adapterItems = new ArrayAdapter<String>(this,R.layout.list_payment_method,itemsPayment);
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                String items = adapterView.getItemAtPosition(i).toString();
            }
        });

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Booking confirmation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void increase(View v){
        count++;
        value.setText("" + count);
    }

    public void decrease(View v){
        if(count <= 0 ){
            count = 0;
        }else
            count--;
            value.setText("" +count);
    }
    //đâsdsadsadsadsadasd
}