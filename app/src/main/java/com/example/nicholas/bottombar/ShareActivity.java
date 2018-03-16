package com.example.nicholas.bottombar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.nicholas.bottombar.Util.BottomNavigationViewHelper;

/**
 * Created by nicholas on 3/16/18.
 */

public class SearchActivity extends AppCompatActivity {
    private static final String TAG = "SearchActivity";
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupBottomNavigatonView();
    }
    private void setupBottomNavigatonView() {
        Log.d(TAG, "setupBottomNavigatonView:Setting up bottom nav ");
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav_view);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView);
    }
}
