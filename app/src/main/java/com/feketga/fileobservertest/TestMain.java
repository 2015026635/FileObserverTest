package com.feketga.fileobservertest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by ubuntu on 18-4-27.
 */

public class TestMain {

    public static void main(String[] args) {
        String aa = "20180427111745_18511493329.wav";
        aa = aa.substring(aa.indexOf("_"));

        System.out.println("aa" + aa);


    }

    public static long parseServerTime(String serverTime, String format) {
        if (format == null || format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        Date date = null;
        try {
            date = sdf.parse(serverTime);
        } catch (Exception e) {
        }
        return date.getTime();
    }
}
