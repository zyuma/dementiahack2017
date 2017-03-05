package com.lc.dementiahack.ui.signup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;
import com.lc.dementiahack.ui.MainActivity;

public class EigthPageActivity extends CoreActivity {

    private Button mYes;
    private Button mNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eigth_page);

        mYes = (Button) findViewById(R.id.yes);
        mNo = (Button) findViewById(R.id.no);

        mYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(MainActivity.class);
            }
        });

        mNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(MainActivity.class);
            }
        });
    }
}
