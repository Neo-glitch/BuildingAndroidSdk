package com.neo.androidsdktutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.neo.startersdk.MathUtils;

public class MainActivity extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        text = findViewById(R.id.text);


        Toast.makeText(this, "result from sdk: " + MathUtils.performAdd(3, 4), Toast.LENGTH_SHORT).show();

        text.setOnClickListener(v -> MathUtils.goToHelloActivity(getApplicationContext()));

        setContentView(R.layout.activity_main);
    }
}