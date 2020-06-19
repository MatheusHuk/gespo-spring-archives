package com.gespo.gespospringarchives.patterns;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPattern {

    public static String convertToDataPatern (Date date, String pattern) {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    public static Date convertHoursToDate (Double hours) {
        Double seconds = (hours * 3600);
        Long unixTime = seconds.longValue() * 1000L;
        return new Date(unixTime);
    }

}
