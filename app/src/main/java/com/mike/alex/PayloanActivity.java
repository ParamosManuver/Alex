package com.mike.alex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PayloanActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payloan);


        Famount=(EditText)findViewById(R.id.Famount);
        lamount=(EditText)findViewById(R.id.lamount);
        final Button create =(Button)findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();

            }
        });
    }

    private void createAccount() {
        final String _Famount=Famount.getText().toString();
        final String lamount=lamount.getText().toString();



        if (helper.insertData(Famount,lamount)==true){
            Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(getBaseContext(), "Account Creation failed", Toast.LENGTH_LONG).show();
        }


    }
}




}
}
