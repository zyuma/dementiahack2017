package com.lc.dementiahack.core;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by larrychong on 2017-03-04.
 */

public class CoreActivity extends AppCompatActivity {

    public void moveToNextActivity(Class c) {
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}
