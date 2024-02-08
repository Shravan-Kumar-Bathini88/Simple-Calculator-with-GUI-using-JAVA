//Import everything required for implementing the GUI
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator implements ActionListener{ //Implementation of action listener is to be done so that we can generate responses to user inputs
	char operator; 									// Declare the required variables for operators and input numbers and results
	double num1, num2, result;
	JTextField textfield = new JTextField();		//Initiate a text field and the Frame 
	JFrame frame = new JFrame();
	JButton button0 = new JButton("0");				// Create all the buttons required for the Calculator GUI
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button10 = new JButton("+");
	JButton button11 = new JButton("-");
	JButton button12 = new JButton("*");
	JButton button13 = new JButton("/");
	JButton button14 = new JButton("=");
	JButton button15 = new JButton("Clr");

	
	
	JButton[] numbuttons = new JButton[16];		// Store in a Array of buttons
	
	public  MyCalculator() {					// Implement the function here, which is called from Main 
		numbuttons[0]=button0;
		numbuttons[1]=button1;
		numbuttons[2]=button2;
		numbuttons[3]=button3;
		numbuttons[4]=button4;
		numbuttons[5]=button5;
		numbuttons[6]=button6;
		numbuttons[7]=button7;
		numbuttons[8]=button8;
		numbuttons[9]=button9;
		numbuttons[10] = button10;
		numbuttons[11] = button11;
		numbuttons[12] = button12;
		numbuttons[13] = button13;
		numbuttons[14] = button14;
		numbuttons[15] = button15;

		for(int i=0; i<16; i++) {				//	Initiate the action listener for all the buttons
		numbuttons[i].addActionListener(this);
	}
		
	JPanel panel = new JPanel();				// Create the Panel and mention the dimensions
	frame.setSize(420,550);
	frame.add(panel,BorderLayout.CENTER);		// Add Panel to the Frame
	panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
	panel.setLayout(new GridLayout(0,5));		// Set the Grid Layout for the GUI buttons
	
	
	for (int i=0; i<16; i++) {					// Add all the buttons to the panel	
		panel.add(numbuttons[i]);
	}
	textfield.setEditable(false);				// Set the text field to not editable , it is displayed only from the program
	panel.add(textfield);						// Add the text field to the panel
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//	Exit the application on closing
	frame.setTitle("MyCalculator");				// Name the GUI
	frame.pack();								// For auto adjusting the size of buttons
	frame.setVisible(true);						// For displaying the Frame
	}

	public static void main(String[] args) {	// Implement the main function
		new MyCalculator();						// Call the function MyCalculator to execute
	}

	@Override
	public void actionPerformed(ActionEvent e) {	//Implement the Override function for the action listener
		// TODO Auto-generated method stub	
		for(int i=0; i<10; i++) {	
		if(e.getSource()== numbuttons[i]) {			// Check the user input and display in the text field
			textfield.setText(textfield.getText().concat(String.valueOf(i)));
		}
		}
		if(e.getSource()== button10) {				// assign input to num1 and operator
			num1 =Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");					// Clear the text field
			
		}
		

		if(e.getSource()== button11) {
			num1 =Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
			
		}
		

		if(e.getSource()== button12) {
			num1 =Double.parseDouble(textfield.getText());
			 operator = '*';
			textfield.setText("");
			
		}
		

		if(e.getSource()== button13) {
			num1 =Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
			
		}
		

		if(e.getSource()== button14) {
			num2 =Double.parseDouble(textfield.getText());		//Assign num2 when = operator is pressed
		switch(operator) {
		case '+':												// Check the operator and execute 
			 result = num1+num2;
			 break;
		case '-':
			 result = num1-num2;
			 break;
		case '*':
			 result = num1*num2;
			 break;
		case '/':
			 result = num1/num2;
			 break;
			 
		}

		 textfield.setText(String.valueOf(result));			// Display the result in the text field and assign the result to num1 for further calculations
			num1=result;									
		
		//}
		
		
	}
		if(e.getSource()== button15) {						//Implement the clear button 
			textfield.setText("");
	}
	}
		
		
}
//}