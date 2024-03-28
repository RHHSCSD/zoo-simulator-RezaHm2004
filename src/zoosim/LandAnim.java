/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class LandAnim extends Animal{

    /**
     * This is Land class that contains all of the data and behaviors of the land animals
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
     */
    public LandAnim(int id, String name, String species, char sex, int age, int positionX, int positionY, int widthSize, int heightSize, int xSpeed, int ySpeed, int direction, int hunger, int fatigue, Image image, String sound) {
        super(id, name, species, sex, age, positionX, positionY, widthSize, heightSize, xSpeed, ySpeed, direction, hunger, fatigue, image, sound);
    }
    
}
