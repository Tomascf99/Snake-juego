package app;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Point;


public class Snake extends JFrame {
    
    int widht = 640;
    int height = 480;
    public Snake(){
        setTitle("Snake");

        setSize(widht,height);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-widht/2, dim.height/2-height/2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Teclas teclas = new Teclas();
        this.addKeyListener(teclas);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
       Snake s = new Snake();
    }

    public class Teclas extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                System.exit(0);
            }
            
        }
    }
}
