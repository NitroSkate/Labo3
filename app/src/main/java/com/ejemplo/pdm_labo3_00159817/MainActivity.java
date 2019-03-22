package com.ejemplo.pdm_labo3_00159817;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.ejemplo.pdm_labo3_00159817.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private Button mButton;

    @Override
    //Serializable
    //Parcelable
    //Bundle
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton=findViewById(R.id.btn_send);
        mButton.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(AppConstants.TEXT_KEY, "Jeloudah");
            startActivity(mIntent);
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "on pause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "on stop");
    }

}
