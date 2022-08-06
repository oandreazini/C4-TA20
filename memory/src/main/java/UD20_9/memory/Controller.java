package UD20_9.memory;

import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Controller {
	
	private static final int N_BUTTONS = 16; //constantes de la cantidad de botones

	private JToggleButton[] buttonsArray;
	private Vector<String>number;
	private Random rand;
	private int tokens;
	private int random;
	
	DashBoard window = new DashBoard();
	
	// Se inicializan los botones y variables
	public Controller() throws IOException{
				
		buttonsArray = new JToggleButton[N_BUTTONS];
		
		tokens = N_BUTTONS ;
		number = new Vector<String>();
		rand = new Random();
		makeRandom();
	}
	
	
	// LLena el vector "number" con parejas del 1 al 8
	public void makeRandom() {
		for(int i=0; i<N_BUTTONS/2; i++) {
			number.addElement(String.valueOf(i+1));
			number.addElement(String.valueOf(i+1));
		}
	}
	
	//Devuelve el numero que esta al vector "number" y lo elimina del vector
	public int randomNumber() {
		int numBack;
		random = rand.nextInt(tokens);
		numBack = Integer.parseInt(number.elementAt(random));
		number.removeElementAt(random);
		tokens-=1;
		return numBack;
	}
	
//	private JToggleButton[] setButtons() {
//		// TODO Auto-generated method stub
//		
//		
//		for(int i=0;i<N_BUTTONS;i++){
//			// Se guarda el numero generado aleatorio del 1 al 16
//			int numImagen = 0;
//			buttonsArray[i] = new JToggleButton();
//			buttonsArray[i]= numImagen(randomNumber());
//			
//			// Se utiliza ese numero para introducir una imagen aleatoria al boton
//			ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/"+numImagen+".png"));
//			buttonsArray[i].setSelectedIcon(img);
//		}
//		
//		return buttonsArray;
//	}
//
//
//	private JToggleButton numImagen(int randomNumber) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
