package jp.ac.uryukyu.ie.e195728;

import javax.swing.JPanel;
import java.awt.Graphics;
/**
 * マレットの部分(矩形)とボール(楕円)を描画するクラス
 * int width;//画面の横幅
 * int height;//画面の縦幅
 * int x;//矩形や楕円の横幅
 * int y;//矩形や楕円の横幅
 */
public class Draw extends JPanel{
    private int x,y,width,height,Ballwidth,Ballheight,Ballx,Bally,move_x,move_y;
    private static final long serialVersionUID = 1L;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        width = 250;
        height = 650;
        x = 100;
        y = 50;
        g.fillRect(width,height,x,y);
        Ballwidth = 250;
        Ballheight = 300;
        Ballx = 50;
        Bally = 50;
        move_x=40;
        move_y=40;
        g.fillOval(Ballwidth,Ballheight,Ballx,Bally);
        Ballwidth+=move_x;
        Ballheight+=move_y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    /*public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    } */ 

}