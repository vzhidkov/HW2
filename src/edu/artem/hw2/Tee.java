package edu.artem.hw2;

import java.awt.Color;
/**
 * Tee class.
 * 
 *@author Artem Tarasenko
 *@version January 06th, 2013
 */
public class Tee extends AbstractShape
{
    private Color color;
    private int height, x, y, width;
    private boolean selected;
    /**
     * constructor for the circle class
     * @param xCoord - the value of x for the new Tee
     * @param yCoord - the value of y for the new Tee
     * @param height - the value of height for the new Tee
     */
    public Tee( int xCoord, int yCoord, int height){
        if (height <= 0 || height%10 != 0 ) {
            throw new IllegalArgumentException("Height of the Delta must be possitive and multiple of 10");
        } 

        //or this way
        // if (height%10 != 0) { this.height = (10 - height%10) + height; }

        this.height = height;
        width = height;
        x = xCoord;
        y = yCoord;
        color = new Color(0,0,0);
        selected = false;

    }

    //not finished
    public boolean isOn(int a, int b){
        if ( a >= x && a <= (x + height) && b >= y && b <= (y + height/5)  )   {
            return true;
        } else if ( a >= ( x + height/5*2 ) && a <= ( x + height/5*3 ) 
                    && b >= y && b <= ( y + height ) )   {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSelected(){
        return selected;
    }

    public void setSelected(boolean b){
        selected = b;
    }

    public void shiftBy(int deltaX, int deltaY){
        x+=deltaX;
        y+=deltaY;
    }

    public void moveTo(int newX, int newY){
        x = newX;
        y = newY;
    }

    /**
     * getX accessor method
     * @return x coordinate for this Tee
     */
    public int getX(){  return this.x; }

    /**
     * getY accessor method
     * @return y coordinate for this Tee
     */
    public int getY(){ return this.y; }

    /**
     * getRadius accessor method
     * @return radius coordinate for this Tee
     */
    public int getHeight() { return this.height; }

    /**
     * getColor accessor method
     * @return color Color of this Tee
     */
    public Color getColor(){  return color; }

    /**
     * getColor accessor method
     * @return color Color of this Tee
     */
    public void setColor(Color c){  color = c; }

    /**
     * Method that returns information about Delta in format x:<x>. y:<y>. Height:<r>.
     * @return    String that contains information about Tee object
     */
    public String toString(){
        return ("x: " + getX() + ". y: " + getY() + ". Height: " + getHeight() + ". ");   
    }
}
