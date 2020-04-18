

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annie
 */
public class BallMovementController implements Runnable{
    BallView ball;
    Random random=new Random();
    
    int i;
    int minX,minY,maxX,maxY;
    Dimension screen;
    int screenWidth,screenHight;
    Boolean right=true,left=false,up=false,down=true;
    public BallMovementController(BallView bb,int index){
        this.ball = bb;
        screen = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth=(int)screen.getWidth();
        screenHight=(int)screen.getHeight();
        minY=0;
        minX=0;
        maxX= screenWidth;
        maxY=screenHight;
        i=index;
        
    }

    @Override
    public void run() {

       while(true){
          
           if(down){
               if(ball.myBall.get(i).getY() >= maxY-110){
                   ball.myBall.get(i).ySpeed=-(ball.myBall.get(i).getSpeedY());
                   up=true;
                   down=false;
               }
           }
           if(up){
               if(ball.myBall.get(i).getY() <= minY){
                 ball.myBall.get(i).ySpeed=-(ball.myBall.get(i).getSpeedY());
                  up=false;
                  down=true;
               }
           }

           if(right){
               if(ball.myBall.get(i).getX()>=maxX-400){
                   ball.myBall.get(i).xSpeed=-(ball.myBall.get(i).getXSpeed());
                   right=false;
                   left=true;
               }
           }
           if(left){
               if(ball.myBall.get(i).getX()<=minX){
                    ball.myBall.get(i).xSpeed=-(ball.myBall.get(i).getXSpeed());
                   right=true;
                   left=false;
               }
           }
           
           ball.myBall.get(i).x=(ball.myBall.get(i).getX()+(ball.myBall.get(i).getXSpeed()));
           ball.myBall.get(i).y=(ball.myBall.get(i).getY()+(ball.myBall.get(i).getSpeedY()));
           
          ball.repaint();
          ball.revalidate();
           try {
               Thread.sleep(2);
           } catch (InterruptedException ex) {
             
                Logger.getLogger(BallMovementController.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       
    }
    
}
