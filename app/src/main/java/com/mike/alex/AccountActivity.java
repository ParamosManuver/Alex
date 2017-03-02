package com.mike.alex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountActivity extends AppCompatActivity {
    Button payLoan,reqLoan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        payLoan=(Button)findViewById(R.id.account_pay_loan);
        payLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountActivity.this,PayloanActivity.class);
                startActivity(intent);
            }
        });

        reqLoan=(Button)findViewById(R.id.account_reg_loan);
        reqLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountActivity.this,SelectLoanActivity.class);
                startActivity(intent);
            }
        });
    }
}
