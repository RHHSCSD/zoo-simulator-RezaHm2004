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

    private Animal[] animalsLst = new Animal[10];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public void addAnim(Animal anim){
        for (int i = 0; i < 10; i++){
            if (animalsLst[i] == null){
                animalsLst[i] = anim;
                break;
            }
        }
    }
    
    public void displayZooStatistic(){
        for (int i = 0; i < 10; i++){
            Animal anim = animalsLst[i];
            if (anim != null){
                System.out.println("Animal-" + anim.getName()+":");
                System.out.println("Id: "+ anim.getId());
                System.out.println("Age: "+ anim.getAge());
                System.out.println("Fatique: "+ anim.getFatigue());
                System.out.println("Hunger: "+ anim.getHunger());
                System.out.println("Direction: "+ anim.getDirection());
                System.out.println("Position (x,y): "+ anim.getPositionX()+" , "+anim.getPositionY());
                System.out.println("Sex: "+ anim.getSex());
                System.out.println("Width: "+ anim.getWidthSize());
                System.out.println("Height: "+ anim.getHeightSize());
                System.out.println("Speed (x,y): "+ anim.getxSpeed()+" , "+anim.getySpeed());
                System.out.println("Sound: "+ anim.getSound());
            }
        }
    }
    
    public void feedHungryAnimals(){
        for (int i = 0; i < 10; i++){
            Animal anim = animalsLst[i];
            if (anim.getHunger() > 0){
               anim.eat(); 
            }
        }
    }
    
    public void sleepTiredAnimals(){
        for (int i = 0; i < 10; i++){
            Animal anim = animalsLst[i];
            if (anim.getFatigue() > 0){
               anim.sleep(); 
            }
        }
    }
    
    public void moveAnim(Animal anim){
        anim.move();
    }
    
    public void moveAnim(Animal anim, int xSpeed, int ySpeed){
        anim.setxSpeed(xSpeed);
        anim.setySpeed(ySpeed);
        anim.move();
    }
    
    public void moveAnim(Animal anim, int direction){
        anim.turn(direction);
        anim.move();
    }
    
    public void placeAnim(Animal anim, int posX, int posY){
        anim.setPositionX(posX);
        anim.setPositionY(posY);
    }
}
