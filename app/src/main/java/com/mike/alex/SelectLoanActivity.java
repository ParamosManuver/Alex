package com.mike.alex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SelectLoanActivity extends AppCompatActivity {
    Button LB,SB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_loan);

        LB=(Button)findViewById(R.id.Select_long);
        SB=(Button)findViewById(R.id.Select_short);
        LB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentloan=new Intent(SelectLoanActivity.this,ApplyLongActivity.class);
                startActivity(intentloan);

            }
        });
        SB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentloan=new Intent(SelectLoanActivity.this,ApplyShortActivity.class);
                startActivity(intentloan);

            }
        });
    }
}






