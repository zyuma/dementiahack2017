package com.lc.dementiahack.ui.signup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;

public class FourthPageActivity extends CoreActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_page);

        mButton = (Button) findViewById(R.id.okay);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToNextActivity(FifthPageActivity.class);
            }
        });
    }
}
