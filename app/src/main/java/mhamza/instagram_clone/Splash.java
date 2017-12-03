package mhamza.instagram_clone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import mhamza.instagram_clone.Home.HomeActivity;

/**
 * Created by M.Hamza on 11/24/2017.
 */

public class Splash extends AppCompatActivity {
    private TextView tv;
    private ImageView iv1,iv2;
    private static int Splash_screen_TimeOut=8000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_layout);
        tv=(TextView) findViewById(R.id.welcome);
        iv1=(ImageView) findViewById(R.id.instagram_logo);
        iv2=(ImageView)findViewById(R.id.instagram_logo_image);
        Animation anim= AnimationUtils.loadAnimation(this,R.anim.mytransiction);
        iv1.startAnimation(anim);
        iv2.startAnimation(anim);
        tv.startAnimation(anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },Splash_screen_TimeOut);
    }

}
