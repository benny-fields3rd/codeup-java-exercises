/*******************
  Name: Benny A. Fields III

  Date: 10 March 2018

  Notes: Simple program to create a GUI with push button event.
 	 	 A window should pop up with two buttons. Additionally a 
 		 message will display that you are in the Main. Every time 
 		 you click on a button, a message will display displaying 
 		 what button was clicked. The program will close once the 
 		 user closes the window. 
    	
*******************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Actions extends JFrame implements ActionListener{
	
	private JButton myButton1;
	private JButton myButton2;
	
	public Actions(){
			
		setTitle("Assignment 5: My First GUI Window!");
		
		// Grab a handle to content pane
		Container c = getContentPane();
		
		// Set layout for content pane
		c.setLayout(new FlowLayout());
		
		// Adding my buttons to the layout
		myButton1 = new JButton("Button 1");
		myButton2 = new JButton("Button 2");
		
		// Add action listener for each button
		myButton1.addActionListener(this);
		myButton2.addActionListener(this);
		
		// Add buttons to the layout
		c.add(myButton1);
		c.add(myButton2);
				
	}
    
    public void actionPerformed(ActionEvent e){
    	// Check to see which button was clicked
    	if (e.getActionCommand().equals("Button 1")) {
    		System.out.println("You clicked Button 1!");
    	}
    	else if (e.getActionCommand().equals("Button 2")) {
    		System.out.println("You clicked Button 2!");
        }
    }
     public static void main (String[] args){
    	 // Create myWindow object from Action
    	 Actions myWindow = new Actions();
    	 //Set the size of the window
    	 myWindow.setSize(400,200);
    	 // Display the window
    	 myWindow.show();
    	 System.out.println("Professor Jinfang Wang, we are in the main method!");
    	 }
      }