package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution  {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("MMMM d yyyy").toFormatter(Locale.ENGLISH);
        LocalDate data = LocalDate.parse(date, formatter);
//        System.out.println(data);
//        System.out.println(data.getDayOfYear());

        if (data.getDayOfYear() % 2 == 0)
            return false;
        else
            return true;

/*        Date d = new Date(date);
        //System.out.println(d);
        Calendar cal=new GregorianCalendar();
        cal.setTime(d);
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        return cal.get(Calendar.DAY_OF_YEAR)%2 != 0 ? true: false;*/
    }
}
