package com.example.sample;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class IasaActivity extends AppCompatActivity {

    TextInputLayout inputLayout;
    TextInputEditText inputEditText;
    //main(String[] args)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iasa);

        inputLayout = findViewById(R.id.TextInputLayout_password);
        inputEditText = findViewById(R.id.TextInputEditText_password);

        inputLayout.setPasswordVisibilityToggleEnabled(true);
        inputEditText.clearAnimation();

    }
}
