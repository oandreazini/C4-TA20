package UD20_04.UD20_04;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class GraphicApp4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lbl_1;

	/**
	 * Panel de aplicacion
	 */
	public GraphicApp4() {

		// Titulo de la ventana
		setTitle("Eventos de la ventana");

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

		// Crear area de texto
		textField = new JTextField("");
		textField.setBounds(91, 41, 572, 296);
		contentPane.add(textField);
		textField.setColumns(10);

		// Crear Label
		lbl_1 = new JLabel("Eventos");
		lbl_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_1.setBounds(10, 180, 71, 15);
		contentPane.add(lbl_1);

		// Creamos un listener para la accion de la ventana
		EventsWindow actLis_2 = new EventsWindow();

		addWindowListener(actLis_2);
	}

	// Creamos una clase para las acciones en la ventana
	class EventsWindow implements WindowListener {

		// Creamos una metodo para cada accion que tiene la ventana

		public void windowOpened(WindowEvent e) {
			String text = textField.getText();
			textField.setText(text + "Ventana activa,  ");
		}

		public void windowClosing(WindowEvent e) {
			String text = textField.getText();
			textField.setText(text + "Se ha cerrado una ventana,  ");
		}

		public void windowClosed(WindowEvent e) {
			String text = textField.getText();
			textField.setText(text + "Cerrar la ventana,  ");
		}

		public void windowIconified(WindowEvent e) {
			String text = textField.getText();
			textField.setText(text + "Ventana ya no es la ventana activa,  ");
		}

		public void windowDeiconified(WindowEvent e) {
			String text = textField.getText();
			textField.setText(text + "Ventana cambia de un estado minimizado a un estado normal,  ");
		}

		public void windowActivated(WindowEvent e) {
			String text = textField.getText();
			textField.setText(text + "Ventana activada,  ");
		}

		public void windowDeactivated(WindowEvent e) {
			String text = textField.getText();
			textField.setText(text + "Ventana desactivada,  ");
		}
	};
}
