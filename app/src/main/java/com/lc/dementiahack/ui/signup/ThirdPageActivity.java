package com.lc.dementiahack.ui.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;

public class ThirdPageActivity extends CoreActivity {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);

        mButton1 = (Button) findViewById(R.id.first);
        mButton2 = (Button) findViewById(R.id.second);
        mButton3 = (Button) findViewById(R.id.third);
        mButton4 = (Button) findViewById(R.id.fourth);
        mButton5 = (Button) findViewById(R.id.fifth);
        mButton6 = (Button) findViewById(R.id.six);
        mText = (TextView) findViewById(R.id.previous);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FourthPageActivity.class);
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FourthPageActivity.class);
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FourthPageActivity.class);
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FourthPageActivity.class);
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FourthPageActivity.class);
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FourthPageActivity.class);
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
