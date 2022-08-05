package claraogalla.UD20_01;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class GraphicApplication extends JFrame {

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

		interaction();
	}

	public void interaction() {

		JLabel lblUdmaven = new JLabel("");
		lblUdmaven.setIcon(new ImageIcon("C:\\Users\\oriol_000\\Desktop\\download.png"));
		lblUdmaven.setHorizontalAlignment(SwingConstants.CENTER);
		lblUdmaven.setBackground(Color.WHITE);
		lblUdmaven.setForeground(Color.BLACK);
		lblUdmaven.setFont(new Font("Arial Black", Font.BOLD, 53));
		lblUdmaven.setBounds(180, 10, 260, 227);
		contentPane.add(lblUdmaven);

		Cursor CD = new Cursor(Cursor.DEFAULT_CURSOR);
		Cursor C1 = new Cursor(Cursor.NW_RESIZE_CURSOR);
		Cursor C2 = new Cursor(Cursor.SW_RESIZE_CURSOR);
		Cursor C3 = new Cursor(Cursor.NE_RESIZE_CURSOR);
		Cursor C4 = new Cursor(Cursor.SE_RESIZE_CURSOR);
		Cursor C5 = new Cursor(Cursor.W_RESIZE_CURSOR);
		Cursor C6 = new Cursor(Cursor.E_RESIZE_CURSOR);
		Cursor C7 = new Cursor(Cursor.N_RESIZE_CURSOR);
		Cursor C8 = new Cursor(Cursor.S_RESIZE_CURSOR);

		int space = 4;
		int sizeMin = 30;

		lblUdmaven.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				if (e.getX() <= space && e.getY() <= space) {
					lblUdmaven.setCursor(C1);// Sobre los bordes superior/izquierdo
				} else if (e.getX() <= space && e.getY() >= lblUdmaven.getHeight() - space) {
					lblUdmaven.setCursor(C2);// Sobre los bordes inferior/izquierdo
				} else if (e.getY() <= space && e.getX() >= lblUdmaven.getWidth() - space) {
					lblUdmaven.setCursor(C3);// Sobre los bordes superior/derecho
				} else if (e.getY() >= lblUdmaven.getHeight() - space && e.getX() >= lblUdmaven.getWidth() - space) {
					lblUdmaven.setCursor(C4);// Sobre los bordes inferior/derecho
				} else if (e.getX() <= space) {
					lblUdmaven.setCursor(C5);// Sobre el borde izquierdo
				} else if (e.getX() >= lblUdmaven.getWidth() - space) {
					lblUdmaven.setCursor(C6);// Sobre el borde derecho
				} else if (e.getY() <= space) {
					lblUdmaven.setCursor(C7);// Sobre el borde superior
				} else if (e.getY() >= lblUdmaven.getHeight() - space) {
					lblUdmaven.setCursor(C8);// Sobre el borde inferior
				} else {
					lblUdmaven.setCursor(CD);// Ninguno de los bordes
				}
			}

			public void mouseDragged(MouseEvent e) {
				// captura del tipo de cursor
				int tipoCursor = lblUdmaven.getCursor().getType();

				switch (tipoCursor) {
				case 4: // Tipo SouthWest [esquina inferior izquierda]
					if (lblUdmaven.getWidth() > sizeMin && lblUdmaven.getHeight() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth() - e.getX(),
								lblUdmaven.getHeight() - (lblUdmaven.getHeight() - e.getY()));
						lblUdmaven.setLocation(lblUdmaven.getX() + e.getX(), lblUdmaven.getY());
					}
					break;
				case 5: // Tipo SouthEast [esquina inferior derecha]
					if (lblUdmaven.getWidth() > sizeMin && lblUdmaven.getHeight() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth() - (lblUdmaven.getWidth() - e.getX()),
								lblUdmaven.getHeight() - (lblUdmaven.getHeight() - e.getY()));
						lblUdmaven.setLocation(lblUdmaven.getX(), lblUdmaven.getY());
					}
					break;
				case 6: // Tipo NorthWest [esquina superior izquierda]
					if (lblUdmaven.getWidth() > sizeMin && lblUdmaven.getHeight() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth() - e.getX(), lblUdmaven.getHeight() - e.getY());
						lblUdmaven.setLocation(lblUdmaven.getX() + e.getX(), lblUdmaven.getY() + e.getY());
					}
					break;
				case 7: // Tipo NorthEast [esquina superior derecha]
					if (lblUdmaven.getWidth() > sizeMin && lblUdmaven.getHeight() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth() - (lblUdmaven.getWidth() - e.getX()),
								lblUdmaven.getHeight() - e.getY());
						lblUdmaven.setLocation(lblUdmaven.getX(), lblUdmaven.getY() + e.getY());
					}
					break;
				case 8: // Tipo North [borde superior]
					if (lblUdmaven.getHeight() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth(), lblUdmaven.getHeight() - e.getY());
						lblUdmaven.setLocation(lblUdmaven.getX(), lblUdmaven.getY() + e.getY());
					}
					break;
				case 9: // Tipo South [borde inferior]
					if (lblUdmaven.getHeight() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth(),
								lblUdmaven.getHeight() - (lblUdmaven.getHeight() - e.getY()));
						lblUdmaven.setLocation(lblUdmaven.getX(), lblUdmaven.getY());
					}
					break;
				case 10: // Tipo West [borde izquierdo]
					if (lblUdmaven.getWidth() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth() - e.getX(), lblUdmaven.getHeight());
						lblUdmaven.setLocation(lblUdmaven.getX() + e.getX(), lblUdmaven.getY());
					}
					break;
				case 11: // Tipo East [borde derecho]
					if (lblUdmaven.getWidth() > sizeMin) {
						lblUdmaven.setSize(lblUdmaven.getWidth() - (lblUdmaven.getWidth() - e.getX()),
								lblUdmaven.getHeight());
						lblUdmaven.setLocation(lblUdmaven.getX(), lblUdmaven.getY());
					}
					break;
				}
			}
		});

		lblUdmaven.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent evt) {
				if (lblUdmaven.getWidth() <= sizeMin) {
					lblUdmaven.setBounds(lblUdmaven.getX(), lblUdmaven.getY(),
							lblUdmaven.getWidth() - (lblUdmaven.getWidth() - (sizeMin + 1)), lblUdmaven.getHeight());
				}

				if (lblUdmaven.getHeight() <= sizeMin) {
					lblUdmaven.setBounds(lblUdmaven.getX(), lblUdmaven.getY(), lblUdmaven.getWidth(),
							lblUdmaven.getHeight() - (lblUdmaven.getHeight() - (sizeMin + 1)));
				}
			}
		});
	}
}
