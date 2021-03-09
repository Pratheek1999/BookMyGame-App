package com.example.bookmygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity
{
    private Button SignIn;
    private Button Login;
    private EditText Username;
    private EditText Password;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Password= (EditText) findViewById(R.id.UAPasswordEdiText);
        Username= (EditText) findViewById(R.id.UAUsernameEditText);
        Login= (Button) findViewById(R.id.UALoginBtn);




        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                String user_name = Username.getText().toString();
                String pass_word = Password.getText().toString();
                String type="Login";
                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type, user_name, pass_word);
                validate(Username.getText().toString(), Password.getText().toString());


            }
        });

        SignIn = (Button)findViewById(R.id.UASignInBtn);

        SignIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                openRegistrationActivity();

            }
        });
    }

    public void openRegistrationActivity()
    {

        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);

    }

    public void validate(String userName, String userPassword)
    {

        if ((userName.equals("Admin")) && (userPassword.equals("Admin")))
        {

            Toast.makeText(getApplicationContext(), "Successful Login ", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, UserActivity1.class);
            startActivity(intent);


        }

    }

}
