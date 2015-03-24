/**
* @author jagdeepjain
*
*/
package org.ui.elements;

import org.openqa.selenium.WebDriver;

public interface UIElement {
	
	public final String datePickerDiv = "ui-datepicker-div";
	//private final String calendarMonth = "//*[@id='ui-datepicker-div']/div[1]/a[2]/span";
	public final String calendarHr = "//*[@id='ui-datepicker-div']/div[2]/dl/dd[2]/div/span";
	public final String calendarMinute = "//*[@id='ui-datepicker-div']/div[2]/dl/dd[3]/div/span";
	public final String datePickerDone = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
	public final String datePickerNow = "//*[@id='ui-datepicker-div']/div[3]/button[1]";

	public final String basicExample1 = "basic_example_1";
	// Examples link to get the date time picker
	public final String examplesLink = "Examples";

	public void done(WebDriver driver);
	public void now(WebDriver driver);
	public void basicExample1(WebDriver driver, int month, int startHr, int startMin, String date);
}
