package com.example.everis.android.introduccionaandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends Activity {

    private String mText;
    private int mNumber;
    private boolean mBoolean;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        mTextView = findViewById(R.id.text_center);


        mText = getIntent().getStringExtra(MainActivity.PARAM_TEXT);
        mNumber = getIntent().getIntExtra(MainActivity.PARAM_INT, 0);
        mBoolean = getIntent().getBooleanExtra(MainActivity.PARAM_BOOL, false);

        //O también de esta forma

        Bundle data = getIntent().getExtras();
        mText = data.getString(MainActivity.PARAM_TEXT);
        mNumber = data.getInt(MainActivity.PARAM_INT, 0);
        mBoolean = data.getBoolean(MainActivity.PARAM_BOOL, false);

        mTextView.setText("Texto: " + mTextView + " -- Numero: " + mNumber + " -- Boolean: " + mBoolean);
    }
}
