package com.example.firebasechat;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateHelper {

    private static SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

    public static String format (Date date){
        return sdf.format(date);
    }
}
