package com.example.bookmygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity
{
    private EditText Name;
    private EditText Address;
    private EditText PhoneNumber;
    private EditText Email;
    private EditText Username;
    private EditText Password;
    private Button CreateMyAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Name = (EditText) findViewById(R.id.RANameEditText);
        Address = (EditText) findViewById(R.id.RAAddEditText);
        PhoneNumber = (EditText) findViewById(R.id.RAPhoneNumberEditText);
        Email = (EditText) findViewById(R.id.RAEmailEditText);
        Username = (EditText) findViewById(R.id.RAUsernameEditText);
        Password = (EditText) findViewById(R.id.RAPasswordEditText);
        CreateMyAccount = (Button) findViewById(R.id.RACreateMyAccountBtn);

        CreateMyAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                String name= Name.getText().toString();
                String address= Address.getText().toString();
                String phone_number= PhoneNumber.getText().toString();
                String email= Email.getText().toString();
                String username= Username.getText().toString();
                String password= Password.getText().toString();
                String type = "reg";
                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type, name, address, phone_number, email, username, password);

                openUserAvtivity();

            }
        });

    }

    public void openUserAvtivity()
    {

        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);

    }
}
