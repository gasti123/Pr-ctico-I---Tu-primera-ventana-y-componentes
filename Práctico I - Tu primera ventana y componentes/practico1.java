package ventanavich;
import java.awt.*;
import javax.swing.*;
public class practico1 extends JFrame{
	
		public practico1() {
		this.setTitle("Ventana de Prueba");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new GridLayout(2,1));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
	
		
		JLabel etiqueta1 = new JLabel("Bienvenido a mi programa");
		JLabel etiqueta2 = new JLabel("Nombre:");
		JTextField  nombre1= new JTextField();
		JButton boton1 = new JButton("Aceptar");
		
		
		
	   panel1.add(etiqueta1);
	   panel2.add(etiqueta2);
		panel2.add(nombre1);
		panel2.add(boton1);
		this.add(panel1);
		this.add(panel2);
		
		nombre1.setColumns(5);
	 
	  }
	}