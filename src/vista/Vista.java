package vista;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vista extends JFrame{
	public Vista() {
		// TODO Auto-generated constructor stub
		super("Hola");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Font fPrueba = new Font("Cascadia", Font.PLAIN, 20);
		JLabel prueba = new JLabel("Prueba", JLabel.CENTER);
		prueba.setFont(fPrueba);
		this.add(prueba);
	}
}
