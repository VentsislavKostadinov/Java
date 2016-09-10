package RadioButtons;

import java.awt.
*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class RadioButtonsUtils {
	
	private RadioButtonsUtils() {
		
	}
	
	public static Container createRadioButtonGrouping(String elements[], String title) {
		
		JPanel panel = new JPanel(new GridLayout(0,1));
		
		Border border = BorderFactory.createTitledBorder(title);
		
		panel.setBorder(border);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton aRadioButton;
		
		for(int i = 0; i<elements.length; i++) {
			
			aRadioButton = new JRadioButton(elements[i]);
			
			panel.add(aRadioButton);
			group.add(aRadioButton);
		}
		
		return panel;
		
		}
	
	

}
