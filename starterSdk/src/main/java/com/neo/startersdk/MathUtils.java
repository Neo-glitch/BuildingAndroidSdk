package com.neo.startersdk;

import android.content.Context;
import android.content.Intent;

public class MathUtils {

    public static int performAdd(int a, int b){
        return a + b;
    }

    public static void goToHelloActivity(Context context){
        Intent i = new Intent(context, HelloActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
