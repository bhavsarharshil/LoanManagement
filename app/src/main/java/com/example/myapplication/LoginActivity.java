package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button login;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        assignval();
        loginclick();
    }
    private void assignval(){
        email=(EditText)findViewById(R.id.et1);
        password=(EditText)findViewById(R.id.et2);
        login=(Button)findViewById(R.id.btn1);
        back=(Button)findViewById(R.id.btn2);
    }
    private void loginclick(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=email.getText().toString().trim();
                String pass=password.getText().toString().trim();
                if(user==null ||pass==null){
                    Toast.makeText(LoginActivity.this,"Invalid emailid or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
