package com.example.bookmygame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    private Button Administrator;
    private Button User;
    private Button TurfOwners;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Administrator = (Button) findViewById(R.id.AdministratorBtn);
        User = (Button) findViewById(R.id.UserBtn);
        TurfOwners = (Button) findViewById(R.id.TurfOwnersBtn);

        Administrator.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                openAdministratorActivity();

            }
        });

        User.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                openUserActivity();

            }
        });

        TurfOwners.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                openTurfOwnersActivity();

            }
        });

    }
    public void openAdministratorActivity()
    {

        Intent intent = new Intent(this, AdministratorActivity.class);
        startActivity(intent);

    }

    public void openUserActivity()
    {

        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);

    }

    public void openTurfOwnersActivity()
    {

        Intent intent = new Intent(this, TurfOwnersActivity.class);
        startActivity(intent);

    }
}
