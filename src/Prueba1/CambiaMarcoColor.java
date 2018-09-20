package Prueba1;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class CambiaMarcoColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco miMarco = new Marco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
	}

}


class Marco extends JFrame{
	public Marco(){
		
		setTitle("Cambia Color");
		setBounds(400, 200, 500, 500);
		Lamina milamina = new Lamina();
		add(milamina);
	}
}


class Lamina extends JPanel{
	public Lamina(){
		setLayout(new BorderLayout());
		rojo = new JButton("Rojo");
		rojo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.RED);
			}
			
		});
		add(rojo, BorderLayout.NORTH);
		
		JPanel lamina2 = new JPanel();
		lamina2.setLayout(new FlowLayout());
		
		azul = new JButton("Azul");
		azul.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.BLUE);
			}
		
		});
		lamina2.add(azul);
		amarillo = new JButton("Amarillo");
		amarillo.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.YELLOW);
			}
			
		});
		lamina2.add(amarillo);
		
		add(lamina2, BorderLayout.SOUTH);
	}
	
	private JButton rojo, azul, amarillo;
}