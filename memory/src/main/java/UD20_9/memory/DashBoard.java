package UD20_9.memory;

import javax.imageio.ImageIO;
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
	
	/* Buttons */
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
	
	// Array de buttons con el respectivo numero de buttons dentro del array
//	private JToggleButton[] buttons = new JToggleButton[16];
//	private int buttonsNum = 0;
	
	
	
	/**
	 * Constructor ventana en blanco que llama a los otros elementos
	 * @throws IOException 
	 */
	public DashBoard() throws IOException {

		setTitle("Memory");

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
		
		/* Buttons */
		tglbtn1 = new JToggleButton("");
		tglbtn1.setBounds(10, 64, 121, 120);
		contentPane.add(tglbtn1);
		
		
		tglbtn2 = new JToggleButton("");
		tglbtn2.setBounds(141, 64, 121, 120);
		contentPane.add(tglbtn2);
		
		
		tglbtn3 = new JToggleButton("");
		tglbtn3.setBounds(272, 64, 121, 120);
		contentPane.add(tglbtn3);
		
		
		tglbtn4 = new JToggleButton("");
		tglbtn4.setBounds(403, 64, 121, 120);
		contentPane.add(tglbtn4);
		
		
		tglbtn5 = new JToggleButton("");
		tglbtn5.setBounds(10, 195, 121, 120);
		contentPane.add(tglbtn5);
		
		
		tglbtn6 = new JToggleButton("");
		tglbtn6.setBounds(141, 195, 121, 120);
		contentPane.add(tglbtn6);
		
		
		tglbtn7 = new JToggleButton("");
		tglbtn7.setBounds(272, 195, 121, 120);
		contentPane.add(tglbtn7);
		
		
		tglbtn8 = new JToggleButton("");
		tglbtn8.setBounds(403, 195, 121, 120);
		contentPane.add(tglbtn8);
		
		
		tglbtn9 = new JToggleButton("");
		tglbtn9.setBounds(10, 326, 121, 120);
		contentPane.add(tglbtn9);
		
		
		tglbtn10 = new JToggleButton("");
		tglbtn10.setBounds(141, 326, 121, 120);
		contentPane.add(tglbtn10);
		
		
		tglbtn11 = new JToggleButton("");
		tglbtn11.setBounds(272, 326, 121, 120);
		contentPane.add(tglbtn11);
		
		
		tglbtn12 = new JToggleButton("");
		tglbtn12.setBounds(403, 326, 121, 120);
		contentPane.add(tglbtn12);
		
		
		tglbtn13 = new JToggleButton("");
		tglbtn13.setBounds(10, 457, 121, 120);
		contentPane.add(tglbtn13);
		
		
		tglbtn14 = new JToggleButton("");
		tglbtn14.setBounds(141, 457, 121, 120);
		contentPane.add(tglbtn14);
		
		
		tglbtn15 = new JToggleButton("");
		tglbtn15.setBounds(272, 457, 121, 120);
		contentPane.add(tglbtn15);
		
		
		tglbtn16 = new JToggleButton("");
		tglbtn16.setBounds(403, 457, 121, 120);
		contentPane.add(tglbtn16);
		
//		addButtonsToArray(tglbtn1);
//		addButtonsToArray(tglbtn2);
//		addButtonsToArray(tglbtn3);
//		addButtonsToArray(tglbtn4);
//		addButtonsToArray(tglbtn5);
//		addButtonsToArray(tglbtn6);
//		addButtonsToArray(tglbtn7);
//		addButtonsToArray(tglbtn8);
//		addButtonsToArray(tglbtn9);
//		addButtonsToArray(tglbtn10);
//		addButtonsToArray(tglbtn11);
//		addButtonsToArray(tglbtn12);
//		addButtonsToArray(tglbtn13);
//		addButtonsToArray(tglbtn14);
//		addButtonsToArray(tglbtn15);
//		addButtonsToArray(tglbtn16);
		
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

	/**
	 * 
	 */
//	public void addButtonsToArray(JToggleButton tglbtn) {
//		buttons[buttonsNum] = tglbtn;
//		buttonsNum++;
//	}
	

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}


	/**
	 * @param contentPane the contentPane to set
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	/**
	 * @return the tglbtn1
	 */
	public JToggleButton getTglbtn1() {
		return tglbtn1;
	}


	/**
	 * @param tglbtn1 the tglbtn1 to set
	 */
	public void setTglbtn1(JToggleButton tglbtn1) {
		this.tglbtn1 = tglbtn1;
	}


	/**
	 * @return the tglbtn2
	 */
	public JToggleButton getTglbtn2() {
		return tglbtn2;
	}


	/**
	 * @param tglbtn2 the tglbtn2 to set
	 */
	public void setTglbtn2(JToggleButton tglbtn2) {
		this.tglbtn2 = tglbtn2;
	}


	/**
	 * @return the tglbtn3
	 */
	public JToggleButton getTglbtn3() {
		return tglbtn3;
	}


	/**
	 * @param tglbtn3 the tglbtn3 to set
	 */
	public void setTglbtn3(JToggleButton tglbtn3) {
		this.tglbtn3 = tglbtn3;
	}


	/**
	 * @return the tglbtn4
	 */
	public JToggleButton getTglbtn4() {
		return tglbtn4;
	}


	/**
	 * @param tglbtn4 the tglbtn4 to set
	 */
	public void setTglbtn4(JToggleButton tglbtn4) {
		this.tglbtn4 = tglbtn4;
	}


	/**
	 * @return the tglbtn5
	 */
	public JToggleButton getTglbtn5() {
		return tglbtn5;
	}


	/**
	 * @param tglbtn5 the tglbtn5 to set
	 */
	public void setTglbtn5(JToggleButton tglbtn5) {
		this.tglbtn5 = tglbtn5;
	}


	/**
	 * @return the tglbtn6
	 */
	public JToggleButton getTglbtn6() {
		return tglbtn6;
	}


	/**
	 * @param tglbtn6 the tglbtn6 to set
	 */
	public void setTglbtn6(JToggleButton tglbtn6) {
		this.tglbtn6 = tglbtn6;
	}


	/**
	 * @return the tglbtn7
	 */
	public JToggleButton getTglbtn7() {
		return tglbtn7;
	}


	/**
	 * @param tglbtn7 the tglbtn7 to set
	 */
	public void setTglbtn7(JToggleButton tglbtn7) {
		this.tglbtn7 = tglbtn7;
	}


	/**
	 * @return the tglbtn8
	 */
	public JToggleButton getTglbtn8() {
		return tglbtn8;
	}


	/**
	 * @param tglbtn8 the tglbtn8 to set
	 */
	public void setTglbtn8(JToggleButton tglbtn8) {
		this.tglbtn8 = tglbtn8;
	}


	/**
	 * @return the tglbtn9
	 */
	public JToggleButton getTglbtn9() {
		return tglbtn9;
	}


	/**
	 * @param tglbtn9 the tglbtn9 to set
	 */
	public void setTglbtn9(JToggleButton tglbtn9) {
		this.tglbtn9 = tglbtn9;
	}


	/**
	 * @return the tglbtn10
	 */
	public JToggleButton getTglbtn10() {
		return tglbtn10;
	}


	/**
	 * @param tglbtn10 the tglbtn10 to set
	 */
	public void setTglbtn10(JToggleButton tglbtn10) {
		this.tglbtn10 = tglbtn10;
	}


	/**
	 * @return the tglbtn11
	 */
	public JToggleButton getTglbtn11() {
		return tglbtn11;
	}


	/**
	 * @param tglbtn11 the tglbtn11 to set
	 */
	public void setTglbtn11(JToggleButton tglbtn11) {
		this.tglbtn11 = tglbtn11;
	}


	/**
	 * @return the tglbtn12
	 */
	public JToggleButton getTglbtn12() {
		return tglbtn12;
	}


	/**
	 * @param tglbtn12 the tglbtn12 to set
	 */
	public void setTglbtn12(JToggleButton tglbtn12) {
		this.tglbtn12 = tglbtn12;
	}


	/**
	 * @return the tglbtn13
	 */
	public JToggleButton getTglbtn13() {
		return tglbtn13;
	}


	/**
	 * @param tglbtn13 the tglbtn13 to set
	 */
	public void setTglbtn13(JToggleButton tglbtn13) {
		this.tglbtn13 = tglbtn13;
	}


	/**
	 * @return the tglbtn14
	 */
	public JToggleButton getTglbtn14() {
		return tglbtn14;
	}


	/**
	 * @param tglbtn14 the tglbtn14 to set
	 */
	public void setTglbtn14(JToggleButton tglbtn14) {
		this.tglbtn14 = tglbtn14;
	}


	/**
	 * @return the tglbtn15
	 */
	public JToggleButton getTglbtn15() {
		return tglbtn15;
	}


	/**
	 * @param tglbtn15 the tglbtn15 to set
	 */
	public void setTglbtn15(JToggleButton tglbtn15) {
		this.tglbtn15 = tglbtn15;
	}


	/**
	 * @return the tglbtn16
	 */
	public JToggleButton getTglbtn16() {
		return tglbtn16;
	}


	/**
	 * @param tglbtn16 the tglbtn16 to set
	 */
	public void setTglbtn16(JToggleButton tglbtn16) {
		this.tglbtn16 = tglbtn16;
	}


	/**
	 * @return the buttons
	 */
//	public JToggleButton[] getButtons() {
//		return buttons;
//	}
}