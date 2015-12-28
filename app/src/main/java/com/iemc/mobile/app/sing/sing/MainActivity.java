package com.iemc.mobile.app.sing.sing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.mobile.sing.R;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    ImageView img_elsa;
    ImageView img_anna;
    ImageView img_barney;
    ImageView img_daniel;
    ImageView img_elmo;
    ImageView img_mickey;
    ImageView img_minions;
    ImageView img_minions_christmas;
    ImageView img_lion;
    String msg = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout llayout = (LinearLayout) findViewById(R.id.main_layout);
        llayout.setBackgroundResource(R.drawable.bg_7);

        // ELSA
        img_elsa = (ImageView) findViewById(R.id.bt_elsa);
        img_elsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "ELSA");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "elsa");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // ANNA
        img_anna = (ImageView) findViewById(R.id.bt_anna);
        img_anna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "ANNA");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "anna");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // BARNEY
        img_barney = (ImageView) findViewById(R.id.bt_barney);
        img_barney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "BARNEY");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "barney");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // DANIEL
        img_daniel = (ImageView) findViewById(R.id.bt_daniel);
        img_daniel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "DANIEL");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "daniel");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // ELMO
        img_elmo = (ImageView) findViewById(R.id.bt_elmo);
        img_elmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "ELMO");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "elmo");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // MICKEY
        img_mickey = (ImageView) findViewById(R.id.bt_mickey);
        img_mickey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "MICKEY");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "mickey");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // MINIONS
        img_minions = (ImageView) findViewById(R.id.bt_minions);
        img_minions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "MINIOS");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "minions");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // MINIONS CHRISTMAS
        img_minions_christmas = (ImageView) findViewById(R.id.bt_minions_christmas);
        img_minions_christmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "MINIOS CHRISTMAS");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "minions_christmas");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        // LION
        img_lion = (ImageView) findViewById(R.id.bt_lion);
        img_lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Log.d(msg, "LION");
                    Intent intent = new Intent(context, com.iemc.mobile.app.sing.sing.Character.class);
                    Bundle params = new Bundle();
                    params.putString("CHARACTER", "lion");
                    intent.putExtras(params);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

}
