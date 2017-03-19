package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import projectGraphe.Canalisation;
import projectGraphe.Sommet;

public class LinesEx extends JFrame
{
	private ArrayList<Canalisation> reseaux;
	private ArrayList<Sommet> sommets;
	Dimension maxSize = new Dimension(100, 100);
	private JButton west = new JButton ("DEMARRER");
	
	
	 public LinesEx(ArrayList<Canalisation> reseaux, ArrayList<Sommet> sommets) {
		 	this.reseaux=reseaux;
		 	this.sommets=sommets;
	        initUI();
	    }

	    private void initUI() {

	        add(new Surface(reseaux, sommets));

	        setTitle("Lines");
	        setSize(350, 250);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*d
	    }
	    
}
