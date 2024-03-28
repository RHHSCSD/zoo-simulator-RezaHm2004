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
     * This is a method to return all of details of the animal
     * @return details: String
     */
    public String toString(){
        String details = "Animal-" + name+":\n"
                +"Id: "+ id + "\n" 
                +"Species: "+ species + "\n"
                +"Sex: "+ sex + "\n"
                +"age: "+ age + "\n"
                +"Postion (x,y): "+ positionX+ " , " +positionY+ "\n"
                +"Width: "+ widthSize + "\n"
                +"Height: "+ heightSize + "\n"
                +"Speed (x,y): "+ xSpeed + " , " +ySpeed+ "\n"
                +"Direction: "+ direction + "\n"
                +"Hunger: "+ hunger + "\n"
                +"Fatigue: "+ fatigue + "\n"
                +"Sound: "+ sound + "\n";
        return details;
        
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
        positionX += xSpeed;
        positionY += ySpeed;
        fatigue++;
        hunger++;
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
        System.out.println(name + " ate enough!");
        System.out.println("Hungry:  " + hunger);
    }
    
    /**
     * make the animal sleep to restore fatigue
     */
    public void sleep(){
        // restore fatigue
        fatigue = 0;
        // display fatigue value
        System.out.println(name + " slept enough!");
        System.out.println("Fatigue: " + fatigue);
    }
    
    /**
     * make the animal to turn
     * @param degrees (int)
     */
    public void turn(int degrees){
        this.direction += degrees;
        if (degrees == 90){
            int newXSpeed = xSpeed;
            int newYSpeed = -ySpeed;
            ySpeed = newXSpeed;
            xSpeed = newYSpeed;   
        } else if (degrees == -90){
            int newXSpeed = -xSpeed;
            int newYSpeed = ySpeed;
            ySpeed = newXSpeed;
            xSpeed = newYSpeed; 
        } else if (degrees == 180){
            int newXSpeed = -xSpeed;
            int newYSpeed = -ySpeed;
            ySpeed = newXSpeed;
            xSpeed = newYSpeed; 
        }
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
    
    /**
     * This method returns the id of the animal
     * @return id (int)
     */
    public int getId() {
        return id;
    }

    /**
     * This method returns the name of the animal
     * @return name (String) 
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the specie of the animal
     * @return species (String) 
     */
    public String getSpecies() {
        return species;
    }

    /**
     * This method returns the sex of the animal
     * @return sex (char)
     */
    public char getSex() {
        return sex;
    }

    /**
     * This method returns the age of the animal
     * @return age (int)
     */
    public int getAge() {
        return age;
    }

    /**
     * This method returns the x-axis position of the animal
     * @return positionX (int)
     */
    public int getPositionX() {
        return positionX;
    }

    /**
     * This method returns the y-axis position of the animal
     * @return positionY (int)
     */
    public int getPositionY() {
        return positionY;
    }

    /**
     * This method returns the width of the animal
     * @return width (int)
     */
    public int getWidthSize() {
        return widthSize;
    }

    /**
     * This method returns the height of the animal
     * @return height (int)
     */
    public int getHeightSize() {
        return heightSize;
    }

    /**
     * This method returns the x-axis speed of the animal
     * @return xSpeed (int)
     */
    public int getxSpeed() {
        return xSpeed;
    }

    /**
     * This method returns the y-axis speed of the animal
     * @return ySpeed (int) 
     */
    public int getySpeed() {
        return ySpeed;
    }

    /**
     * This method returns the direction of the animal
     * @return direction (int)
     */
    public int getDirection() {
        return direction;
    }

    /**
     * This method returns the hunger value of the animal
     * @return hunger (int) 
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * This method returns the fatigue value of the animal
     * @return fatigue (int) 
     */
    public int getFatigue() {
        return fatigue;
    }

    /**
     * This method returns the image of the animal
     * @return image (Image)
     */
    public Image getImage() {
        return image;
    }

    /**
     * This method returns the sound of the animal
     * @return sound (String)
     */
    public String getSound() {
        return sound;
    }
    
    /**
     * This method sets a new age for the animal
     * @param age (int)
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method sets a new x-axis position for the animal
     * @param positionX (int) 
     */
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    
    /**
     * This method sets a new y-axis position for the animal
     * @param positionY (int) 
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     * This method sets a new x-axis speed for the animal
     * @param xSpeed (int)
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * This method sets a new y-axis position for the animal
     * @param ySpeed (int)
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * This method sets a new direction for the animal
     * @param direction (int)
     */
    public void setDirection(int direction) {
        this.direction = direction;
    }

    /**
     * This method sets a new hunger value for the animal
     * @param hunger (int)
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * This method sets a new fatigue value for the animal
     * @param fatigue (int)
     */
    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }
    
}
