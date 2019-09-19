package com.example.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonClickerActivity extends AppCompatActivity implements View.OnClickListener {

    private int currentClickCount = 0;
    TextView screen;
    StringBuilder builder;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_clicker);

        screen = findViewById(R.id.tv_screen);
        button = findViewById(R.id.btn_clicker);


        button.setOnClickListener(this);

        constructScreenText();
    }

    private void constructScreenText() {
        builder = new StringBuilder(getString(R.string.viewText));
        builder.append(currentClickCount);
        screen.setText(builder.toString());
    }

    @Override
    public void onClick(View view) {
        currentClickCount++;
        constructScreenText();
    }
}
