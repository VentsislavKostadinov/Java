package ToggleButtons;


import java.awt.event.*;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class JToggleButtonSS {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				
				JFrame frame = new JFrame("Simple Frame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(640, 480);
				
				JPanel panel = new JPanel(new GridLayout(0,1));
				
				Border border = BorderFactory.createTitledBorder("Examples");
				
				panel.setBorder(border);
				
				ButtonGroup group = new ButtonGroup();
				
				JToggleButton button1 = new JToggleButton(" Single player ");
				
				panel.add(button1);
				group.add(button1);
				
              JToggleButton button2 = new JToggleButton(" Multiplayer ");
				
				panel.add(button2);
				group.add(button2);
				
               JToggleButton button3 = new JToggleButton(" Options ");
				
				panel.add(button3);
				group.add(button3);
				
				
               JToggleButton button4 = new JToggleButton(" Credits ");
				
				panel.add(button4);
				group.add(button4);
				
               JToggleButton button5 = new JToggleButton(" Exit ");
				
				panel.add(button5);
				group.add(button5);
				
			
				
				
				ActionListener actionListener = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent actionEvent) {
						
						String command = actionEvent.getActionCommand();
						
						System.out.println("" + command);
						
					}
				
					
				};
				
				button1.addActionListener(actionListener);
				button1.setActionCommand(" You chose single player game ");
				button1.setBackground(Color.blue);
				button1.setForeground(Color.RED);

				
				button2.addActionListener(actionListener);
				button2.setActionCommand(" You chose multiplayer game ");
				button2.setBackground(Color.GRAY);
				button2.setForeground(Color.WHITE);
				
				button3.addActionListener(actionListener);
				button3.setActionCommand(" You chose options ");
				button3.setBackground(Color.RED);
				button3.setForeground(Color.BLUE);
				
				button4.addActionListener(actionListener);
				button4.setActionCommand(" You chose credits ");
				button4.setBackground(Color.GREEN);
				button4.setForeground(Color.YELLOW);
				
				button5.addActionListener(actionListener);
				button5.setActionCommand(" You chose exit ");
				button5.setBackground(Color.WHITE);
				button5.setForeground(Color.GRAY);
				
			
				
			frame.add(panel,  BorderLayout.CENTER);
				
				
			}
			
		};


		EventQueue.invokeLater(runnable);
		
		}
		}


