package com.example.fragment2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button BTsms, BTemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTsms = findViewById(R.id.BTsms);
        BTemail = findViewById(R.id.BTemail);

        BTsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsFragment sms = new SmsFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, sms)
                        .commit();
            }
        });

        BTemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmailFragment email = new EmailFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, email)
                        .commit();
            }
        });
    }
}
