package UD20_9.memory;

import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.swing.JPanel;

public class Controller {
	

	private static final int N_BUTTONS = 16; //constantes de la cantidad de botones
	
	private DashBoard window;
	
	private Vector<String>number;
	private Random rand;
	private int rad;
	private int token;
	
	// Se inicializan los botones y variables
	public Controller() throws IOException{
		
		window = new DashBoard();
		
		token = N_BUTTONS ;
		number = new Vector<String>();
		rand = new Random();
		makeRandom();
	}
	
	// LLena el vector "number" con parejas del 1 al 8
	public void makeRandom() {
		for(int i=0; i<8; i++) {
			number.addElement(String.valueOf(i+1));
			number.addElement(String.valueOf(i+1));
		}
	}
	
	//Devuelve el numero que esta al vector "number" y lo elimina del vector
	public int randomNumber() {
		int back;
		rad = rand.nextInt(token);
		back = Integer.parseInt(number.elementAt(rad));
		number.removeElementAt(rad);
		token-=1;
		return back;
	}
}
