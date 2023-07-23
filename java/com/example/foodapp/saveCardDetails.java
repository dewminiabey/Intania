package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saveCardDetails extends AppCompatActivity {
    private ConstraintLayout SBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_card_details);

        SBtn=findViewById(R.id.SBtn);
        SBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(saveCardDetails.this,updateCardDetails.class));
            }
        });
    }
}