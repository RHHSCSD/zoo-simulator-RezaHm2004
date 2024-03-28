/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class OtherZooObject implements IObject{

    // declare initial variables for the object
    private String type;
    private int positionX;
    private int positionY;
    private int width;
    private int height;
    private int direction;
    
    /**
     * This OtherZooObject class that contains all of the data and behaviors of other zoo object 
     * @param type (String)
     * @param positionX (int)
     * @param positionY (int)
     * @param width (int)
     * @param height (int)
     * @param direction (int)
     */
    public OtherZooObject(String type, int positionX, int positionY, int width, int height, int direction) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
        this.direction = direction;
    }
    
    /**
     * This is a method to return all of details of the object
     * @return details: String
     */
    public String toString(){
        String details = "Object-" + type+":\n"
                +"Postion (x,y): "+ positionX+ " , " +positionY+ "\n"
                +"Width: "+ width + "\n"
                +"Height: "+ height + "\n"
                +"Direction: "+ direction + "\n";
        return details;
        
    }
    
    /**
     * This method turns the object
     * @param degree (int)
     */
    public void turn(int degree){
        direction += degree;
    }
    
    /** 
     * This method place the object
     * @param x (int)
     * @param y (int)
     */
    public void place(int x, int y){
        positionX = x;
        positionY = y;
    }
    
    /**
     * This method sets a new x-axis position for the object
     * @param positionX  (int)
     */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    /**
     * This method sets a new y-axis position for the object
     * @param positionY (int)
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     * This method sets a new direction for the object
     * @param direction (int)
     */
    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    /**
     * This method returns the type of the object 
     * @return type (String)
     */
    public String getType() {
        return type;
    }

    /**
     * This method returns the x-axis position of the object
     * @return positionX (int)
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * This method returns the y-axis position of the object
     * @return positionY (int)
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * This method returns the width of the object
     * @return width (int)
     */
    public int getWidth() {
        return width;
    }

    /**
     * This method returns the height of the object
     * @return positionX (int) 
     */
    public int getHeight() {
        return height;
    }

    /**
     * This method returns the direction of the object
     * @return direction (int)
     */
    public int getDirection() {
        return direction;
    }
    
}
