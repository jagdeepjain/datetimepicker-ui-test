/**
* @author jagdeepjain
*
*/
package org.ui.elements;

import org.datetimepicker.ui.components.Button;
import org.datetimepicker.ui.components.InputBox;

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
