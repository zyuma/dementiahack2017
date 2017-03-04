package com.lc.dementiahack.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.TextView;

import com.lc.dementiahack.R;
import com.lc.dementiahack.core.CoreActivity;
import com.lc.dementiahack.ui.frags.MessageFragment;
import com.lc.dementiahack.ui.frags.PostFragment;
import com.lc.dementiahack.ui.frags.ProfileFragment;

public class MainActivity extends CoreActivity {

    private TextView mTextMessage;

    final FragmentManager fragmentManager = getSupportFragmentManager();
    final Fragment mPostFragment = new PostFragment();
    final Fragment mMessageFragment = new MessageFragment();
    final Fragment mProfileFragment = new ProfileFragment();

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    replaceFragment(mPostFragment);
                    return true;
                case R.id.navigation_dashboard:
                    replaceFragment(mMessageFragment);
                    return true;
                case R.id.navigation_notifications:
                    replaceFragment(mProfileFragment);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        replaceFragment(mPostFragment);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment).commit();
    }

}
