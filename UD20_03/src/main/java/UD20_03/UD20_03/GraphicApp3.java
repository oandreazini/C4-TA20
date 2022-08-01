package UD20_03.UD20_03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GraphicApp3 extends JFrame{
	
	private JPanel contentPane;

	public GraphicApp3() {
		setTitle("Ejercicio 3 de la TA20");

		setBounds(700, 400, 500, 150);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		exercise3();
	}

	
	private void exercise3() {
		// Labels
		JLabel button1Label1 = new JLabel("Boton 1:");
		button1Label1.setBounds(66, 29, 46, 14);
		contentPane.add(button1Label1);

		JLabel button1CountLabel = new JLabel("0");
		button1CountLabel.setBounds(117, 29, 25, 14);
		contentPane.add(button1CountLabel);

		JLabel button2Label1 = new JLabel("Boton 2:");
		button2Label1.setBounds(269, 29, 46, 14);
		contentPane.add(button2Label1);

		JLabel button2CountLabel = new JLabel("0");
		button2CountLabel.setBounds(323, 29, 25, 14);
		contentPane.add(button2CountLabel);
		
		JLabel button1Label2 = new JLabel("veces pulsado.");
		button1Label2.setBounds(140, 29, 90, 14);
		contentPane.add(button1Label2);
		
		JLabel button2Label2 = new JLabel("veces pulsado.");
		button2Label2.setBounds(349, 29, 90, 14);
		contentPane.add(button2Label2);

		
		
		/* Buttons */
		// Button 1
		JButton button1 = new JButton("Boton 1");
		button1.setBounds(94, 54, 89, 23);
		contentPane.add(button1);
		// Listener button 1
		ActionListener button1ActLis = new ActionListener() {
			public void actionPerformed(ActionEvent button1Event) {
				int count = Integer.parseInt(button1CountLabel.getText());
				count++;
				String text = "";
				if (count == 1) {
					button1Label2.setText("vez pulsado.");
					text = text.valueOf(count);
					button1CountLabel.setText(text);
				} else {
					button1Label2.setText("veces pulsado.");
					text = text.valueOf(count);
					button1CountLabel.setText(text);
				}
			}
		};
		button1.addActionListener(button1ActLis);

		
		// Button 2
		JButton button2 = new JButton("Boton 2");
		button2.setBounds(300, 54, 89, 23);
		contentPane.add(button2);
		// Listener button 2
		ActionListener button2ActLis = new ActionListener() {
			public void actionPerformed(ActionEvent button2Event) {
				int count = Integer.parseInt(button2CountLabel.getText());
				count++;
				String text = "";
				if (count == 1) {
					button2Label2.setText("vez pulsado.");
					text = text.valueOf(count);
					button2CountLabel.setText(text);
				} else {
					button2Label2.setText("veces pulsado.");
					text = text.valueOf(count);
					button2CountLabel.setText(text);
				}
			}
		};
		button2.addActionListener(button2ActLis);

	}
}