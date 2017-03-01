package com.mike.alex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText password,uname;
    DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        helper=new DatabaseHelper(this);

        password=(EditText)findViewById(R.id.login_password);
        uname=(EditText)findViewById(R.id.login_userName);
        login=(Button)findViewById(R.id.login_loginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _password=password.getText().toString();
                String _uname=uname.getText().toString();
                String db_name = helper.getname(_uname);
                String db_password = helper.getPass(_password);
                if (_uname.equals(db_name) && _password.equals(db_password)) {
                    Intent intent=new Intent(LoginActivity.this,AccountActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
