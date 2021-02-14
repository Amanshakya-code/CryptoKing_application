package com.example.android.cryptoking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class usebutton extends AppCompatActivity {
    ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usebutton);
        vf = findViewById(R.id.vf);
        int images[] = {R.drawable.ss1,R.drawable.ss2,R.drawable.ss3,R.drawable.ss4,R.drawable.ss5,R.drawable.ss6};
        for(int i=0;i<images.length;i++) {
            flipper(images[i]);
        }
    }
    public  void flipper(int images)
    {
        ImageView test = new ImageView(this);
        test.setBackgroundResource(images);
        vf.addView(test);
        vf.setFlipInterval(2000);
        vf.setAutoStart(true);
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
