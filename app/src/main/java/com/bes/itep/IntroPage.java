package com.bes.itep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Omar on 10/16/16.
 */

public class IntroPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        init();
    }

    private void init() {
        Button beginButton = (Button) findViewById(R.id.button);
        final AppCompatActivity activity = this;
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              activity.getIntent().setClass(activity, TechnicalChecklistPage.class);
                activity.startActivity(activity.getIntent());
            }
        });
    }
}
