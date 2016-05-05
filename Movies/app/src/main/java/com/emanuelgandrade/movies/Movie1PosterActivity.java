package com.emanuelgandrade.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Movie1PosterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie1_poster);

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Movie1PosterActivity.this, Movie1Activity.class));
        finish();
    }
}
