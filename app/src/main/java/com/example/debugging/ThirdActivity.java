package com.example.debugging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private Button buttonBack;
    private TextView textViewName;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        init();
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(ThirdActivity.this,Menu.class);
                startActivity(back);
                finish();
            }
        });
    }

    public void init()
    {
        buttonBack = findViewById(R.id.buttonBack);
        textViewName = findViewById(R.id.textViewName);
        editText = findViewById(R.id.editTextName);

    }
}
