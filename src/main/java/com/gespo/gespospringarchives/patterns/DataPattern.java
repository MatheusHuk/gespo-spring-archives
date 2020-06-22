package com.gespo.gespospringarchives.patterns;

import org.jetbrains.annotations.NotNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class DataPattern {

    @NotNull
    public static String convertToDataPatern (@NotNull LocalDate date, String pattern) {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return date.toString();
    }

    @NotNull
    public static String convertHoursToString (Double hours) {
        Double s = hours * 3600;
        long seconds = Math.round(s);
        LocalTime timeOfDay = LocalTime.ofSecondOfDay(seconds);
        return timeOfDay.toString();
    }

}
