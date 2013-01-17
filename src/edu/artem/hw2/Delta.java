package edu.artem.hw2;

import java.awt.Color;
/**
 * Delta class.
 * 
 *@author Artem Tarasenko
 *@version January 06th, 2013
 */
public class Delta extends AbstractShape
{
    private Color color;
    private int height, xCoord, yCoord;
    private boolean selected;
    /**
     * constructor for the circle class
     * @param xCoord - the value of x for the new Delta
     * @param yCoord - the value of y for the new Delta
     * @param height - the value of height for the new Delta
     */
    public Delta( int x, int y, int height){
        if (height <= 0 || height%2 != 0 ) {
            throw new IllegalArgumentException("Height of the Delta must be possitive and even");
        } 

        //or this way
        // if (height%2 != 0) { this.height = height + 1; }

        this.height = height;
        xCoord = x + height/2;
        yCoord = y;
        color = new Color(0,0,0);
        selected = true;

    }

    //not finished
    public boolean isOn(int x, int y){
        //lines
        //if (y == height || y == (height - 2*x) || y == (2*x - height) ){
          //  return true;
        //} else 
        if ( y >= this.yCoord && y <= (this.yCoord + height) 
            && x >= (this.getHeight() - y)/2 && x <= (this.getHeight() + y) /2   ) {
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
        xCoord += deltaX;
        yCoord += deltaY;
    }

    public void moveTo(int newX, int newY){
        xCoord = newX;
        // or ???
        //x = newX + getHeight()/2;
        yCoord = newY;
    }

    /**
     * getX accessor method
     * @return x coordinate for this Delta
     */
    public int getX(){  return this.xCoord; }

    /**
     * getY accessor method
     * @return y coordinate for this Delta
     */
    public int getY(){ return this.yCoord; }

    /**
     * getRadius accessor method
     * @return radius coordinate for this Delta
     */
    public int getHeight() { return this.height; }

    /**
     * getColor accessor method
     * @return color Color of this Delta
     */
    public Color getColor(){  return color; }

    /**
     * getColor accessor method
     * @return color Color of this Delta
     */
    public void setColor(Color c){  color = c; }

    /**
     * Method that returns information about Delta in format x:<x>. y:<y>. Height:<r>.
     * @return    String that contains information about Circle method
     */
    public String toString(){
        return ("x: " + getX() + ". y: " + getY() + ". Height: " + getHeight() + ". ");   
    }
}
