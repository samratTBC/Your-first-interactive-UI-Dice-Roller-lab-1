package com.example.mobile_dev_android_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button rollBtn;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollBtn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, "Dice Rolled!", Toast.LENGTH_SHORT );
                textView.setText("6");
                toast.show();

            }
        });
    }
}