
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annie
 */
public class BallGenerator implements KeyListener{
    
    BallView bv;
    BallMovementController bmct;
    Thread t;
    
    public BallGenerator(BallView b){
        this.bv=b;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
       
        switch(e.getKeyCode()){
            case 32:
                if(bv.myBall.size()<=50)
                {
                    bv.myBall.add(new Ball((400),(int)(Math.random()*400),(int)(Math.random()*20),(int)(Math.random()*20)));
                    bmct=new BallMovementController(bv,bv.myBall.size()-1);
                    Thread t=new Thread(bmct);
                    t.start();
                
                    bv.revalidate();
                    bv.repaint();
                }
                
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
