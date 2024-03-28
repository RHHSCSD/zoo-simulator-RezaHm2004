/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class BirdAnim extends Animal implements IFlyable{
    
    // declare initial variables for the animal
    private boolean canFly;
    private boolean inSky;

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
     * @param canFly (boolean)
     * @param inSky (boolean)
     */
    public BirdAnim(int id, String name, String species, char sex, int age, int positionX, int positionY, int widthSize, int heightSize, int xSpeed, int ySpeed, int direction, int hunger, int fatigue, Image image, String sound, boolean canFly, boolean inSky) {
        super(id, name, species, sex, age, positionX, positionY, widthSize, heightSize, xSpeed, ySpeed, direction, hunger, fatigue, image, sound);
        this.canFly = canFly;
        this.inSky = inSky;
    }
    
    /**
     * This method is to make the bird fly
     */
    public void fly(){
        if (inSky == false){
            if (canFly == true){
                inSky = true;
                System.out.println("The bird took off.");
            }
        }
    }
    
    /**
     * This method is to make the bird land
     */
    public void land(){
        if (inSky == true){
            if (canFly == true){
                inSky = false;
                System.out.println("The bird landed.");
            }
        }
    }
    
    /**
     * This method is to check if the bird is flying
     * @return inSky (boolean)
     */
    public boolean isFlying(){
        return inSky;
    }
    
}
