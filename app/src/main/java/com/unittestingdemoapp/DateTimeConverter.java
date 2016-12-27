package com.unittestingdemoapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeConverter {

    public static String convertDateTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DATE);
        switch (day % 10) {
            case 1:
                return new SimpleDateFormat("d'st' MMM yyyy").format(date);
            case 2:
                return new SimpleDateFormat("d'nd' MMM yyyy").format(date);
            case 3:
                return new SimpleDateFormat("d'rd' MMM yyyy").format(date);
            default:
                return new SimpleDateFormat("d'th' MMM yyyy").format(date);
        }
    }
}
