package edu.artem.hw2;

import java.awt.Color;
/**
 * Write a description of interface Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Shape
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    
    boolean isOn(int x, int y);
    boolean isSelected();
    void setSelected(boolean b);
    void shiftBy(int deltaX, int deltaY);
    void moveTo(int newX, int newY);
    void setColor(Color c);
    Color getColor();
    String toString();
}
