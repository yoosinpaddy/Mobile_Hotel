package com.trichain.mobilehotel.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.trichain.mobilehotel.R;

public class BillPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_payment);
    }
    public void MakePayment(View v){
        finish();
    }
}
