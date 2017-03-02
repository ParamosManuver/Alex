package com.mike.alex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateActivity extends AppCompatActivity {
    EditText userName,contacts,password,full_name;
    DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        helper=new DatabaseHelper(this);

        userName=(EditText)findViewById(R.id.username);
        contacts=(EditText)findViewById(R.id.phoneNo);
        password=(EditText)findViewById(R.id.create_password);
        full_name=(EditText)findViewById(R.id.fullName);
        /*fAmount=(EditText)findViewById(R.id.fAmount);
        lAmount=(EditText)findViewById(R.id.lAmount);*/

        final Button create =(Button)findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();

            }
        });
    }

    private void createAccount() {
        final String _username=userName.getText().toString();
        final String _contacts=contacts.getText().toString();
        final String _password=password.getText().toString();
        final String _fullname=full_name.getText().toString();


        if (helper.insertData(_username,_contacts,_fullname,_password)){
            Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_LONG).show();
        }

        else {
            Toast.makeText(getBaseContext(), "Account Creation failed", Toast.LENGTH_LONG).show();
        }


    }
}
