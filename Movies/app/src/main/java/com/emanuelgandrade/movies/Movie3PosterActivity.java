package com.emanuelgandrade.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Movie3PosterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie3_poster);

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Movie3PosterActivity.this, Movie3Activity.class));
        finish();
    }
}
