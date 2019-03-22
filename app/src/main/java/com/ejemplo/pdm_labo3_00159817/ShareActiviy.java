package com.ejemplo.pdm_labo3_00159817;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActiviy extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_activiy);
        mText=findViewById(R.id.tv_shared_text);
        Intent mIntent = getIntent();
        if (mIntent!=null) {
            mText.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
