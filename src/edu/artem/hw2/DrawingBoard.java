package edu.artem.hw2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class DrawingBoard {

    private List<Shape> shapes;
    private int selectedShapeIndex = -1;
    
    public DrawingBoard() {
        shapes = new ArrayList<Shape>();
    }
    
    public void addShape( Shape shape ) {
        shapes.add( shape );
        selectedShapeIndex = shapes.size() - 1;
    }
    
    public Shape getSelectedShape() {
        return selectedShapeIndex == -1  ? null : shapes.get( selectedShapeIndex );
    }
    
    public void selectShape( int x, int y ) {
        
    }
    
    public List<Shape> getAllShapes() {
        return new ArrayList<Shape>(shapes);
    }
    
    public void removeSelectedShape() {
        if ( this.getSelectedShape() == null ) { 
            throw new IllegalStateException( "no shape is selected" );
        }
        
    }
    
    public void setSelectedShapeColor( Color color ) {
        
    }
    
    public void changeInX( int x ) {
        
    }
    
    public void changeInY( int y ) {
        
    }
}
