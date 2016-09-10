package JMenu;

import javax.swing.*;

import JColor.FontComboBox;
import java.awt.*;
import java.awt.event.*;

public class Excercise extends JFrame implements ActionListener {
	
    JLabel fontLabel = new JLabel();
	
	private JComboBox fontComboBox;

	  public Excercise() {
	    setTitle("ComboBoxTest");
	    setSize(1024, 768);
	    addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        System.exit(0);
	      }
	    });

	    fontComboBox = new JComboBox();
	    fontComboBox.setEditable(true);
	    fontComboBox.addItem("Serif");
	    fontComboBox.addItem("SansSerif");
	    fontComboBox.addItem("Monospaced");
	    fontComboBox.addItem("Dialog");
	    fontComboBox.addItem("DialogInput");
	    fontComboBox.addActionListener(this);

	    JPanel p = new JPanel();
	    p.add(fontComboBox);
	    getContentPane().add(p, "North");
	    getContentPane().add(fontLabel, "Center");
	  }

	  public void actionPerformed(ActionEvent evt) {
	    JComboBox source = (JComboBox) evt.getSource();
	    String item = (String) source.getSelectedItem();
	    fontLabel.setFont(new Font(item, Font.PLAIN, 12));
	 
	  }
	
	
	public static void main(String[] args) {

	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			
			// define frame
			
		//	JFrame frame1 = new JFrame(" Simple Frame ");
		//	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame.setDefaultLookAndFeelDecorated(true);
		//	frame1.setVisible(true);
		//	frame1.setSize(1024, 768);
			
			
			
			// MouseListener
			
			

			MouseAdapter mouseListener = new MouseAdapter() {

				public void mousePressed(MouseEvent mouseEvent) {
					
					int modifiers = mouseEvent.getModifiers();
					
					if((modifiers & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {
						
						System.out.println("Mouse clicked");
					} else {
						System.out.println("Wrong mouse button clicked");
					}
				}

			}; // end mouseListener
			
			
			JMenuBar menuBar = new JMenuBar();
			
			
			
			// File
			
			JMenu fileMenu = new JMenu("File");
			fileMenu.setForeground(Color.BLACK);
			fileMenu.setMnemonic(KeyEvent.VK_F);
			
            
			
			JTextArea text = new JTextArea();
			
			// New, Mnemonic - N, Accelerator  CTRL - N
			
			JMenuItem newItem = new JMenuItem("New");
			newItem.setMnemonic(KeyEvent.VK_N);
			newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
			newItem.setActionCommand("New file");
			newItem.addMouseListener(mouseListener);
			fileMenu.add(newItem);
			
			
		   // Open, Mnemonic - O, Accelerator CTRL - O
			
			JMenuItem openItem = new JMenuItem("Open");
			openItem.setMnemonic(KeyEvent.VK_O);
			openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
			openItem.setActionCommand("Opened");
			openItem.addMouseListener(mouseListener);
			fileMenu.add(openItem);
			
			// Save, Mnemonic - S, Accelerator CTRL - S
			
			JMenuItem saveItem = new JMenuItem("Save");
			saveItem.setMnemonic(KeyEvent.VK_S);
		    saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
            saveItem.setActionCommand("Saved");
			saveItem.addMouseListener(mouseListener);
			fileMenu.add(saveItem);
			
			// Save As, Mnemonic - A, Accelerator CTRL - A
			
			JMenuItem saveAsItem = new JMenuItem("Save as...");
			saveAsItem.setMnemonic(KeyEvent.VK_A);
			saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		    saveAsItem.setActionCommand("Save as");
		    fileMenu.add(saveAsItem);
			
			
			
			
			// exitAppItem, Mnemonic - E, Accelerator CTRL - E
			
			JMenuItem exitAppItem = new JMenuItem("Exit Application");
			exitAppItem.setMnemonic(KeyEvent.VK_E);
			exitAppItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
	        fileMenu.add(exitAppItem);
	        
	        //
	        
	        //  Edit
			
			JMenu editMenu = new JMenu("Edit");
			editMenu.setForeground(Color.BLACK);
			editMenu.setMnemonic(KeyEvent.VK_E);
			
			// Cancel, Mnemonic A, Accelerator CTRL - A
			
			JMenuItem cancelItem = new JMenuItem("Cancel");
			cancelItem.setMnemonic(KeyEvent.VK_A);
			cancelItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
			cancelItem.addMouseListener(mouseListener);
			editMenu.add(cancelItem);
			
		
			
			
			// Cut, Mnemonic X , CTRL - X
			
			JMenuItem cutItem = new JMenuItem("Cut");
			cutItem.setMnemonic(KeyEvent.VK_X);
			cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
			cutItem.setActionCommand("Cutted");
			editMenu.add(cutItem);
			
			// Copy, Mnemonic C, Accelerator - C
			
			JMenuItem copyItem = new JMenuItem("Copy");
			copyItem.setMnemonic(KeyEvent.VK_C);
			copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK ));
			copyItem.setActionCommand("Copied");
			editMenu.add(copyItem);
			
			// Paste, Mnemonic A, Accelerator - CTRL - A
			
			JMenuItem pasteItem = new JMenuItem("Paste");
			pasteItem.setMnemonic(KeyEvent.VK_A);
			pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
			pasteItem.setActionCommand("Pasted");
		    editMenu.add(pasteItem);
		    
		    // Delete, Mnemonic D, Accelerator - DELETE
		    
		    JMenuItem deleteItem = new JMenuItem("Delete");
		    deleteItem.setMnemonic(KeyEvent.VK_DELETE);
		    deleteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, ActionEvent.CTRL_MASK));
		    deleteItem.setActionCommand("Deleted");
		    editMenu.add(deleteItem);
		    
		    //
		    
		    // Format 
		    
		    JMenu formatMenu = new JMenu("Format");
		    formatMenu.setMnemonic(KeyEvent.VK_F);
		    formatMenu.setBackground(Color.BLACK);
		    
		    // Font, Mnemonic - O, Accelerator - CTRL - O
		    
		    JMenuItem fontItem = new JMenuItem("Font");
		    fontItem.setMnemonic(KeyEvent.VK_O);
		    fontItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
			formatMenu.add(fontItem);
			
			//JMenuItem copyItem
			
			
			ActionListener actionListener = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent actionEvent) {
					
				
					String command = actionEvent.getActionCommand();
					System.out.println("" + command);
				
					// exit app
					
					if(actionEvent.getSource().equals(exitAppItem)) {
						int retValue= JOptionPane.showConfirmDialog(getParent(), "Really Exit???");
						if(retValue == JOptionPane.YES_NO_CANCEL_OPTION) {
					   System.exit(0);
					   
						} 
						
					   }	// end exit app 
					
					if(actionEvent.getSource().equals(openItem)) {
						int retValue2 = JOptionPane.showConfirmDialog(getParent(), "Really open??");
						if(retValue2 == JOptionPane.YES_OPTION) {
							System.exit(0);
						}
					}
					
					} // end actionEvent
				
				
				
			     private Component getParent() {
					
					return null;
				}
				
			}; // end actionListener
			
			
			
		//	frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
						
			exitAppItem.addActionListener(actionListener);
			openItem.addActionListener(actionListener);
			
		   // attach actionListener
		    
			// File
			
		    newItem.addActionListener(actionListener);
	        saveItem.addActionListener(actionListener);
			saveAsItem.addActionListener(actionListener);
			
			// Edit
			
			cancelItem.addActionListener(actionListener);
			cutItem.addActionListener(actionListener);
			copyItem.addActionListener(actionListener);
			pasteItem.addActionListener(actionListener);
			deleteItem.addActionListener(actionListener);
			
			// Format
			
			fontItem.addActionListener(actionListener);
			
			// attach mouseListener
			
			openItem.addMouseListener(mouseListener);
			
			saveItem.addActionListener(actionListener);
			saveAsItem.addMouseListener(mouseListener);
			
			// attach comboBox
			
			
			JFrame frame1 = new FontComboBox();
		    frame1.show();
			
			
			// attach frame components
			
			frame1.add(text);
			menuBar.add(fileMenu);
			menuBar.add(editMenu);
			menuBar.add(formatMenu);
			frame1.add(menuBar, BorderLayout.NORTH);
			
			
			
		}
		
	};
	
	EventQueue.invokeLater(runnable);
	}

}
