package JOptionPane;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProcessMonitor {
	
	static ProgressMonitor monitor;
	static int progress;
	static Timer timer;
	
	static class ProgressMonitorHandler implements ActionListener {

		public void actionPerformed(ActionEvent actionEvent) {
			
			if(monitor == null) {
				return;
			}
			
			if(monitor.isCanceled()) {
				System.out.println("monitor canceled");
				timer.stop();
			
			} else {
				progress +=3;
				monitor.setProgress(progress);
				monitor.setNote("Loaded" + progress + " files ");
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				
				// Define frame
				
				JFrame frame = new JFrame("Simple frame");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(640, 480);
				frame.setLayout(new GridLayout(0,1));
				
				// Define Start button
				
				JButton startButton = new JButton("Start");
				
				ActionListener startActionListener = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent actionEvent) {
						
					
						
						Component parent = (Component)actionEvent.getSource();
						monitor = new ProgressMonitor(parent, "Loading Progress", "Getting started...", 0,100);
						progress = 0;
						
					}
					}; // end startActionListener
				
					// attach startButton
					
					startButton.addActionListener(startActionListener);
					frame.add(startButton);
				
					// define manual increase Button
					// pressing this button increase progress by 5
					
					JButton increaseButton = new JButton("Manual Increase"); 
					
					ActionListener increaseActionListener = new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent actionEvent) {
							
						if(monitor == null) {
							return;
						}
						
						if(monitor.isCanceled()) {
							System.out.println("Monitor canceled");
						
						} else {
							progress +=5;
							monitor.setProgress(progress);
							monitor.setNote("Loaded" + progress + "files");
							
						}
						}
						
					}; // end increase action listener
					
					// attach the increase button
					
					increaseButton.addActionListener(increaseActionListener);
					frame.add(increaseButton);
					
					// define automatic increase button
					// star timer to increase progress by 3 every 250 ms
					
					JButton autoIncreaseButton = new JButton("Automatic Increase");
					
					ActionListener autoButton = new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent actionEvent) {
							
							if(monitor != null) {
								if(timer == null) {
									
									timer = new Timer(250, new ProgressMonitorHandler());
								} // 2nd if
								
								timer.start();
							} // 1st iff
						}
						
					}; // end auto increase button
					
					autoIncreaseButton.addActionListener(autoButton);
					frame.add(autoIncreaseButton);
					
			} // end run()
			
			
		};
		
		EventQueue.invokeLater(runnable);

	}

}
