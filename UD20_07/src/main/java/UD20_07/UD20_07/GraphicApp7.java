package UD20_07.UD20_07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import java.awt.Font;


public class GraphicApp7 extends JFrame{

	private JPanel contentPane;
	private JTextField textFieldQuantity;
	private DecimalFormat numberFormat = new DecimalFormat("#.00");

	public GraphicApp7() {
		setTitle("Ejercicio 7 de la TA20");

		setBounds(700, 400, 550, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);

		exercise7();
	}


	private void exercise7() {	
		/* Labels */
		JLabel quantitylabel = new JLabel("Cantidad a convertir:");
		quantitylabel.setBounds(61, 25, 123, 14);
		contentPane.add(quantitylabel);

		JLabel resultLabelTitle = new JLabel("Resultado =");
		resultLabelTitle.setFont(new Font("Arial Black", Font.PLAIN, 11));
		resultLabelTitle.setBounds(337, 25, 79, 14);
		contentPane.add(resultLabelTitle);

		JLabel resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		resultLabel.setBounds(433, 25, 100, 14);
		contentPane.add(resultLabel);


		/* Text Fields */
		textFieldQuantity = new JTextField();
		textFieldQuantity.setBounds(190, 22, 86, 20);
		contentPane.add(textFieldQuantity);
		textFieldQuantity.setColumns(10);


		/* Buttons */
		// Boton calcular cambio
		JButton buttonCalc = new JButton("Euros a ptas");
		buttonCalc.setBounds(107, 68, 113, 23);
		contentPane.add(buttonCalc);
		// Listener button
		ActionListener buttonCalcActLis = new ActionListener() {
			public void actionPerformed(ActionEvent buttonCalcEvent) {
				try {
					if (buttonCalc.getText().compareTo("Euros a ptas") == 0) {
						double euros = Double.parseDouble(textFieldQuantity.getText());
						double ptas = euros * 166.386;
						resultLabel.setText(numberFormat.format(ptas)+" ptas.");

					} else if (buttonCalc.getText().compareTo("Ptas a euros") == 0) {
						double ptas = Double.parseDouble(textFieldQuantity.getText());
						double euros = ptas / 166.386;
						resultLabel.setText(numberFormat.format(euros)+ " euros.");
					}

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste el campo o lo rellenaste con un valor incorrecto.", "VALUE ERROR", 0);
					System.out.println(e.getMessage());
				}
			}
		};
		buttonCalc.addActionListener(buttonCalcActLis);

		// Boton cambiar
		JButton buttonChange = new JButton("Cambiar");
		buttonChange.setBounds(280, 68, 89, 23);
		contentPane.add(buttonChange);
		// Listener button
		ActionListener buttonChangeActLis = new ActionListener() {
			public void actionPerformed(ActionEvent buttonChangeEvent) {
				if (buttonCalc.getText().compareTo("Euros a ptas") == 0) {
					buttonCalc.setText("Ptas a euros");
				} else {
					buttonCalc.setText("Euros a ptas");
				}
			}
		};
		buttonChange.addActionListener(buttonChangeActLis);
	}
}