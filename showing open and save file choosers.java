package JMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;

public class Test {


    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
               
            	// create Frame
            	
            	JFrame frame = new JFrame("Frame");
            	frame.setVisible(true);
            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	frame.setSize(1024, 768);
            	
            
            	
            	JTextArea text = new JTextArea();   // create text area
            	frame.add(text);
            	
            	// create Menu bar
            	
            	JMenuBar menuBar = new JMenuBar();
            	frame.add(menuBar, BorderLayout.NORTH);
            	
            	// create File
            	
            	JMenu fileMenu = new JMenu("File");
            	fileMenu.setForeground(Color.BLACK);
            	fileMenu.setMnemonic(KeyEvent.VK_F);
            	menuBar.add(fileMenu);
            	
            	// New, Mnemonic - N, Accelerator  CTRL - N
            	
            	JMenuItem newItem = new JMenuItem("New");
            	newItem.setMnemonic(KeyEvent.VK_N);
            	newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
            	fileMenu.add(newItem);
            	
            	// Open, Mnemonic - O, Accelerator CTRL - O
            	
            	JMenuItem openItem = new JMenuItem("Open");
            	openItem.setMnemonic(KeyEvent.VK_O);
            	openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
            	fileMenu.add(openItem);
            	
            	// Save, Mnemonic - S, Accelerator CTRL - S
            	
            	JMenuItem saveItem = new JMenuItem("Save");
            	saveItem.setMnemonic(KeyEvent.VK_S);
            	saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
            	fileMenu.add(saveItem);
            	
            	// Exit, Mnemonic - E, Accelerator CTRL - E
            	
            	JMenuItem exitItem = new JMenuItem("Exit");
            	exitItem.setMnemonic(KeyEvent.VK_E);
            	exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
            	fileMenu.add(exitItem);
            	
            	// open JFileChooser 
            	 
            	  openItem.addActionListener(new ActionListener() {

      				@Override
      				public void actionPerformed(ActionEvent e) {
      					
      					JFileChooser fileChooser = new JFileChooser();
      					switch(fileChooser.showOpenDialog(frame)) {
      					case JFileChooser.APPROVE_OPTION:
      						// open file
      						break;
      					}
      					
      					fileChooser.addChoosableFileFilter(new FileFilter()
                        {
                           @Override
                           public boolean accept(File file)
                           {
                              return file.getName().toUpperCase().
                                     equals(".DOC");
                           }

                           @Override
                           public String getDescription()
                           {
                              return ".doc files";
                           }
                        });
      					
      				}
              		
              	}); // end open JFileChooser
            	  
            	  // save JFileChooser
            	  
            	  saveItem.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
					
					 JFileChooser fileChooser = new JFileChooser();
						switch(fileChooser.showSaveDialog(frame)) {
						case JFileChooser.APPROVE_OPTION:
							// save file
							break;
						
						} 
					 };
					});
            	  
            	  // create actionListener
            	  
            	  ActionListener actionListener = new ActionListener() {

      				@Override
      				public void actionPerformed(ActionEvent actionEvent) {
      					
      				
      					String command = actionEvent.getActionCommand();
      					System.out.println("" + command);
      				
      					//  exit dialog
      					
      					if(actionEvent.getSource().equals(exitItem)) {
      						int retValue= JOptionPane.showConfirmDialog(getParent(), "Really Exit???");
      						if(retValue == JOptionPane.YES_NO_CANCEL_OPTION) {
      					   System.exit(0);
      					   
      						} 
      						
      					   }	// end exit dialog 
      					
      				} // end actionEvent
      				
      				private Component getParent() {
      					
      					return null;
      				}
      				
      			}; // end actionListener
					
      			exitItem.addActionListener(actionListener);  //  shows Exit dialog 
      			
				}
          
        };
        
        EventQueue.invokeLater(runnable);
    }
}