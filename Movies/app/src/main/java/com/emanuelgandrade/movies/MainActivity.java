package com.emanuelgandrade.movies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton ibtnMovie1;
    private ImageButton ibtnMovie2;
    private ImageButton ibtnMovie3;
    private ImageButton ibtnMovie4;
    private ImageButton ibtnMovie5;
    private ImageButton ibtnMovie6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibtnMovie1 = (ImageButton) findViewById(R.id.ibtnMovie1);
        ibtnMovie2 = (ImageButton) findViewById(R.id.ibtnMovie2);
        ibtnMovie3 = (ImageButton) findViewById(R.id.ibtnMovie3);
        ibtnMovie4 = (ImageButton) findViewById(R.id.ibtnMovie4);
        ibtnMovie5 = (ImageButton) findViewById(R.id.ibtnMovie5);
        ibtnMovie6 = (ImageButton) findViewById(R.id.ibtnMovie6);

        ibtnMovie1.setOnClickListener(this);
        ibtnMovie2.setOnClickListener(this);
        ibtnMovie3.setOnClickListener(this);
        ibtnMovie4.setOnClickListener(this);
        ibtnMovie5.setOnClickListener(this);
        ibtnMovie6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibtnMovie1:
                startActivity(new Intent(MainActivity.this, Movie1Activity.class));
                finish();
                break;
            case R.id.ibtnMovie2:
                startActivity(new Intent(MainActivity.this, Movie2Activity.class));
                finish();
                break;
            case R.id.ibtnMovie3:
                startActivity(new Intent(MainActivity.this, Movie3Activity.class));
                finish();
                break;
            case R.id.ibtnMovie4:
                startActivity(new Intent(MainActivity.this, Movie4Activity.class));
                finish();
                break;
            case R.id.ibtnMovie5:
                startActivity(new Intent(MainActivity.this, Movie5Activity.class));
                finish();
                break;
            case R.id.ibtnMovie6:
                startActivity(new Intent(MainActivity.this, Movie6Activity.class));
                finish();
                break;
        }
    }
}
