import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	public static JFrame frmMain;
	public static JLabel lblCelsius;
	public static JTextField txtCelsius;
	public static JLabel lblFahrenheit;
	public static JTextField txtFahrenheit;
	public static JButton btnCalculateCtoF;
	public static JButton btnCalculateFtoC;

		
	public static void main(String[] args){
		//Create the frame
		frmMain = new JFrame("Temperature Converter");
		frmMain.setSize(150, 200);
		frmMain.setLayout(new FlowLayout());
		
		//Create GUI Elements
		lblCelsius = new JLabel("Celsius:");
		txtCelsius = new JTextField(10);
		lblFahrenheit = new JLabel("Fahrenheit:");
		txtFahrenheit = new JTextField(10);
		btnCalculateCtoF = new JButton("Convert Celsius to Fahrenheit");
		btnCalculateFtoC = new JButton("Convert Fahrenheit to Celsius");
		
		//Add ActionListeners
		btnCalculateCtoF.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Convert C to F
					String cText = txtCelsius.getText();
					double c = Double.parseDouble(cText);
					double f = (c * 9 / 5) + 32;
					txtFahrenheit.setText(String.valueOf(f));
				}
			}
		);
		
		btnCalculateFtoC.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Convert F to C
						String fText = txtFahrenheit.getText();
						double f = Double.parseDouble(fText);
						double c = (f - 32) * 5 / 9;
						txtCelsius.setText(String.valueOf(c));
					}
				}
			);
		
		//Add GUI Elements to frame
		frmMain.add(lblCelsius);
		frmMain.add(txtCelsius);
		frmMain.add(lblFahrenheit);
		frmMain.add(txtFahrenheit);
		frmMain.add(btnCalculateCtoF);
		frmMain.add(btnCalculateFtoC);
		
		frmMain.setVisible(true);
	 }
	
}
