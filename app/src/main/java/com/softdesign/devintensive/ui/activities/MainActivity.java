package com.softdesign.devintensive.ui.activities;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    protected static final String TAG = ConstantManager.TAG_PREFIX + "MainActivity";
    private ImageView mCallImg;
    private CoordinatorLayout mCoordinatorLayout;
    private DrawerLayout mDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        mCallImg = (ImageView) findViewById(R.id.call_img);
        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.main_coordinator_container);
        mDrawer = (DrawerLayout) findViewById(R.id.navigation_drawer);
        mCallImg.setOnClickListener(this);

        if (savedInstanceState == null) {
            // активити запускается впервые
 /*           showSnackbar("активити запускается впервые");
            showToast("активити запускается впервые");*/
        } else {
            // активити уже создано
/*            showSnackbar("активити уже создано");
            showToast("активити уже создано");*/

        }


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.call_img:
 /*               showProgress();
                runWithDelay();*/
                break;

        }


    }


/*    public void runWithDelay(){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // TODO: Выполнить метод с задержкой 5 секунд
                hideProgress();
            }
        },5000);
    }*/


    private void showSnackbar(String message) {
        Snackbar.make(mCoordinatorLayout, message, Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
