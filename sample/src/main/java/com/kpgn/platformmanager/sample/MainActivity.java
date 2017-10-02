package com.kpgn.platformmanager.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kpgn.platformmanager.PlatformManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isBlackBerry = PlatformManager.isBlackBerry();

        Toast.makeText(getApplicationContext(), isBlackBerry ? "BlackBerry" : "Android", Toast.LENGTH_SHORT).show();
    }
}
