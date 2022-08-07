package UD20_9.memory;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.SwingConstants;



public class DashBoard extends JFrame implements MouseListener {

	private JPanel contentPane;

	/* Buttons & Labels */
	private JToggleButton tglbtn1;
	private JToggleButton tglbtn2;
	private JToggleButton tglbtn3;
	private JToggleButton tglbtn4;
	private JToggleButton tglbtn5;
	private JToggleButton tglbtn6;
	private JToggleButton tglbtn7;
	private JToggleButton tglbtn8;
	private JToggleButton tglbtn9;
	private JToggleButton tglbtn10;
	private JToggleButton tglbtn11;
	private JToggleButton tglbtn12;
	private JToggleButton tglbtn13;
	private JToggleButton tglbtn14;
	private JToggleButton tglbtn15;
	private JToggleButton tglbtn16;
	private JLabel labelNumTry;
	private JLabel labelTry;

	// Array que contiene el numero que tienen las imagenes
	int arrayNumImage[] = new int[16];

	// Array que contiene los componentes de los JToogleButton
	JToggleButton arrayButtonImage[] = new JToggleButton[16];

	// Array que controla que no se repitan mas de 2 veces el mismo numero
	int arrayControl[] = new int[8];

	// Array que permite llevar el control de las parejas encontradas
	int arrayCouples[] = new int[16];

	// Array que nos permite contolar el click en cada imagen
	int arrayClick[] = new int[16];

	// Variable que nos contara los click que tenemos hechos "no superar los 2"
	int click = 0;

	// Variables para indicar que imagenes se estan mostrando
	int view1;
	int view2;
	
	// Variable para contar el total de parejas encontradas
	int numCouples;

	// Variable que nos va a sumar los puntos
	int points = 0;

	/**
	 * Constructor ventana en blanco que llama a los otros elementos
	 * 
	 * @throws IOException
	 */
	public DashBoard() throws IOException {

		contentPane = new JPanel();

		setTitle("Memory");

		setBounds(500, 200, 552, 627);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

		contentPane.setLayout(null);

		setContentPane(contentPane);

		setResizable(false);
		setLocationRelativeTo(null);

		// Se llama a los elementos del memory
		memoryElements();
	}

	/**
	 * Función que dispone todos los elementos del juego memory
	 */
	private void memoryElements() {

		/* Botones del tablero del 1 al 16 */
		tglbtn1 = new JToggleButton("");
		tglbtn1.setBounds(10, 64, 121, 120);

		tglbtn2 = new JToggleButton("");
		tglbtn2.setBounds(141, 64, 121, 120);

		tglbtn3 = new JToggleButton("");
		tglbtn3.setBounds(272, 64, 121, 120);

		tglbtn4 = new JToggleButton("");
		tglbtn4.setBounds(403, 64, 121, 120);

		tglbtn5 = new JToggleButton("");
		tglbtn5.setBounds(10, 195, 121, 120);

		tglbtn6 = new JToggleButton("");
		tglbtn6.setBounds(141, 195, 121, 120);

		tglbtn7 = new JToggleButton("");
		tglbtn7.setBounds(272, 195, 121, 120);

		tglbtn8 = new JToggleButton("");
		tglbtn8.setBounds(403, 195, 121, 120);

		tglbtn9 = new JToggleButton("");
		tglbtn9.setBounds(10, 326, 121, 120);

		tglbtn10 = new JToggleButton("");
		tglbtn10.setBounds(141, 326, 121, 120);

		tglbtn11 = new JToggleButton("");
		tglbtn11.setBounds(272, 326, 121, 120);

		tglbtn12 = new JToggleButton("");
		tglbtn12.setBounds(403, 326, 121, 120);

		tglbtn13 = new JToggleButton("");
		tglbtn13.setBounds(10, 457, 121, 120);

		tglbtn14 = new JToggleButton("");
		tglbtn14.setBounds(141, 457, 121, 120);

		tglbtn15 = new JToggleButton("");
		tglbtn15.setBounds(272, 457, 121, 120);

		tglbtn16 = new JToggleButton("");
		tglbtn16.setBounds(403, 457, 121, 120);

		/* Etiquetas */
		labelTry = new JLabel("Puntos:");
		labelTry.setFont(new Font("Arial Black", Font.PLAIN, 22));
		labelTry.setBounds(330, 22, 121, 31);

		labelNumTry = new JLabel("0");
		labelNumTry.setHorizontalAlignment(SwingConstants.CENTER);
		labelNumTry.setFont(new Font("Arial Black", Font.PLAIN, 22));
		labelNumTry.setBounds(437, 25, 87, 24);

		/* Se personaliza el panel y se añaden los elementos al mismo */
		contentPane.setBackground(new java.awt.Color(255, 204, 0));
		contentPane.setLayout(null);
		contentPane.setBounds(0, 0, 500, 465);
		contentPane.add(tglbtn1);
		contentPane.add(tglbtn2);
		contentPane.add(tglbtn3);
		contentPane.add(tglbtn4);
		contentPane.add(tglbtn5);
		contentPane.add(tglbtn6);
		contentPane.add(tglbtn7);
		contentPane.add(tglbtn8);
		contentPane.add(tglbtn9);
		contentPane.add(tglbtn10);
		contentPane.add(tglbtn11);
		contentPane.add(tglbtn12);
		contentPane.add(tglbtn13);
		contentPane.add(tglbtn14);
		contentPane.add(tglbtn15);
		contentPane.add(tglbtn16);

		contentPane.add(labelNumTry);
		contentPane.add(labelTry);

	}

	/**
	 * Metodo que permite inicializar el array de JToggleButton y asignarle a cada
	 * uno la imagen inicial de incognita
	 */
	public void initArrayImages() {
		arrayButtonImage[0] = tglbtn1;
		arrayButtonImage[1] = tglbtn2;
		arrayButtonImage[2] = tglbtn3;
		arrayButtonImage[3] = tglbtn4;
		arrayButtonImage[4] = tglbtn5;
		arrayButtonImage[5] = tglbtn6;
		arrayButtonImage[6] = tglbtn7;
		arrayButtonImage[7] = tglbtn8;
		arrayButtonImage[8] = tglbtn9;
		arrayButtonImage[9] = tglbtn10;
		arrayButtonImage[10] = tglbtn11;
		arrayButtonImage[11] = tglbtn12;
		arrayButtonImage[12] = tglbtn13;
		arrayButtonImage[13] = tglbtn14;
		arrayButtonImage[14] = tglbtn15;
		arrayButtonImage[15] = tglbtn16;

		for (int i = 0; i < 16; i++) {
			arrayButtonImage[i].setIcon(new ImageIcon(getClass().getResource("/images/quien.jpg")));
			arrayButtonImage[i].addMouseListener(this);
		}
	}

	/**
	 * Permite validar las parejas comparando las posiciones almacenadas al momento
	 * de mostrar las imagenes
	 * 
	 * @param view1
	 * @param view2
	 * @param i
	 */
	private void okCouples(int view1, int view2, int i) {
		/*
		 * valida si el valor en la posicion obtenida al encontrar la imagen 1 es igual
		 * al valor en la posicion obtenida al encontrar la imagen 2
		 */
		if (arrayNumImage[view1] == arrayNumImage[view2]) {
			// si esto se cumple se suman 10 puntos y se asigna un 1 para determinar que en
			// esas posiciones ya se encontraron parejas, se suma el numero de parejas y se esconde el JJToggleButton
			// se llama al metodo finished para comprovar si es el final de partida
			points += 10;
			labelNumTry.setText(points + "");
			numCouples++;
			arrayCouples[view1] = 1;
			arrayCouples[view2] = 1;
			arrayButtonImage[view1].setVisible(false);
			arrayButtonImage[view2].setVisible(false);
			finished();
		} else {
			/*
			 * Si no son iguales entonces se vuelve a poner la imagen de incognita y se
			 * reinicia el valor de la posicion en el arreglo que cuenta cuantos clic se han
			 * dado en cada JJToggleButton y se le restan 5 puntos
			 */
			points -= 5;
			labelNumTry.setText(points + "");
			arrayButtonImage[view1].setIcon(new ImageIcon(getClass().getResource("/images/quien.jpg")));
			arrayButtonImage[view2].setIcon(new ImageIcon(getClass().getResource("/images/quien.jpg")));
			arrayClick[view1] = 0;
			arrayClick[view2] = 0;
		}
	}

	/**
	 * Mensaje que salta de ganador al tener todas las parejas conseguidas
	 */
	private void finished() {
		if (numCouples == 8) {
			JOptionPane.showMessageDialog(null, "Enhorabuena has ganado!!", "GANADOR", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}

	/* Eventos del Mouse */

	/**
	 * Función que controla si se presiona 2 veces el mismo botón y guarda las
	 * posiciones de los botones vistos para poder ser comparados luego
	 */
	public void mouseClicked(MouseEvent e) {
		// Bucle que permite recorrer todos los JToggleButton del array y determinar
		// cuando uno se le ha dado click
		for (int i = 0; i < 16; i++) {

			/*
			 * Con esta validacion nos damos cuenta de cual JToggleButton se presiona y
			 * validamos que si es uno que esta descubierto porque su pareja fue encontrada,
			 * entonces no lo tenga en cuenta para validar mas parejas
			 */

			if (e.getSource() == arrayButtonImage[i] && verifyMatch(i)) {
				// si se presiona 2 veces seguidas un JToggleButton, se incrementa la posicion
				// del arreglo
				/*
				 * se valida que el mismo JToggleButton no se presionara mas de dos veces
				 * seguidas, si ocurre el sistema espera hasta que se presione otro
				 * JToggleButton para poder validar parejas
				 */
				arrayClick[i]++;
				if (arrayClick[i] < 2) {
					/*
					 * si lleva menos de 2 clic en un mismo JToggleButton entonces se muestra la
					 * imagen
					 */
					click++;
					arrayButtonImage[i]
							.setIcon(new ImageIcon(getClass().getResource("/images/" + arrayNumImage[i] + ".png")));
					if (click == 1) {
						// si se lleva 1 clic se almacena en una variable la posicion de la imagen para
						// luego ser comparada con la posicion de la segunda
						view1 = i;
					} else {
						// si se llevan 2 clic se almacena en una variable la posicion de la segunda
						// imagen para luego compararla con la primera
						view2 = i;
					}
				}
			}
		}
	}

	/**
	 * El verifyMatch almacena 0 o 1, 0 indica que no hay parejas encontradas para
	 * esa posicion, 1 indica que en esa posicion ya se encuentra una pareja.
	 * 
	 * @param i
	 * @return
	 */
	private boolean verifyMatch(int i) {
		if (arrayCouples[i] != 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Validador de las parejas que se ejecuta despues de tener 2 botones
	 * descubiertos
	 */
	@Override
	public void mouseExited(MouseEvent e) {
		// Cuando se ejecuta este evento se permite realizar la validacion de parejas,
		// solo cuando ya se han descubierto 2
		for (int i = 0; i < 16; i++) {
			if (e.getSource() == arrayButtonImage[i]) {
				if (click == 2) {
					okCouples(view1, view2, i);
					click = 0;
				}
			}
		}
	}

	
	/* Métodos necesarios de implementar aunque no realicen ninguna función */
	
	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}
}