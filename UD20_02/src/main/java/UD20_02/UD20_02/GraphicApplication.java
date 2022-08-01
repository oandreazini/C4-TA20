package UD20_02.UD20_02;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GraphicApplication extends JFrame {


	private JPanel contentPane;

	/**
	 * Panel de aplicacion
	 */

	public GraphicApplication () {
		// Titulo de la ventana
		setTitle("Ventana con interaccion");

		// Coordenadas etc
		setBounds(400, 200, 578, 262);

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

		// Botones
		JButton btn_1 = new JButton("Boton 1");
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_1.setBounds(299, 57, 85, 21);
		contentPane.add(btn_1);


		JButton btn_2 = new JButton("Boton 2");
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_2.setBounds(409, 57, 85, 21);
		contentPane.add(btn_2);

		// Labels
		JLabel lblNewLabel = new JLabel("Has pulsado: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(51, 61, 97, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(140, 61, 45, 13);
		contentPane.add(lblNewLabel_1);

		// Creamos un listener para la accion de pulsar el boton 1
		ActionListener actLis_1 = new ActionListener() {

			// Creamos una accion a realizar cuando se pulse el boton
			public void actionPerformed(ActionEvent interaction) {
				//  Introducimos el nombre 
				lblNewLabel_1.setText("Boton 1");
			}
		};

		btn_1.addActionListener(actLis_1);
		// Creamos un listener para la accion de pulsar el boton 2
		ActionListener actLis_2 = new ActionListener() {

			// Creamos una accion a realizar cuando se pulse el boton
			public void actionPerformed(ActionEvent interaction) {
				//  Introducimos el nombre 
				lblNewLabel_1.setText("Boton 2");
			}
		};

		btn_2.addActionListener(actLis_2);	
	}
}
