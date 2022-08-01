package UD20_05.UD20_05;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;


public class GraphicApp5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Panel de aplicacion
	 */
	public GraphicApp5 () {

		// Titulo de la ventana
		setTitle("Eventos del raton");

		// Coordenadas etc
		setBounds(400, 200, 687, 384);

		// Cerrar tambien el programa
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Hacer visible la ventana
		setVisible(true);

		// Inicializamos el panel
		contentPane = new JPanel();

		// Indicamos diseno
		contentPane.setLayout(null);

		// Asignar panel de la ventana
		setContentPane(contentPane);

		interaction();

	}

	public void interaction() { 

		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(305, 10, 85, 21);
		contentPane.add(btnNewButton);

		textField = new JTextField("");
		textField.setBounds(10, 41, 653, 296);
		contentPane.add(textField);
		textField.setColumns(10);

		// Creamos un listener para la accion de pulsar el boton 1
		ActionListener actLis_1 = new ActionListener() {

			// Creamos una accion (LIMPIAR) cuando se pulse el boton
			public void actionPerformed(ActionEvent interaction) {

				textField.setText("");
			}
		};
		btnNewButton.addActionListener(actLis_1);

		// Creamos un listener para la accion de usar el raton en textField
		MouseListener actLis_2 = new MouseListener() {

			// Creamos una accion a realizar cuando se pulse el boton del mouse
			public void mouseClicked(MouseEvent e) {
				String text = textField.getText();
				textField.setText( text + "Mouse Clicked,  ");

			}

			public void mousePressed(MouseEvent e) {
				String text = textField.getText();
				textField.setText( text + "Mouse Pressed, ");

			}

			public void mouseReleased(MouseEvent e) {
				String text = textField.getText();
				textField.setText( text + "Mouse Released, ");

			}

			public void mouseEntered(MouseEvent e) {
				String text = textField.getText();
				textField.setText( text + "Mouse Entered, ");

			}

			public void mouseExited(MouseEvent e) {
				String text = textField.getText();
				textField.setText( text + "Mouse Exited, ");

			}
		};

		textField.addMouseListener(actLis_2);

	}
}
