package org.datetimepicker.ui;

import org.datetimepicker.ui.components.Buttons;
import org.datetimepicker.ui.components.EditBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Jagdeep Jain
 * 
 */

public class TimePickerBasicExample1 {
	EditBox editBox = new EditBox();
	Buttons button = new Buttons();

	public void setDateTime(WebDriver driver, int month, int startHr,
			int startMin, String date) {
		editBox.basicExample1(driver, month, startHr, startMin, date);
		button.datePickerDoneButton(driver);
	}
	
	public String getDateTime(WebDriver driver) {
		return driver.findElement(By.id("basic_example_1")).getAttribute("value");
	}
	
	public void goToExamples(WebDriver driver) {
		driver.findElement(By.linkText("Examples")).click();
	}
}
