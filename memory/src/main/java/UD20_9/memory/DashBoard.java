package UD20_9.memory;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

public class DashBoard extends JFrame{
	
	private JPanel contentPane;
	
	
	
	/**
	 * Constructor ventana en blanco que llama a los otros elementos
	 * @throws IOException 
	 */
	public DashBoard() throws IOException {

		setTitle("Tic Tac Toe");

		setBounds(500, 200, 552, 627);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);

		// Se llama a los elementos del memory
		memoryElements();
	}


	private void memoryElements() throws IOException {
		// TODO Auto-generated method stub
		
	
		
		
		/* Etiquetas */
		JLabel labelTry = new JLabel("Intentos: ");
		labelTry.setFont(new Font("Arial Black", Font.PLAIN, 14));
		labelTry.setBounds(361, 22, 90, 31);
		contentPane.add(labelTry);
		
		JLabel labelNumTry = new JLabel("0");
		labelNumTry.setFont(new Font("Arial Black", Font.PLAIN, 14));
		labelNumTry.setBounds(461, 30, 46, 14);
		contentPane.add(labelNumTry);
		
		
		
	}
}