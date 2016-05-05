package com.smartbees.beesnavi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends SingleFragmentActivity implements MainFragment.Callbacks{
    @Override
    protected Fragment createFragment() {
        return new MainFragment();
    }

    @Override
    protected void onResume() {
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onResume();
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();

        if (fragment != null) {
            fm.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
        }
    }

}
