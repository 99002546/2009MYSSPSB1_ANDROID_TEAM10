package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideoActivity extends YouTubeBaseActivity {

    Button button;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    //Intent intent = getIntent();
    //String position = intent.getStringExtra("position");

    String position = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        youTubePlayerView=findViewById(R.id.youtube_view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //youTubePlayer.loadVideo("WLjprVtjvLY");
                if(position.equals("0"))
                    youTubePlayer.loadPlaylist("B9sznxe_WpA");
                else if(position.equals("1"))
                    youTubePlayer.loadPlaylist("Tn9-G6rpvsY");
                else if(position.equals("2"))
                    youTubePlayer.loadPlaylist("lclhzwuvxNw");
                else if(position.equals("3"))
                    youTubePlayer.loadPlaylist("AAm95jaoAJc");
                else if(position.equals("4"))
                    youTubePlayer.loadPlaylist("uN_rbfBQWaQ");
                else if(position.equals("5"))
                    youTubePlayer.loadPlaylist("PmWLcTLAFys");
                else if(position.equals("6"))
                    youTubePlayer.loadPlaylist("7kwmmK4FhCI");
                else if(position.equals("7"))
                    youTubePlayer.loadPlaylist("PL1512BD72E7C9FFCA");

            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        button = findViewById(R.id.videoButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize("AIzaSyBdVZfgwSb_ACzQxDoRMIkF63tql7FYia8",onInitializedListener);
            }
        });


    }
}