package com.iemc.mobile.app.sing.sing;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.mobile.sing.R;

public class Character extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    String msg = "CHARACTER : ";
    ImageButton play;
    Button close;
    int music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(msg, "The onCreate() event");
        initializeViews();
    }

    public void initializeViews() {
        Bundle params = getIntent().getExtras();
        String character = params.getString("CHARACTER");

        Log.d(msg, character);

        if (character.equalsIgnoreCase("elsa")) {
            msg = msg + "ELSA";
            setContentView(R.layout.activity_elsa);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.elsa_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.elsa;
        }
        if (character.equalsIgnoreCase("anna")) {
            msg = msg + "ANNA";
            setContentView(R.layout.activity_anna);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.anna_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.anna;
        }
        if (character.equalsIgnoreCase("barney")) {
            msg = msg + "BARNEY";
            setContentView(R.layout.activity_barney);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.barney_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.barney;
        }
        if (character.equalsIgnoreCase("daniel")) {
            msg = msg + "DANIEL";
            setContentView(R.layout.activity_daniel);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.daniel_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.daniel;
        }
        if (character.equalsIgnoreCase("elmo")) {
            msg = msg + "ELMO";
            setContentView(R.layout.activity_elmo);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.elmo_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.elmo;
        }
        if (character.equalsIgnoreCase("mickey")) {
            msg = msg + "MICKEY";
            setContentView(R.layout.activity_mickey);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.mickey_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.mickey;
        }
        if (character.equalsIgnoreCase("minions")) {
            msg = msg + "MINIONS";
            setContentView(R.layout.activity_minions);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.minions_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.minions_banana;
        }
        if (character.equalsIgnoreCase("minions_christmas")) {
            msg = msg + "MINIONS CHRISTMAS";
            setContentView(R.layout.activity_minions_christmas);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.minions_christmas_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.minions_christmas;
        }
        if (character.equalsIgnoreCase("lion")) {
            msg = msg + "LION";
            setContentView(R.layout.activity_lion);
            RelativeLayout llayout = (RelativeLayout) findViewById(R.id.lion_layout);
            llayout.setBackgroundResource(R.drawable.bg_17);
            music = R.raw.lion;
        }

        close = (Button) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Called when the activity is about to become visible.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");

        play = (ImageButton)findViewById(R.id.bt_play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    } else {
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), music);
                        mediaPlayer.start();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
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
