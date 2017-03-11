package com.mike.alex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PayshortTermActivity extends AppCompatActivity {
    EditText amount;
    Button pay;
    DatabaseHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payshort_term);
        helper=new DatabaseHelper(this);
        amount=(EditText)findViewById(R.id.pay_short_amount);
        pay=(Button)findViewById(R.id.pay_short_btn);

        final int _amount=Integer.parseInt(amount.getText().toString());
        int pAmount=Integer.parseInt(helper.getShortLoan());
        final int a=pAmount-_amount;
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (helper.payShortLoan(helper.getAccountName(),a)){
                    Toast.makeText(PayshortTermActivity.this, "Amount Ksh "+a +"Paid", Toast.LENGTH_SHORT).show();
                }
                else {Toast.makeText(PayshortTermActivity.this, "Error... Loan Payment Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
