package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import projectGraphe.Canalisation;
import projectGraphe.Sommet;

class Surface extends JPanel {
	private ArrayList<Canalisation> reseau;
	private ArrayList<Sommet> sommets;
	
	Surface(ArrayList<Canalisation> reseau, ArrayList<Sommet> sommets)
	{
		this.reseau=reseau;
		this.sommets=sommets;
	}
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        
        for (Canalisation can : reseau)
        {
        g2d.drawLine(can.getSommetEntree().getX()*30, can.getSommetEntree().getY()*10, 
        		can.getSommetSortie().getX()*30, can.getSommetSortie().getY()*10);
        g2d.drawString(String.valueOf(can.getCapacity()), 
        		(can.getSommetEntree().getX()*30+can.getSommetSortie().getX()*30)/2,
        		(can.getSommetEntree().getY()*10+can.getSommetSortie().getY()*10)/2+15);
        }
  
        for (Sommet sommet : sommets)
        {
        	g2d.fillOval(sommet.getX()*30-5, sommet.getY()*10-8, 20, 20);
        	g2d.drawString(sommet.getName(), sommet.getX()*30-10, sommet.getY()*10-10);
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}
