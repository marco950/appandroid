package com.example.marco.apptelefono;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class rubricActivity extends AppCompatActivity implements View.OnClickListener{
    EditText phone;
    Button chiamaBtn;
    public rubricActivity(String phoneET, String s) {
    }

    public static void putExtra(String phoneET, String s) {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityrubrica);
        phone.findViewById(R.id.phon_et);
        phone.setText(getIntent().getStringExtra("R.id.phon_et"));

    }


        @Override
        public void onClick(View v) {
        Intent l = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone.getText().toString()));
    }
}
