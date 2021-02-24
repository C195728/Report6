package jp.ac.uryukyu.ie.e195728;

import javax.swing.JFrame;
/**
 * GUIとして画面に表示するためのクラス
 * JFramメソッドを継承している。
 */
public class Frame extends JFrame{
    private static final long serialVersionUID = 1L;
    public Frame(){
    JFrame frame = new JFrame("air hockey");
    frame.add(new Draw());
    frame.setSize(600,750);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);
    }
}
