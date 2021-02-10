package week15.lab13;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColourSelectFrame extends JFrame {
	
	private JButton okButton;
	private JButton cancelButton;
	private JCheckBox backgroundCheckBox;
	private JCheckBox foregroundCheckBox;
	private JComboBox colourComboBox;
	private JPanel panel;
	private JPanel panel2;
	
	public ColourSelectFrame() {
		super("ColourSelect");
		
		setLayout(new BorderLayout());
		
		colourComboBox = new JComboBox();
		colourComboBox.addItem("RED");
		colourComboBox.addItem("BLUE");
		colourComboBox.addItem("GREEN");
		add(colourComboBox, BorderLayout.NORTH);
		
		panel = new JPanel();
		backgroundCheckBox = new JCheckBox("Background");
		foregroundCheckBox = new JCheckBox("Foreground");
		panel.add(backgroundCheckBox);
		panel.add(foregroundCheckBox);
		add(panel, BorderLayout.CENTER);
		
		panel2 = new JPanel();
		okButton = new JButton("Ok");
		cancelButton = new JButton("Cancel");
		panel2.add(okButton);
		panel2.add(cancelButton);
		add(panel2, BorderLayout.SOUTH);
		
		
		
		
		
		
		
		
	}
	
	
}
