/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class OtherZooObjects implements IObject{

    private String type;
    private int positionX;
    private int positionY;
    private int width;
    private int height;
    private int direction;
    
    public OtherZooObjects(String type, int positionX, int positionY, int width, int height, int direction) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
        this.direction = direction;
    }
    
    // Create method to turn the object
    public void turn(int degree){
        
    }
    // Creats method to place the object
    public void place(int x, int y){
        
    }
    
}
