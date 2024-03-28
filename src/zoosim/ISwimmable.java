/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public interface ISwimmable {
    
    // have a method to say if the animal has the ability to surface
    public boolean canSurface();
    
    // have a method to make the animal dive 
    public void dive();
    
    // have a method to make the animal surface 
    public void surface();
    
    // have a method to say if the animal is swimming
    public boolean isSwimming();
}
