package jp.ac.uryukyu.ie.e195728;

import javax.swing.JPanel;
//import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
/**
 * エアホッケーのマレットの部分(矩形で描画したもの)を矢印キーによって操作するクラス
 */
public class Controller extends JPanel{
    private static final long serialVersionUID = 1L;
    Draw draw = new Draw();
    public Controller(){
    setFocusable(true);
    Controller cont = new Controller();
    //addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        int keycode = e.getKeyCode();
        if(keycode == KeyEvent.VK_RIGHT){
            draw.setX(draw.getX()+5);
        }        
        repaint();
        }
    }

