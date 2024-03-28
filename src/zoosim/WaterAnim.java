/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class WaterAnim extends Animal implements ISwimmable {
    
    // declare initial variables for the animal
    private boolean canBreathe;
    private boolean inWater;

    /**
     * This is BirdAnim class that contains all of the data and behaviors of the bird-like animals
     * @param id (int)
     * @param name (String)
     * @param species (String)
     * @param sex (char)
     * @param age (int)
     * @param positionX (int)
     * @param positionY (int)
     * @param widthSize (int)
     * @param heightSize (int)
     * @param xSpeed (int)
     * @param ySpeed (int)
     * @param direction (int)
     * @param hunger (int)
     * @param fatigue (int)
     * @param image (Image)
     * @param sound (String)
     * @param canBreathe (boolean)
     * @param inWater (boolean)
     */
    public WaterAnim(int id, String name, String species, char sex, int age, int positionX, int positionY, int widthSize, int heightSize, int xSpeed, int ySpeed, int direction, int hunger, int fatigue, Image image, String sound, boolean canBreathe, boolean inWater) {
        super(id, name, species, sex, age, positionX, positionY, widthSize, heightSize, xSpeed, ySpeed, direction, hunger, fatigue, image, sound);
        this.canBreathe = canBreathe;
        this.inWater = inWater;
    }
    
    /**
     * This method returns if the animal can breathe outside of the water
     * @return 
     */
    public boolean canSurface(){
        return canBreathe;
    }
    
    /**
     * This method is to make the animal surface
     */
    public void surface(){
        if (inWater == true){
            if (canBreathe == true){
                inWater = false;
                System.out.println("The animal is bearthing air outside of water.");
            }
        }
    }
    
    /**
     * This method is to make the animal dive
     */
    public void dive(){
        if (inWater == false){
            if (canBreathe == true){
                inWater= true;
                System.out.println("The animal is in water now");
            }
        }
    }
    
    /**
     * This method is to check if the animal is swimming
     */
    public boolean isSwimming(){
        return inWater;
    }
}
