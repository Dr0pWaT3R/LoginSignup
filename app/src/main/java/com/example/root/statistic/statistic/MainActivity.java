package com.example.root.statistic.statistic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.root.statistic.R;
import com.example.root.statistic.Register;

public class MainActivity extends AppCompatActivity {

    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp = (TextView)findViewById(R.id.link_signup_id);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Register.class);
                startActivity(intent);
            }
        });
    }
}
