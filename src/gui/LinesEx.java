package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import projectGraphe.Canalisation;
import projectGraphe.Sommet;

public class LinesEx extends JFrame
{
	private ArrayList<Canalisation> reseaux;
	private ArrayList<Sommet> sommets;
	Dimension maxSize = new Dimension(100, 100);
	private JButton start = new JButton ("start");
	

	
	
	 public LinesEx(ArrayList<Canalisation> reseaux, ArrayList<Sommet> sommets) {
		 	this.reseaux=reseaux;
		 	this.sommets=sommets;
		 	this.setLayout(new BorderLayout());
	        initUI();
	    }

	    private void initUI() {


	        this.add(new Surface(reseaux, sommets), BorderLayout.CENTER);
	        this.setTitle("Lines");
	        this.setSize(350, 250);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        start.setSize(maxSize);
	        this.add(start, BorderLayout.SOUTH);

	    }
	    
}
