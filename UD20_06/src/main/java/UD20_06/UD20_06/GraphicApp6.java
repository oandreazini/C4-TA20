package UD20_06.UD20_06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import java.awt.Font;


public class GraphicApp6 extends JFrame{

	private JPanel contentPane;
	private JTextField textFieldHeight;
	private JTextField textFieldWeight;
	private DecimalFormat numberFormat = new DecimalFormat("#.00");

	public GraphicApp6() {
		setTitle("Ejercicio 6 de la TA20");

		setBounds(700, 400, 550, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);

		exercise6();
	}


	private void exercise6() {
		/* Labels */
		JLabel heightLabel = new JLabel("Altura (cm):");
		heightLabel.setBounds(33, 22, 93, 14);
		contentPane.add(heightLabel);

		JLabel weightLabel = new JLabel("Peso (kg):");
		weightLabel.setBounds(231, 22, 63, 14);
		contentPane.add(weightLabel);

		JLabel resultEqualLabel = new JLabel("IMC = ");
		resultEqualLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		resultEqualLabel.setBounds(324, 66, 46, 14);
		contentPane.add(resultEqualLabel);

		JLabel resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		resultLabel.setBounds(363, 66, 80, 14);
		contentPane.add(resultLabel);


		/* Text Fields */
		textFieldHeight = new JTextField();
		textFieldHeight.setBounds(105, 19, 86, 20);
		contentPane.add(textFieldHeight);
		textFieldHeight.setColumns(10);

		textFieldWeight = new JTextField();
		textFieldWeight.setBounds(295, 19, 86, 20);
		contentPane.add(textFieldWeight);
		textFieldWeight.setColumns(10);

		/* Buttons */
		JButton buttonCalcIMC = new JButton("Calcular IMC");
		buttonCalcIMC.setBounds(131, 62, 119, 23);
		contentPane.add(buttonCalcIMC);

		JLabel infoLabel = new JLabel("Los valores normales se encuentran entre 18,5 y 24,99 .");
		infoLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		infoLabel.setBounds(33, 136, 290, 14);
		contentPane.add(infoLabel);
		// Listener button
		ActionListener buttonCalcActLis = new ActionListener() {
			public void actionPerformed(ActionEvent buttonEvent) {
				try {
					// Cambiamos de string a double
					String height = textFieldHeight.getText();
					double h = Double.parseDouble(height);
					h = h/100;

					String weight = textFieldWeight.getText();
					double w = Double.parseDouble(weight);

					// Calculamos el IMC
					double result = w / (h*h);

					resultLabel.setText(numberFormat.format(result));

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERROR! No rellenaste todos los campos. Porfavor, rellena tanto la altura como el peso en las unidades correctas.", "VALUE ERROR", 0);
					System.out.println(e.getMessage());
				}
			}
		};
		buttonCalcIMC.addActionListener(buttonCalcActLis);
	}
}