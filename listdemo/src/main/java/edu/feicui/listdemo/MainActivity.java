package edu.feicui.listdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
   ImageButton ib;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib= (ImageButton) findViewById(R.id.ib);
        //缩放
//        ScaleAnimation a=new ScaleAnimation(2,3,2,3);
//        a.setDuration(3000);
//        ib.setAnimation(a);
//        a.start();

        //旋转
//        RotateAnimation r=new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF,0.5f,
//                Animation.RELATIVE_TO_SELF,0.5f);
//        r.setDuration(3000);
//        ib.setAnimation(r);
//        r.start();

        //透明度
//        AlphaAnimation al=new AlphaAnimation(0.0f,1.0f);
//        al.setDuration(3000);
//        ib.setAnimation(al);
//        al.start();

        //平移
//        Animation a=new TranslateAnimation(0,100,0,100);
//        a.setDuration(3000);
//        ib.setAnimation(a);
//        a.start();

        Animation a= AnimationUtils.loadAnimation(this, R.anim.a);
        ib.setAnimation(a);
        a.start();


    }
}
