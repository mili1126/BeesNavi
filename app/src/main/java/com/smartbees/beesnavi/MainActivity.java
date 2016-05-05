package com.smartbees.beesnavi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new MainFragment();
    }

}
