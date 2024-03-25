/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class Animal implements IEntity{
    
    // declare initial variables for the animal
    private int id;
    private String name;
    private String species;
    private char sex;
    private int age;
    private int positionX;
    private int positionY;
    private int widthSize;
    private int heightSize;
    private int xSpeed;
    private int ySpeed;
    private int direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound;
    
    /**
     * This is Animal Class that contains data and behaviors for an animal.
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
     * @param sound  (String)
     */
    public Animal(int id, String name, String species, char sex, int age, int positionX, int positionY, int widthSize, int heightSize, int xSpeed, int ySpeed, int direction, int hunger, int fatigue, Image image, String sound) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.positionX = positionX;
        this.positionY = positionY;
        this.widthSize = widthSize;
        this.heightSize = heightSize;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.direction = direction;
        this.hunger = hunger;
        this.fatigue = fatigue;
        this.image = image;
        this.sound = sound;
    }
    
    /**
     * This method make sound for the animal
     */
    public void makeSound(){
        // display sound
        System.out.println(sound);
    }
    
    /**
     * This method move the animal
     */
    public void move(){
        System.out.println(name + " moved " + xSpeed + " horizontally!");
        System.out.println(name + " moved " + ySpeed + " vertically!");
    }
    
    /**
     * make the animal eat to restore the hunger
     */
    public void eat(){
        // restore hunger
        hunger = 0;
        // display hunger value
        System.out.println("Hungry:  " + hunger);
    }
    
    /**
     * make the animal sleep to restore fatigue
     */
    public void sleep(){
        // restore fatigue
        fatigue = 0;
        // display fatigue value
        System.out.println("Fatigue: " + fatigue);
    }
    
    /**
     * make the animal to turn
     * @param direction (int)
     */
    public void turn(int direction){
        this.direction = direction;
    }
    
    /**
     * place the animal in a specified position
     * @param x: x-axis position (int)
     * @param y: y-axis position (int)
     */
    public void place(int x, int y){
        positionX = x;
        positionY = y;
    }
}
