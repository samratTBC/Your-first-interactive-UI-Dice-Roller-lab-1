package com.example.mobile_dev_android_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mobile_dev_android_2023.Model.Dice;

public class MainActivity extends AppCompatActivity {

    private Button rollBtn;
    private TextView textView;
    private TextView textViewSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollBtn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textViewSecond = findViewById(R.id.textView_second);

        rollBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    public void rollDice()
    {
        Toast toast = Toast.makeText(MainActivity.this, "Dice Rolled!", Toast.LENGTH_SHORT );
        Dice dice = new Dice(6);
        textView.setText(Integer.toString(dice.roll()));
        textViewSecond.setText(Integer.toString(dice.roll()));
        toast.show();
    }
}