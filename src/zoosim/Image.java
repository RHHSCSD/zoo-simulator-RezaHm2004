/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author rezahm
 */
public class Image {
    
    // declare varaibles for the size of the image
    private int width;
    private int height;
    
    /**
     * This is Image class that contains the needed sizes for the image
     * @param width (int)
     * @param height (int)
     */
    public Image(int width, int height){
        this.width = width;
        this.height = height;
    }

    /**
     * This method set a new width for the image
     * @param width (int)
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * This method set a new height for the image
     * @param height (int)
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * This method returns the width of the image
     * @return width (int)
     */
    public int getWidth() {
        return width;
    }

    /**
     * This method returns the height of the image
     * @return height (int)
     */
    public int getHeight() {
        return height;
    }
    
}
