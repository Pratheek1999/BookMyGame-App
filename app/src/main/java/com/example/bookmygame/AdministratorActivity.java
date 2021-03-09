package com.example.bookmygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdministratorActivity extends AppCompatActivity
{

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrator);

        Name = (EditText)findViewById(R.id.AAUsernameEditText);
        Password = (EditText)findViewById(R.id.AAPasswordEditText);
        Info = (TextView)findViewById(R.id.NOARTextView);
        Login = (Button)findViewById(R.id.AALoginBtn);

        Info.setText("Number of Attempts Remaining: 3");

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                validate(Name.getText().toString(), Password.getText().toString());

            }
        });
    }

    private void validate(String userName, String userPassword)
    {

        if ((userName.equals("admin")) && (userPassword.equals("admin")))
        {

            Toast.makeText(getApplicationContext(), "Successful Login ", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, AdministratorActivity1.class);
            startActivity(intent);


        }

        else
        {

            counter --;


            Info.setText("Number Of Attempts Remaining: " + String.valueOf(counter));
            Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_SHORT).show();

            if(counter == 0)
            {

                Login.setEnabled(false);

            }

        }

    }
}
