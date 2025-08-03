package paquetovich;
import java.awt.*;
import javax.swing.*;
public class sdawd extends JFrame {
	 
	public sdawd() {
	        this.setTitle("Registrar Usuario");
	        this.setSize(700, 500);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setLocationRelativeTo(null);
	       
	      
	        JPanel panel1 = new JPanel();
	        JPanel panel2 = new JPanel();
 
	       this.add(panel1,BorderLayout.CENTER);
	       this.add(panel2,BorderLayout.SOUTH);


	     JLabel etiqueta1 = new JLabel("Nombre:");
	        JTextField texto1 = new JTextField(5);
	        JLabel etiqueta2 = new JLabel("Apellido:");
	        JTextField texto2 = new JTextField(5);
	        JLabel etiqueta3 = new JLabel("Cedula:");
	        JTextField texto3 = new JTextField(5);
	        JLabel etiqueta4 = new JLabel("Edad:");
	        JTextField texto4 = new JTextField(5);
     
	        JLabel etiqueta5 = new JLabel("Rol:");
	        String[] roles ={"Estudiante","Profesor"};
	        JComboBox comboGenero = new JComboBox(roles);   
	        JButton buton1 = new JButton("Registrar");

	        panel1.setLayout(new GridLayout(15,15));
	       
	        panel1.add(etiqueta1);
	        panel1.add(texto1);
	        panel1.add(etiqueta2);
	        panel1.add(texto2);
	        panel1.add(etiqueta3);
	        panel1.add(texto3);
	        panel1.add(etiqueta4);
	        panel1.add(texto4);
	        panel1.add(etiqueta5);
	        panel1.add(comboGenero);
	        panel2.add(buton1);

	    }
}

