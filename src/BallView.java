
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import static javafx.scene.paint.Color.color;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annie
 */
public class BallView extends JPanel{// implements KeyListener{
  

    Color[] color;
        ArrayList<Ball> myBall=new ArrayList<Ball>();
    public BallView(Arena ga){
       if(myBall.size()<50)
       {
        myBall.add(new Ball((int)(Math.random()*400),(int)(Math.random()*400),(int)(Math.random()*20),(int)(Math.random()*20)));
        Random random=new Random();
           
        color=new Color[30];
        for (int i = 0; i < 30; i++) {
          final float r=random.nextFloat();
          final float g=0.9f;
          final float b=1.0f;
            color[i]=Color.getHSBColor(r, g, b);
        }
            
        }
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        //g.setColor(Color.BLUE);
        //g.fillRect(0, 0, 900, 650);
        int i=0;
        while (i<myBall.size()) {
             g.setColor(color[i%30]);
        g.fillOval(myBall.get(i).x, myBall.get(i).y, 30, 30);
        i++;
            
        }
      
    }  


    
}
