package com.example.damin.tp_final_mobileapplication.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.damin.tp_final_mobileapplication.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubePlayer extends  YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener  {
    public static final String API_KEY = "AIzaSyB-qSpvKVCmT2b4tM9RvJ2EvJZ5SCUah_w";

    private static final String  ID="id_video";
    private static final String  DESCRITPION="description_video";
    private static final String  TITRE="titre_video";


    private String VIDEO_ID="";

    private TextView viewDescription;

    public static void  Start ( Context context,String id,String description){
         Intent intent = new Intent(context,YoutubePlayer.class);
         intent.putExtra(ID,id);
         intent.putExtra(DESCRITPION,description);

         context.startActivity(intent);
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_player);

        viewDescription=(TextView)findViewById(R.id.textViewDescription);

        VIDEO_ID= getIntent().getStringExtra(ID);
        String titre = getIntent().getStringExtra(TITRE);
        String description = getIntent().getStringExtra(DESCRITPION);
        viewDescription.setText(description);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player);
        youTubePlayerView.initialize(API_KEY, this);
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if(null==youTubePlayer) return;

        Log.d("INFOOOO",VIDEO_ID);

        // Start buffering
        if (!b) {
            youTubePlayer.cueVideo(VIDEO_ID);
        }
    }



    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Failed to initialize.", Toast.LENGTH_LONG).show();

    }
}
