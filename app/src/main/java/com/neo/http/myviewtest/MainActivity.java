package com.neo.http.myviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countview);

        RelativeLayout bt= (RelativeLayout) findViewById(R.id.relativelayout);
//
//
//        //获得LayoutInflater实例，简化写法
////        LayoutInflater inflater=LayoutInflater.from(this);
//        //获得layoutInflater实例，完整写法
//        LayoutInflater inflater1= (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        View view=inflater1.inflate(R.layout.twopage,null);
//        bt.addView(view);
    }
}
