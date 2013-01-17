package edu.artem.hw2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
        return selectedShapeIndex == -1 ? null : shapes.get( selectedShapeIndex );
    }

    public void selectShape( int x, int y ) {
        ListIterator<Shape> listIterator = shapes.listIterator( shapes.size() - 1 );
        int currentIndex = -1;
        while ( listIterator.hasPrevious() ) {
            currentIndex = listIterator.previousIndex();
            if ( listIterator.previous().isOn( x, y ) ) {
                this.selectedShapeIndex = currentIndex;
                return;
            }
        }
    }

    public List<Shape> getAllShapes() {
        return new ArrayList<Shape>( shapes );
    }

    public void removeSelectedShape() {
        this.ensureShapeSelected();
        this.shapes.remove( selectedShapeIndex );
        this.selectedShapeIndex = -1;
    }

    public void setSelectedShapeColor( Color color ) {
        this.ensureShapeSelected();
        Shape selectedShape = getSelectedShape();
        selectedShape.setColor( color );
    }

    public void changeInX( int x ) {
        this.ensureShapeSelected();
        shapes.get( this.selectedShapeIndex ).shiftBy( x, 0 );
    }

    public void changeInY( int y ) {
        this.ensureShapeSelected();
        shapes.get( this.selectedShapeIndex ).shiftBy( 0, y );
    }

    private void ensureShapeSelected() {
        if ( this.getSelectedShape() == null ) {
            throw new IllegalStateException( "no shape is selected" );
        }
    }
}
