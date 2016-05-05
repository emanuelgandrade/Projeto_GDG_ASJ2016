package com.emanuelgandrade.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Movie6PosterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie6_poster);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Movie6PosterActivity.this, Movie6Activity.class));
        finish();
    }
}
