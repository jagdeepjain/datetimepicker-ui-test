/**
 * @author jagdeepjain
 *
 */
package org.ui.test.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Util {

  private static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm"); 
  private static Calendar calendar = Calendar.getInstance();
  private static String dateTime = null;
  
  private Util() {
  }
  
  public static String getDateTime(int month, int hour, int minute, int date) {
    calendar.set(Calendar.DAY_OF_MONTH, date);
    calendar.add(Calendar.MONTH, month);
    calendar.set(Calendar.HOUR, hour);
    calendar.set(Calendar.MINUTE, minute);
    dateTime = sdf.format(calendar.getTime());
    
    return dateTime;
  }
  
}
