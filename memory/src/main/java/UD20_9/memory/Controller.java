package UD20_9.memory;

import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.swing.JPanel;

public class Controller {
	

	private static final int GAMEBORAD = 16; //constantes de la cantidad de botones
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
		token = GAMEBORAD ;
		buttons = new DashBoard[GAMEBORAD];
		number = new Vector<String>();
		rand = new Random();
		makeRandom();
	}
	
	// LLena el vector "number" con parejas del 1 al 8
	public void makeRandom() {
		for(int i=0; i<(GAMEBORAD/2); i++) {
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
	
	// Crea los botones, les asigna el numero random y una id
	public DashBoard[] createButtons() {
		for(int i=0; i<GAMEBORAD; i++) {
			buttons[i] = new DashBoard();
			buttons[i].setNumero(randomNumber());
			buttons[]
		}
	}
}
