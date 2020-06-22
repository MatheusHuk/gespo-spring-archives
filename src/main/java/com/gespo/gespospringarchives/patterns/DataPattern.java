package com.gespo.gespospringarchives.patterns;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DataPattern {

    public static String convertToDataPatern (LocalDate date, String pattern) {
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    public static LocalDate convertHoursToDate (Double hours) {
        Double seconds = (hours * 3600);
        Long unixTime = seconds.longValue() * 1000L;
        return convertToLocalDateViaInstant(
                new Date(unixTime)
        );
    }

    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

}
