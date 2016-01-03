package com.iemc.mobile.app.sing.sing;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageButton;
import com.mobile.sing.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 * Created by eduardocerqueira on 12/24/15.
 */

public class Util {

    public int getBackground() {

        int[] bgIds = new int[]{
                R.drawable.bg_1,
                R.drawable.bg_2,
                R.drawable.bg_3,
                R.drawable.bg_4,
                R.drawable.bg_5,
                R.drawable.bg_6,
                R.drawable.bg_7,
                R.drawable.bg_8,
                R.drawable.bg_9,
                R.drawable.bg_10,
                R.drawable.bg_11,
                R.drawable.bg_12,
                R.drawable.bg_13
        };
        Random rand = new Random(bgIds.length);
        return rand.nextInt();
    }

    public void autoDisable(final ImageButton bt) {
        bt.setImageResource(R.drawable.ic_play_disabled);
        bt.setEnabled(false);

        CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long l) {
                Log.d("onTick", " " + l / 1000);
            }

            @Override
            public void onFinish() {
                Log.d("onFinish", "DONE");
                bt.setImageResource(R.drawable.ic_play);
                bt.setEnabled(true);
            }
        }.start();
    }

    public void saveConfig(String data, Context context) {
        String filename = "test.txt";
        File file = new File(context.getFilesDir(), filename);
        FileOutputStream outputStream;

        try {
            outputStream = context.openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(data.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String readConfig(Context context) {
        //TODO: // FIXME: 12/30/15 

        String ret = "";

        try {
            InputStream inputStream = context.openFileInput("config.txt");

            if (inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ((receiveString = bufferedReader.readLine()) != null) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        } catch (FileNotFoundException e) {
            Log.e("Config", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("Config", "Can not read file: " + e.toString());
        }

        return ret;
    }

}