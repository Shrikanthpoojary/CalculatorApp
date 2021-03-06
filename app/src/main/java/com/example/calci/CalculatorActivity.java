package com.example.calci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculatorActivity extends AppCompatActivity {
    public Button Sbtn, Cbtn, Nbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Sbtn = (Button) findViewById(R.id.SgpaBtn);
        Cbtn = (Button) findViewById(R.id.CgpaBtn);
        Nbtn = (Button) findViewById(R.id.NrmlBtn);

        Sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalculatorActivity.this, Sgpa.class);
                startActivity(intent);
            }
        });
        Cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cgpa = new Intent(CalculatorActivity.this, Cgpa.class);
                startActivity(cgpa);
            }
        });
        Nbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nrmlca = new Intent(CalculatorActivity.this, Nrmlcal.class);
                startActivity(nrmlca);
            }
        });
    }
}