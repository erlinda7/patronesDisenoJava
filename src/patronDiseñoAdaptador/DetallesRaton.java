/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronDiseñoAdaptador;

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import javax.swing.*;

/**
 *
 * @author chamb
 */
public class DetallesRaton extends JFrame{
    private int xPos, yPos;
    
    public DetallesRaton(){
        super("Muestra de MouseAdapter");
        addMouseListener(new ManejadorRaton());
        setSize(400,200);
        setVisible(true);
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Se hizo clic en : ["+xPos +"," +yPos+"]", xPos, yPos);
    }
    
    public static void main(String[] args) {
        DetallesRaton dr= new DetallesRaton();
        dr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    class ManejadorRaton extends MouseAdapter{
    @Override
    public void mouseClicked(MouseEvent evento){
        xPos = evento.getX();
        yPos =evento.getY();
        repaint();
    }
}
}


