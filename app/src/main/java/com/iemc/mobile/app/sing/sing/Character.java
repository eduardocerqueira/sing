package com.iemc.mobile.app.sing.sing;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.mobile.sing.R;

public class Character extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    String character;
    String msg = "CHARACTER : ";
    ImageButton play;
    ImageView characterImage;
    Button close;
    int music;
    Util util = new Util();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(msg, "The onCreate() event");
        initializeViews();
    }

    public void initializeViews() {
        Bundle params = getIntent().getExtras();
        character = params.getString("CHARACTER");
        Log.d(msg, character);

        setContentView(R.layout.activity_character);
        RelativeLayout llayout = (RelativeLayout) findViewById(R.id.character_layout);
        //TODO: random background per character
        llayout.setBackgroundResource(R.drawable.bg_17);
        characterImage = (ImageView) findViewById(R.id.characterImage);

        if (character.equalsIgnoreCase("elsa")) {
            msg = msg + "ELSA";
            characterImage.setImageResource(R.drawable.elsa);
            music = R.raw.elsa;
        }
        if (character.equalsIgnoreCase("anna")) {
            msg = msg + "ANNA";
            characterImage.setImageResource(R.drawable.anna);
            music = R.raw.anna;
        }
        if (character.equalsIgnoreCase("barney")) {
            msg = msg + "BARNEY";
            characterImage.setImageResource(R.drawable.barney);
            music = R.raw.barney;
        }
        if (character.equalsIgnoreCase("daniel")) {
            msg = msg + "DANIEL";
            characterImage.setImageResource(R.drawable.daniel);
            music = R.raw.daniel;
        }
        if (character.equalsIgnoreCase("elmo")) {
            msg = msg + "ELMO";
            characterImage.setImageResource(R.drawable.elmo);
            music = R.raw.elmo;
        }
        if (character.equalsIgnoreCase("mickey")) {
            msg = msg + "MICKEY";
            characterImage.setImageResource(R.drawable.mickey);
            music = R.raw.mickey;
        }
        if (character.equalsIgnoreCase("minions")) {
            msg = msg + "MINIONS";
            characterImage.setImageResource(R.drawable.minions);
            music = R.raw.minions_banana;
        }
        if (character.equalsIgnoreCase("minions_christmas")) {
            msg = msg + "MINIONS CHRISTMAS";
            characterImage.setImageResource(R.drawable.minions_christmas);
            music = R.raw.minions_christmas;
        }
        if (character.equalsIgnoreCase("lion")) {
            msg = msg + "LION";
            characterImage.setImageResource(R.drawable.lion);
            music = R.raw.lion;
        }

    }

    public void backHome(View view) {
        finish();
    }


    public void playMusic(View view) {
        play = (ImageButton) findViewById(R.id.ic_play);
        try {
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                util.autoDisable(play);
            } else {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), music);
                mediaPlayer.start();
                util.autoDisable(play);
            }
        } catch (Exception e) {
            Log.d("EXCEPTION", e.toString());
        }
    }

    /**
     * Called when the activity is about to become visible.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /**
     * Called when the activity has become visible.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /**
     * Called when another activity is taking focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    /**
     * Called when the activity is no longer visible.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }

        if (mediaPlayer != null) {
            mediaPlayer.release();
        }

    }

    /**
     * Called just before the activity is destroyed.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
}
