package FocusTravel;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocusTravelSample {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				
				// define JFrame
				
				JFrame frame = new JFrame(" Simple Focus Travel ");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(800, 600);
				frame.setLayout(new GridLayout(3,3));
				
				// define listeners
				
				ActionListener actionListener = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent a) {
					
						
					}
					
				};
				MouseListener mouseListener = new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
				};
				
				for(int i = 1; i<=21; i++) {
					
					JButton button = new JButton(Integer.toString(i));
					button.addActionListener(actionListener);
					button.addMouseListener(mouseListener);
					
					if((i % 2 != 0)) {
						button.setFocusable(false);
					}
					frame.add(button);
				}
				
				
			}
		
			
		};
		
       EventQueue.invokeLater(runnable);
	}

}
