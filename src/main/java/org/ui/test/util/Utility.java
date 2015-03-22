/**
* @author jagdeepjain
*
*/
package org.ui.test.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility {
	public String getTimeStamp (int month, int day, int hr, int min) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, day);
		cal.add(Calendar.MONTH, month);
		cal.set(Calendar.HOUR, hr);
		cal.set(Calendar.MINUTE, min);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");
		String date = dateFormat.format(cal.getTime());
		return date;	
	}

}
