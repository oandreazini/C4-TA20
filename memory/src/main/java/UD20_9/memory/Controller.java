package UD20_9.memory;

import java.io.IOException;
import java.util.Random;

public class Controller {

	DashBoard window;

	/**
	 * Constructor de controller que inicializa los arrays necesarios para los
	 * procesos antes inicializando el JPanel de la ventana principal
	 * 
	 * @throws IOException
	 */
	public Controller() throws IOException {
		// Inicializa la ventana
		window = new DashBoard();
		
		// Inicializa los arrays necesarios
		initArrays();
	}
	
	/**
	 * Inicializa todos los arrays y genera numeros aleatorios para colocar 
	 * aleatoriamente las 8 imagenes (repetidas cada una 1 vez)
	 */
	private void initArrays() {
		// Inicializamos los arrays
		window.initArrayImages();
		loadArray(window.arrayNumImage);
		loadArray(window.arrayControl);
		loadArray(window.arrayCouples);
		loadArray(window.arrayClick);

		// Genera numeros aleatorios
		Random r = new Random();
		int positionImage;
		for (int i = 0; i < 16; i++) {
			// La variable positionImage obtendra un valor random entre el 0 y el 7 y se
			// valida que el numero aleatorio no se repita
			positionImage = r.nextInt(8);
			if (window.arrayControl[positionImage] < 2) {
				// almacena el valor que representa cada imagen (la imagen se llama con su
				// numero)
				window.arrayNumImage[i] = positionImage + 1;
				// Almacenamos el valor y augmentamos el valor, para saber que ya existe 1 vez
				window.arrayControl[positionImage]++;
			} else {
				// se repite la funcion para pedir otro numero
				i--;
			}
		}
	}

	/**
	 * Inicializa cada posicion del array que se le pasa por parámetro
	 * 
	 * @param array
	 */
	private void loadArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}

}