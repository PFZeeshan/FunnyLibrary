package com.sp.funnylibrary;

import android.app.Activity;
import android.widget.Toast;

public class FunnyMainClass {

    public void MainFunction(Activity activity, int firstValue, int secondValue)
    {
        Toast.makeText(activity, firstValue+secondValue+"", Toast.LENGTH_SHORT).show();
    }

}
