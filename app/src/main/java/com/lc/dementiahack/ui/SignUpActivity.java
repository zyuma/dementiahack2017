package com.lc.dementiahack.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;

public class SignUpActivity extends CoreActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        setToolbar();
        setButtons();
    }

    private void setButtons() {
        mButton = (Button) findViewById(R.id.signup);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return (super.onOptionsItemSelected(item));
    }
}
