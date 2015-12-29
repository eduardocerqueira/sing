package com.iemc.mobile.app.sing.sing;

import com.mobile.sing.R;

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


}
