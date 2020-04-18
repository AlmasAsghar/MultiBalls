
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Annie
 */
public class Ball {
    int x,y;
    int xSpeed,ySpeed;
    public Ball(int x,int y,int xspd,int yspd){
        this.x=x;
        this.y=y;
        this.xSpeed=xspd;
        this.ySpeed=yspd;
    }
    public void setX(int x){
        this.x=x;
    }
     public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public void setXSpeed(int x){
        this.xSpeed=x;
    }
    public int getXSpeed(){
        return this.xSpeed;
    }
    public void setSpeedY(int y){
        this.ySpeed=y;
    }
    public int getSpeedY(){
        return this.ySpeed;
    }
    public int getY(){
        return this.y;
    }

}
