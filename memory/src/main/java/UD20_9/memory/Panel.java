package UD20_9.memory;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

public class Panel extends JFrame{
	
	private JPanel contentPane;
	
	
	/**
	 * Constructor ventana en blanco que llama a los otros elementos
	 * @throws IOException 
	 */
	public Panel() throws IOException {

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
		
		/* Labels */
		JToggleButton tglbtn1 = new JToggleButton("");
		tglbtn1.setBounds(10, 64, 121, 120);
		tglbtn1.setIcon(new ImageIcon(getClass().getResource("/icons/0.png")));
		tglbtn1.setSelectedIcon(new ImageIcon(getClass().getResource("/icons/1.png")));
		contentPane.add(tglbtn1);
		
		JToggleButton tglbtn2 = new JToggleButton("");
		tglbtn2.setBounds(141, 64, 121, 120);
		tglbtn2.setIcon(new ImageIcon(getClass().getResource("/icons/0.png")));
		// TODO
		contentPane.add(tglbtn2);
		
		JToggleButton tglbtn3 = new JToggleButton("");
		tglbtn3.setBounds(272, 64, 121, 120);
		contentPane.add(tglbtn3);
		
		JToggleButton tglbtn4 = new JToggleButton("");
		tglbtn4.setBounds(403, 64, 121, 120);
		contentPane.add(tglbtn4);
		
		JToggleButton tglbtn5 = new JToggleButton("");
		tglbtn5.setBounds(10, 195, 121, 120);
		contentPane.add(tglbtn5);
		
		JToggleButton tglbtn6 = new JToggleButton("");
		tglbtn6.setBounds(141, 195, 121, 120);
		contentPane.add(tglbtn6);
		
		JToggleButton tglbtn7 = new JToggleButton("");
		tglbtn7.setBounds(272, 195, 121, 120);
		contentPane.add(tglbtn7);
		
		JToggleButton tglbtn8 = new JToggleButton("");
		tglbtn8.setBounds(403, 195, 121, 120);
		contentPane.add(tglbtn8);
		
		JToggleButton tglbtn9 = new JToggleButton("");
		tglbtn9.setBounds(10, 326, 121, 120);
		contentPane.add(tglbtn9);
		
		JToggleButton tglbtn10 = new JToggleButton("");
		tglbtn10.setBounds(141, 326, 121, 120);
		contentPane.add(tglbtn10);
		
		JToggleButton tglbtn11 = new JToggleButton("");
		tglbtn11.setBounds(272, 326, 121, 120);
		contentPane.add(tglbtn11);
		
		JToggleButton tglbtn12 = new JToggleButton("");
		tglbtn12.setBounds(403, 326, 121, 120);
		contentPane.add(tglbtn12);
		
		JToggleButton tglbtn13 = new JToggleButton("");
		tglbtn13.setBounds(10, 457, 121, 120);
		contentPane.add(tglbtn13);
		
		JToggleButton tglbtn14 = new JToggleButton("");
		tglbtn14.setBounds(141, 457, 121, 120);
		contentPane.add(tglbtn14);
		
		JToggleButton tglbtn15 = new JToggleButton("");
		tglbtn15.setBounds(272, 457, 121, 120);
		contentPane.add(tglbtn15);
		
		JToggleButton tglbtn16 = new JToggleButton("");
		tglbtn16.setBounds(403, 457, 121, 120);
		contentPane.add(tglbtn16);
		
		
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