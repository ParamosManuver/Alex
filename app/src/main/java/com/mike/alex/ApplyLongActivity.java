package com.mike.alex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ApplyLongActivity extends AppCompatActivity {
    EditText amount;
    Button loan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_long);
        amount=(EditText)findViewById(R.id.apply_long_amount);
        final DatabaseHelper helper=new DatabaseHelper(this);
        loan=(Button)findViewById(R.id.btn_apply_long);
        int _amount=Integer.parseInt(amount.getText().toString());
        final int intLoan=_amount+(_amount*18/100);
        loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (helper.insertLongLoan(helper.getAccountName(),intLoan)){
                    Toast.makeText(ApplyLongActivity.this, "Amount Ksh "+intLoan +" Paid", Toast.LENGTH_SHORT).show();
                }
                else {Toast.makeText(ApplyLongActivity.this, "Error... Loan Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
