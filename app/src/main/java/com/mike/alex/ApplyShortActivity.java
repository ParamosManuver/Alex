package com.mike.alex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ApplyShortActivity extends AppCompatActivity {
    DatabaseHelper helper;
    EditText amount;
    Button loan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_short);
        amount=(EditText)findViewById(R.id.apply_short_amount);
        helper=new DatabaseHelper(this);
        loan=(Button)findViewById(R.id.btn_apply_long);
        int _amount=Integer.parseInt(amount.getText().toString());
        final int intLoan=_amount+(_amount*18/100);
        loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (helper.insertShortLoan(helper.getAccountName(),intLoan)){
                    Toast.makeText(ApplyShortActivity.this, "Amount Ksh "+intLoan +" Paid", Toast.LENGTH_SHORT).show();
                }
                else {Toast.makeText(ApplyShortActivity.this, "Error... Loan Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
