
import javax.swing.JFrame;
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
public class Arena  {
    JFrame fr;
    BallView bv;
    BallGenerator bgen;
  
    
    public Arena(){
        initGUI();
    }
    public void initGUI(){
        
        fr=new JFrame();
        bv=new BallView(this);
        bv.setVisible(true);
        bgen=new BallGenerator(bv);
        
        BallMovementController bvctrl;
        bvctrl=new BallMovementController(bv,0);
        
        bv.setVisible(true);
       fr.addKeyListener(bgen);
        fr.add(bv);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(900, 650);
    
        fr.setVisible(true);
        fr.setResizable(false);
      
        
        Thread t=new Thread(bvctrl);
        t.start();
      
    }
}
