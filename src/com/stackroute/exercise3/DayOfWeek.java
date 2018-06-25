package com.stackroute.exercise3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayOfWeek {public String getFirstDayOfWeek() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
    return dateFormat.format(calendar.getTime());
}


public String getLastDayOfWeek() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE dd/MM/yyyy");
    return dateFormat.format(calendar.getTime());
}

}
