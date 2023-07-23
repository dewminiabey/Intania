package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class paymentSuccess extends AppCompatActivity {
    private ConstraintLayout success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_success);


        success=findViewById(R.id.success);
        success.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(paymentSuccess.this,Orderaccept.class));
            }
        });
    }
}