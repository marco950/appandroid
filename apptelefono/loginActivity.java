package com.example.marco.apptelefono;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginActivity extends AppCompatActivity  implements View.OnClickListener {
private static final String TAG = "loginActivity";
    private static final int PASSWORD_LENGTH = 6;

    EditText phoneET;
    EditText passwordET;

    Button registerBtn;
    EditText iET ;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activitylogin);

        phoneET = findViewById(R.id.phon_et);
        passwordET = findViewById(R.id.password_et);
        registerBtn = findViewById(R.id.register_btn);

        Intent i = new Intent(this,rubricActivity.class);
        rubricActivity.putExtra("phoneET", "R.id.phon_et");
        registerBtn.setVisibility(View.VISIBLE);

        registerBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
