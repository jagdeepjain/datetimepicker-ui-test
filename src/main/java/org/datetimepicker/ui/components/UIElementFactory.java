/**
* @author jagdeepjain
*
*/
package org.datetimepicker.ui.components;

public class UIElementFactory {
	
	public UIElement getElement (String elementType) {
		
		if (elementType == null) {
			return null;
		} else if (elementType.equals("button")) {
			return new Button();
		} else if (elementType.equals("inputBox")) {
			return new InputBox();
		} else {
			return null;			
		}
	}
}
