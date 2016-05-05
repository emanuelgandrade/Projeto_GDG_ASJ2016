package com.emanuelgandrade.movies;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Movie3Activity extends YouTubeBaseActivity implements View.OnClickListener, YouTubePlayer.OnInitializedListener {

    private static final String MOVIE = "movie3";
    private static final String FAVORITE_MOVIES = "favorite";
    private static final String ID_YOUTUBE_MOVIE_1 = "3vYpPwBKJ28";

    private ImageButton ibtnPoster;
    private ImageButton ibtnFavorite;
    private TextView txtFavorite;
    private WebView wbvDescription;
    private YouTubePlayerView youTubePlayer1;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private boolean isFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie3);

        ibtnPoster = (ImageButton)findViewById(R.id.ibtnPoster);
        ibtnFavorite = (ImageButton)findViewById(R.id.ibtnFavorite);
        txtFavorite = (TextView)findViewById(R.id.txtFavorite);
        wbvDescription = (WebView)findViewById(R.id.wbvDescription);

        ibtnPoster.setOnClickListener(this);
        ibtnFavorite.setOnClickListener(this);
        txtFavorite.setOnClickListener(this);

        wbvDescription.loadUrl("file:///android_asset/Movie3Description.html");

        sharedPreferences = getSharedPreferences(FAVORITE_MOVIES, MODE_PRIVATE);
        if (sharedPreferences.getBoolean(MOVIE, false)) {
            ibtnFavorite.setImageResource(R.drawable.btn_star_big_on_pressed);
            txtFavorite.setText(R.string.movie_favorite_true);
        }

        youTubePlayer1 = (YouTubePlayerView) findViewById(R.id.player1);
        assert youTubePlayer1 != null;
        youTubePlayer1.initialize(DeveloperKey.DEVELOPER_KEY, this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ibtnPoster:
                startActivity(new Intent(Movie3Activity.this, Movie3PosterActivity.class));
                finish();
                break;
            case R.id.ibtnFavorite:
                sharedPreferences = getSharedPreferences(FAVORITE_MOVIES, MODE_PRIVATE);
                isFavorite = sharedPreferences.getBoolean(MOVIE, false);
                editor = sharedPreferences.edit();
                if (!isFavorite) {
                    editor.putBoolean(MOVIE, true);
                    editor.commit();
                    ibtnFavorite.setImageResource(R.drawable.btn_star_big_on_pressed);
                    txtFavorite.setText(R.string.movie_favorite_true);
                } else {
                    editor.putBoolean(MOVIE, false);
                    editor.commit();
                    ibtnFavorite.setImageResource(R.drawable.btn_star_big_off_disable);
                    txtFavorite.setText(R.string.movie_favorite_false);
                }
                break;
        }
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Movie3Activity.this, MainActivity.class));
        finish();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean loadAgain) {
        Log.i("Script", "RAIZ 1");
        if (!loadAgain) {
            Log.i("Script", "RAIZ 2");
            youTubePlayer.cueVideo(ID_YOUTUBE_MOVIE_1);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "onInitializationFailure()", Toast.LENGTH_SHORT).show();
    }
}
