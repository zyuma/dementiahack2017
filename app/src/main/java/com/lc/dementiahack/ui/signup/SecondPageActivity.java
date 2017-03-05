package com.lc.dementiahack.ui.signup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;

public class SecondPageActivity extends CoreActivity {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        mButton1 = (Button) findViewById(R.id.first);
        mButton2 = (Button) findViewById(R.id.second);
        mButton3 = (Button) findViewById(R.id.third);
        mButton4 = (Button) findViewById(R.id.fourth);
        mText = (TextView) findViewById(R.id.previous);


        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(ThirdPageActivity.class);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(ThirdPageActivity.class);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(ThirdPageActivity.class);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(ThirdPageActivity.class);
            }
        });
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
