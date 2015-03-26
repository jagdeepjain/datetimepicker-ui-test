package org.ui.common;

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class Utility {
  
  public String getDateTime(int month, int hr, int min, int day) {
    String date = null;
    
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DAY_OF_MONTH, day);
    cal.add(Calendar.MONTH, month);
    cal.set(Calendar.HOUR, hr);
    cal.set(Calendar.MINUTE, min);
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");
    date = dateFormat.format(cal.getTime());
    return date;
  }
  
}
