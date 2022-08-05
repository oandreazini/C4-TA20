package UD20_9.memory;

import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.swing.JPanel;

public class Controller {
	

	private static final int ROW = 4, COLUMNS = 4; //constantes de la cantidad de botones
	private Vector<String>number;
	private DashBoard[] buttons;
	private Random rand;
	private int rad;
	private int token;
	private int shift;
	private int type1;
	private int type;
	private int indenti1;
	private int identi2;
	private int count;
	
	// Se inicializan los botones y variables
	public Controller(){
		token = ROW * COLUMNS;
		buttons = new DashBoard[ROW*COLUMNS];
		number = new Vector<String>();
		rand = new Random();
		makeRandom();
	}
	
	// LLena el vector "number" con parejas del 1 al 8
	public void makeRandom() {
		for(int i=0; i<(ROW * COLUMNS/2); i++) {
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
	
	// Crea los botones, les asigna el numero random y un 
}
