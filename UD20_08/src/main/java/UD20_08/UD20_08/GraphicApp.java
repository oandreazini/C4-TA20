package UD20_08.UD20_08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.*;
import java.awt.Font;

public class GraphicApp extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldQuantity;
	private DecimalFormat numberFormat = new DecimalFormat("#.00");

	public GraphicApp() {
		setTitle("Ejercicio 8 de la TA20");

		setBounds(700, 400, 550, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);

		exercise8();
	}

	private void exercise8() {
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
						resultLabel.setText(numberFormat.format(ptas) + " ptas.");

					} else if (buttonCalc.getText().compareTo("Ptas a euros") == 0) {
						double ptas = Double.parseDouble(textFieldQuantity.getText());
						double euros = ptas / 166.386;
						resultLabel.setText(numberFormat.format(euros) + " euros.");
					}

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"ERROR! No rellenaste el campo o lo rellenaste con un valor incorrecto.", "VALUE ERROR", 0);
					System.out.println(e.getMessage());
				}
			}
		};
		buttonCalc.addActionListener(buttonCalcActLis);

		// Listener para el textField donde pondremos el importe y con la tecla intro
		// nos dara el resultado
		textFieldQuantity.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {

			}

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						if (buttonCalc.getText().compareTo("Euros a ptas") == 0) {
							double euros = Double.parseDouble(textFieldQuantity.getText());
							double ptas = euros * 166.386;
							resultLabel.setText(numberFormat.format(ptas) + " ptas.");

						} else if (buttonCalc.getText().compareTo("Ptas a euros") == 0) {
							double ptas = Double.parseDouble(textFieldQuantity.getText());
							double euros = ptas / 166.386;
							resultLabel.setText(numberFormat.format(euros) + " euros.");
						}

					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null,
								"ERROR! No rellenaste el campo o lo rellenaste con un valor incorrecto.", "VALUE ERROR",
								0);
						System.out.println(e1.getMessage());
					}
				}
			}

			public void keyReleased(KeyEvent e) {

			}
		});

		// Boton cambiar
		JButton buttonChange = new JButton("Cambiar");
		buttonChange.setBounds(230, 68, 89, 23);
		contentPane.add(buttonChange);

		// Listener button cambiar
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

		// Listener para cambiar de divisa con enter
		buttonChange.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {

			}

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (buttonCalc.getText().compareTo("Euros a ptas") == 0) {
						buttonCalc.setText("Ptas a euros");
					} else {
						buttonCalc.setText("Euros a ptas");
					}
				}
			}

			public void keyReleased(KeyEvent e) {

			}
		});

		// Boton borrar
		JButton buttonDel = new JButton("Borrar");
		buttonDel.setBounds(337, 69, 100, 22);
		contentPane.add(buttonDel);

		// Listener button borrar
		ActionListener buttonDelete = new ActionListener() {

			// Creamos una accion (LIMPIAR) cuando se pulse el boton
			public void actionPerformed(ActionEvent delete) {
				resultLabel.setText("");
				textFieldQuantity.setText("");
			}
		};
		buttonDel.addActionListener(buttonDelete);

		// Listener para borrar con enter
		buttonDel.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {

			}

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					resultLabel.setText("");
					textFieldQuantity.setText("");
				}
			}

			public void keyReleased(KeyEvent e) {

			}
		});
	}
}
