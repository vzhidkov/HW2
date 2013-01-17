package edu.artem.hw2;

import java.awt.Color;
/**
 * Circle class.
 * 
 *@author Artem Tarasenko
 *@version January 06th, 2013
 */
public class Circle extends AbstractShape
{
    private Color color;
    private int radius, xCoord, yCoord;
    private boolean selected;
    /**
     * constructor for the circle class
     * @param xNew - the value of x for the new Circle
     * @param yNew - the value of y for the new Circle
     * @param rNew - the value of radius for the new Circle
     */
    public Circle( int x, int y, int height){
        radius = height/2;
        xCoord = x + radius;
        yCoord = y + radius;
        color = new Color(0,0,0);
        selected = true;
    }
    
    //not finished
    public boolean isOn(int x, int y){
        
        double diffX = x - xCoord;
        double diffY = y - yCoord;
        double distance = Math.sqrt(diffX * diffX + diffY * diffY);
        if (distance > this.getRadius() ){
            return false;
        } else {
            return true;
        }
    }
    
    public boolean isSelected(){
        return selected;
    }
    
    public void setSelected(boolean b){
        selected = b;
    }
    
    public void shiftBy(int deltaX, int deltaY){
        xCoord+=deltaX;
        yCoord+=deltaY;
    }
    
    public void moveTo(int newX, int newY){
        xCoord = newX;
        yCoord = newY;
        //or I need to add this ???
        // x+= getRadius();
        // y+= getRadius();
    }
    
    /**
     * getX accessor method
     * @return x coordinate for this Circle
     */
    public int getX(){  return this.xCoord; }
    
    /**
     * getY accessor method
     * @return y coordinate for this Circle
     */
    public int getY(){ return this.yCoord; }
    
    /**
     * getRadius accessor method
     * @return radius coordinate for this Circle
     */
    public int getRadius() { return this.radius; }

    
    /**
     * getColor accessor method
     * @return color Color of this Circle
     */
    public Color getColor(){  return color; }
    
    
    /**
     * getColor accessor method
     * @return color Color of this Circle
     */
    public void setColor(Color c){  color = c; }
    
    /**
     * Method that returns information about Circle in format x:<x>. y:<y>. Radius:<r>.
     * @return    String that contains information about Circle method
     */
    public String toString(){
        return ("x: " + getX() + ". y: " + getY() + ". Radius: " + getRadius() + ". ");   
    }
}
