package com.mike.alex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PayloanActivity extends AppCompatActivity {
    Button LT, ST;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payloan);

        LT = (Button) findViewById(R.id.pay_short_term_loan);
        ST = (Button) findViewById(R.id.pay_long_term_loan);
        LT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentloan = new Intent(PayloanActivity.this,PaylongTermActivity.class);
                startActivity(intentloan);

            }
        });
        ST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentloan = new Intent(PayloanActivity.this, PayshortTermActivity.class);
                startActivity(intentloan);
            }
        });

    }
}



