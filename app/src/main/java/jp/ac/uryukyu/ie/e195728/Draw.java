package jp.ac.uryukyu.ie.e195728;


import javax.swing.JPanel;
import java.awt.Graphics;
public class Draw extends JPanel{
    private static final long serialVersionUID = 1L;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(250,650,100,50);

    }
}