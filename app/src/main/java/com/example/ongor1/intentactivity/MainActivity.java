package com.example.ongor1.intentactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goToSecondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToSecondButton = (Button) findViewById(R.id.ShowButtonID);
        goToSecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Intent here format#1
                //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Intent Intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(Intent);
                Intent.putExtra("Message","Hello From MainActivity");
                Intent.putExtra("SecondMessage","Hello Again");
                Intent.putExtra("Value",123);
                startActivity(Intent);

            }
        });
    }
}
