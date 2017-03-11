package com.mike.alex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {
    TextView uName,amount,lamount,tamount;
    Button payLoan,reqLoan;
    DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        helper=new DatabaseHelper(this);
        amount=(TextView)findViewById(R.id.account_lAmount);
        lamount=(TextView)findViewById(R.id.account_s_lAmount) ;
        tamount=(TextView)findViewById(R.id.account_t_lAmount) ;
        uName=(TextView)findViewById(R.id.account_username) ;
        payLoan=(Button)findViewById(R.id.account_pay_loan);

        uName.setText(helper.getAccountName());
        amount.setText(helper.getShortLoan());
        lamount.setText(helper.getLongLoan());
        tamount.setText(helper.getLongLoan()+helper.getShortLoan());
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
