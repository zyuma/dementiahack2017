package com.lc.dementiahack.ui.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;

public class FirstPageActivity extends CoreActivity {

    private Button mFamily;
    private Button mFriend;
    private Button mother;
    private Button mDisclose;
    private TextView mPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        setButtons();
    }

    private void setButtons() {
        mFamily = (Button) findViewById(R.id.familymember);
        mFriend = (Button) findViewById(R.id.friend);
        mother = (Button) findViewById(R.id.other);
        mDisclose = (Button) findViewById(R.id.notdisclose);
        mPrevious = (TextView) findViewById(R.id.previous);

        mFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(SecondPageActivity.class);
            }
        });
        mFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(SecondPageActivity.class);
            }
        });
        mDisclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(SecondPageActivity.class);
            }
        });
        mother.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(SecondPageActivity.class);
            }
        });
        mPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
