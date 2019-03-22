package com.ejemplo.pdm_labo3_00159817;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ejemplo.pdm_labo3_00159817.utils.AppConstants;

public class NewActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mText=findViewById(R.id.tv_message);
        Intent nIntent = getIntent();
        if (nIntent != null){
            mText.setText(nIntent.getStringExtra(AppConstants.TEXT_KEY));
        }

    }
}
