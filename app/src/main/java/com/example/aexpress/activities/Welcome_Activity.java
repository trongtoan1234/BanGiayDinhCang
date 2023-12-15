package com.example.aexpress.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.aexpress.R;

public class Welcome_Activity extends AppCompatActivity {
    Animation intro_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView imglogo = findViewById(R.id.imglogo);
        intro_logo = AnimationUtils.loadAnimation(this, R.anim.intro_welcome);

        imglogo.setAnimation(intro_logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Welcome_Activity.this, LoginRegisterActivity.class);
                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View, String>(imglogo, "logo_img");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Welcome_Activity.this, pairs);
                startActivity(intent, options.toBundle());
                finish();
            }
        }, 3000);
    }
}