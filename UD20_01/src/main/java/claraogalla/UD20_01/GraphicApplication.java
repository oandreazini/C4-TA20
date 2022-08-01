package claraogalla.UD20_01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GraphicApplication extends JFrame{
	
	private JPanel contentPane;

	public GraphicApplication() {
		// TODO Auto-generated constructor stub
		// Titulo de la ventana
		setTitle("UD20_01");

		// Coordenadas etc
		setBounds(400, 200, 700, 300);

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
	}

}
