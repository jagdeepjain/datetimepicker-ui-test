/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.ui.elements.AbsractButton;

public class Button extends AbsractButton {
	
	private final String datePickerDiv = "ui-datepicker-div";
	private final String datePickerDone = "//*[@id='ui-datepicker-div']/div[3]/button[2]";
	private final String datePickerNow = "//*[@id='ui-datepicker-div']/div[3]/button[1]";

	public void done(WebDriver driver) {
		WebElement done = driver.findElement(By.id(datePickerDiv));
		done.findElement(By.xpath(datePickerDone)).click();
		done.sendKeys(Keys.TAB);
	}
	public void now(WebDriver driver) {
		WebElement done = driver.findElement(By.id(datePickerDiv));
		done.findElement(By.xpath(datePickerNow)).click();
	}
	@Override
	public void button(WebDriver driver) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void inputBox(WebDriver driver) {
		// TODO Auto-generated method stub
	}
}

