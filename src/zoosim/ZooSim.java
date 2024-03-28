/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class ZooSim {

    private static Animal[] animalsLst = new Animal[10];
    private static OtherZooObject[] otherObjects = new OtherZooObject[10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Answer to thinking question:
        //      We can create three interfaces for Carnivors, herbivors, and omnivors and implememt all of these new interfaces into LandAnim, BirdAnim, WaterAnim.
        //      Then by adding a new boolean field to these animals we can limit their behavior based on their type of food.
        //      After that we can add specific methods to these animals based on their food type for example a carnivor animal eats a live animal and a herbivor animal eats an green object.
        //      We can also add when an animal is eaten it is dead and will be removed from the listof all animals.
        
        
        // testing
        Image lionImage = new Image(20, 10);
        Image seagullImage = new Image(5, 5);
        Image whaleImage = new Image(50, 5);
        
        Animal lion = new LandAnim(1, "Lion King", "Lion", 'M', 10, 10, 10, 20, 10, 5, 5, 0, 0, 0, lionImage, "Roar!!");
        BirdAnim bird = new BirdAnim(2, "Captain Seagul", "Seagull", 'F', 5, 15, 15, 5, 5, 1, 1, 0, 0, 0, seagullImage, "Sqwak!!", true, false);
        WaterAnim fish = new WaterAnim(2, "Great Whale", "Whale", 'M', 15, 20, 20, 50, 5, 10, 10, 0, 0, 0, whaleImage, "Mmm!!!", true, true);
        
        addAnim(lion);
        addAnim(bird);
        addAnim(fish);
        
        displayZooStatistic();
        
        moveAnim(lion);
        
        moveAnim(bird, 50, 50);
        
        moveAnim(fish, 90);
        
        displayZooStatistic();
        
        moveAnim(lion);
        
        moveAnim(bird, 50, 50);
        
        moveAnim(fish, 90);
        
        feedHungryAnimals();
        
        sleepTiredAnimals();
        
        displayZooStatistic();
        
        lion.makeSound();
        bird.makeSound();
        fish.makeSound();
        
        lion.place(100, 109);
        bird.place(50, 59);
        fish.place(76, 98);
        
        displayZooStatistic();
        
        bird.fly();
        System.out.println(bird.isFlying()); 
        bird.land();
        System.out.println(bird.isFlying());
        
        fish.surface();
        System.out.println(fish.isSwimming()); 
        fish.dive();
        System.out.println(fish.isSwimming());
        
        OtherZooObject tree = new OtherZooObject("Tree", 5, 5, 10, 10, 0);
        OtherZooObject rock = new OtherZooObject("Rock", 10, 10, 15, 15, 0);
        OtherZooObject apple = new OtherZooObject("Apple", 2, 2, 1, 1, 0);
        
        addObject(tree);
        addObject(rock);
        addObject(apple);
        
        displayZooStatistic();
        
        tree.place(100, 100);
        apple.turn(180);
        
        displayZooStatistic();
        
    }
    
    /**
     * This is a method to add to animal list
     * @param anim: Animal
     */
    public static void addAnim(Animal anim){
        for (int i = 0; i < 10; i++){
            if (animalsLst[i] == null){
                animalsLst[i] = anim;
                break;
            }
        }
    }
    
    /**
     * This is a method to add to object list
     * @param obj: OtherZooObject
     */
    public static void addObject(OtherZooObject obj){
        for (int i = 0; i < 10; i++){
            if (otherObjects[i] == null){
                otherObjects[i] = obj;
                break;
            }
        }
    }
    
    /**
     * This is a method to display all of the details of all of the objects
     */
    public static void displayZooStatistic(){
        for (int i = 0; i < 10; i++){
            Animal anim = animalsLst[i];
            if (anim != null){
                System.out.println(anim);
            }
        }
        for (int j = 0; j < 10; j++){
            OtherZooObject obj = otherObjects[j];
            if (obj != null){
                System.out.println(obj);
            }
        }
    }
    
    /**
     * This is a method to feed hungry animals to restore their hunger
     */
    public static void feedHungryAnimals(){
        for (int i = 0; i < 10; i++){
            Animal anim = animalsLst[i];
            if (anim != null && anim.getHunger() > 0){
               anim.eat(); 
            }
        }
    }
    
    /**
     * This is a method to make animals sleep to restore their fatigue
     */
    public static void sleepTiredAnimals(){
        for (int i = 0; i < 10; i++){
            Animal anim = animalsLst[i];
            if (anim != null && anim.getFatigue() > 0){
               anim.sleep(); 
            }
        }
    }
    
    /**
     * This a method to move the animal based on its default speed
     * @param anim: Animal
     */
    public static void moveAnim(Animal anim){
        anim.move();
    }
    
    /**
     * This is a method to move the animal based on user given speed
     * @param anim: Animal
     * @param xSpeed: int
     * @param ySpeed: int
     */
    public static void moveAnim(Animal anim, int xSpeed, int ySpeed){
        anim.setxSpeed(xSpeed);
        anim.setySpeed(ySpeed);
        anim.move();
    }
    
    /**
     * This a method to move the animal based on a new direction
     * @param anim: Animal
     * @param direction: int
     */
    public static void moveAnim(Animal anim, int direction){
        anim.turn(direction);
        anim.move();
    }
    
    /**
     * This a method to place an animal by a given x and y value
     * @param anim: Animal
     * @param posX: int
     * @param posY: int
     */
    public static void placeAnim(Animal anim, int posX, int posY){
        anim.setPositionX(posX);
        anim.setPositionY(posY);
    }
}
