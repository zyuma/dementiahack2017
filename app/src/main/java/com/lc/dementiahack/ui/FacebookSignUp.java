package com.lc.dementiahack.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;
import com.lc.dementiahack.ui.signup.FirstPageActivity;

public class FacebookSignUp extends CoreActivity {

    private TextView mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_sign_up);

        mNext = (TextView) findViewById(R.id.next);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FirstPageActivity.class);
            }
        });
    }
}
