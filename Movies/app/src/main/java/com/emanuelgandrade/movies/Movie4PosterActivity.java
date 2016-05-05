package com.emanuelgandrade.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Movie4PosterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie4_poster);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Movie4PosterActivity.this, Movie4Activity.class));
        finish();
    }
}
