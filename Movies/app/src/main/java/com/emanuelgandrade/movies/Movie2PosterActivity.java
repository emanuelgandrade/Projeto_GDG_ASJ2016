package com.emanuelgandrade.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Movie2PosterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie2_poster);

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Movie2PosterActivity.this, Movie2Activity.class));
        finish();
    }
}
