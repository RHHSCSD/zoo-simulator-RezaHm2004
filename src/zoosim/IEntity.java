/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public interface IEntity extends IObject{
    // have a method to move the entity
    public void move();
    // have a method to make sound
    public void makeSound();
    // have a method to eat
    public void eat();
    // have a method to sleep
    public void sleep();
}
