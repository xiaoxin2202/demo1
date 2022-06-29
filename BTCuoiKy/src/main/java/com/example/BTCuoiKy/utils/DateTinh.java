package com.example.BTCuoiKy.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTinh {

    public static String Tinh(String a, String b) throws ParseException,IOException {

        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR, 24);

        Date date1 = null;
        Date date2 = null;



            date1 = simpleDateFormat.parse(a);
            date2 = simpleDateFormat.parse(b);

            long getDiff = date2.getTime() - date1.getTime();

            // using TimeUnit class from java.util.concurrent package
            long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);
            long ngay;
            if (getDaysDiff == 0) {
                ngay = 1;
            } else {
                ngay = getDaysDiff;
            }
            return ngay * 120000 + "";


    }
}
