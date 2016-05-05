package com.emanuelgandrade.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Movie5PosterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie5_poster);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Movie5PosterActivity.this, Movie5Activity.class));
        finish();
    }
}
