package com.lc.dementiahack.core;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.lc.dementiahack.R;

/**
 * Created by larrychong on 2017-03-04.
 */

public class CoreActivity extends AppCompatActivity {

    public void moveToNextActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }

    public void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
