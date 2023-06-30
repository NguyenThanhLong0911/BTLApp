package com.example.appbanhangonline.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import com.example.appbanhangonline.R;

public class PaymentActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView subTotal,shipping,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        toolbar = findViewById(R.id.payment_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        double amount = 0.0,Total;
        amount = getIntent().getDoubleExtra("amount",0.0);
        subTotal = findViewById(R.id.sub_total);
        shipping = findViewById(R.id.textView17);
        total = findViewById(R.id.total_amt);
        Total = amount + 30;
        shipping.setText(30+"$");
        subTotal.setText(amount+"$");
        total.setText(Total+"$");


    }
}