package week15.lab1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AlignFrame extends JFrame {
	
	private JButton okJButton;
	private JButton cancelJButton;
	private JButton helpJButton;
	private JTextField xJTextField;
	private JTextField yJTextField;
	private JLabel xJLabel;
	private JLabel yJLabel;
	private JCheckBox snapJCheckbox;
	private JCheckBox showJCheckbox;
	private JPanel checkJPanel;
	private JPanel buttonJPanel;
	private JPanel fieldJPanel1;
	private JPanel fieldJPanel2;
	private JPanel fieldJPanel;
	
	public AlignFrame() {
		super("Align");
		
		//build JCheckPanel 
		snapJCheckbox = new JCheckBox("Snap to Grid");
		showJCheckbox = new JCheckBox ("Show Grid");
		checkJPanel = new JPanel(); 		
		checkJPanel.setLayout(new GridLayout(2,1));
		checkJPanel.add(snapJCheckbox);
		checkJPanel.add(showJCheckbox);
		
		//build field panel1
		xJLabel = new JLabel("X: ");
		xJTextField = new JTextField("8,3");
		fieldJPanel1 = new JPanel();
		fieldJPanel1.setLayout(new FlowLayout());
		fieldJPanel1.add(xJLabel);
		fieldJPanel1.add(xJTextField);
		
		//build field panel2
		yJLabel = new JLabel("Y: ");
		yJTextField = new JTextField("8,3");
		fieldJPanel2 = new JPanel();
		fieldJPanel2.setLayout(new FlowLayout());
		fieldJPanel2.add(yJLabel);
		fieldJPanel2.add(yJTextField);
		
		//build field panel
		fieldJPanel = new JPanel();
		fieldJPanel.setLayout(new BorderLayout());
        fieldJPanel.add(fieldJPanel1, BorderLayout.NORTH);		
        fieldJPanel.add(fieldJPanel2, BorderLayout.SOUTH);
        
        //build button panel
        okJButton = new JButton("Ok");
        cancelJButton = new JButton("Cancel");
        helpJButton = new JButton("Help");
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(3,1,10,5));
        buttonJPanel.add(okJButton);
        buttonJPanel.add(cancelJButton);
        buttonJPanel.add(helpJButton);
        
        
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		add(checkJPanel);
		add(fieldJPanel);
		add(buttonJPanel);
		
		
		
		
	}
	

}
