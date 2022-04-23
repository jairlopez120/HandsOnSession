package com.example.handsonsession;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.User_field);
        EditText pass = findViewById(R.id.Pass_field);

        Button login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = user.getText().toString();
                String password = pass.getText().toString();


                System.out.println("Hello World");
                if(username.equals("abd") && password.equals("123"))
                {
                    //successful login
                    Toast toast = Toast.makeText(getApplicationContext(), "Success",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    //failed login
                    Toast toast = Toast.makeText(getApplicationContext(), "Try Again",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
}