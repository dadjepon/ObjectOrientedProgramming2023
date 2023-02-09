
public class Marker {

    private String penColor; // The color of the marker
    private byte inkLevel; // ink level from 0 - 100
    private boolean isCapped; // Whether or not the marker is capped

    /**
    * This is a constructor. 
    * It is called when you create a new instance of the class.
    * This constructor takes no parameters 
    *      and sets the color to 'Unknown'.
    */
    public Marker() {
        this.penColor = "Unknown";
    }

    /** 
    * A constructor that takes a color as a parameter 
    * and sets the ink level to 100 
    * and the marker to capped. 
    */
    public Marker(String color) {
        penColor = color;
        this.isCapped = true;
        this.inkLevel = 100;
    }

    /**
    * A constructor that takes a color 
    * and ink level as parameters 
    * and sets the ink level to the given value 
    * and the marker to capped. 
    */
    public Marker(String color, byte inkLevel) {
        this.penColor = color;
        this.isCapped = true;
        this.inkLevel = inkLevel;
    }

    /**
     * This function returns the color of the pen.
     * 
     * @return The color of the pen.
     */
    public String getPenColor() {
        return this.penColor;
    }

    /**
     * This function sets the pen color to the value of the parameter
     * 
     * @param penColor The color of the pen.
     */
    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    /**
     * This function returns the ink level of the printer.
     * 
     * @return The inkLevel variable is being returned.
     */
    public byte getInkLevel() {
        return inkLevel;
    }

    /**
     * If the ink level is less than 0 or greater than 100,
     * print a message and return.
     * Otherwise, set the ink level.
     * 
     * @param inkLevel The amount of ink in the printer, as a percentage.
     */
    public void setInkLevel(byte inkLevel) {
        if (inkLevel < 0 || inkLevel > 100) {
            System.out.println("Set ink to " + inkLevel + " request rejected: Ink level invalid");
            return;
        }

        this.inkLevel = inkLevel;
    }

    /**
     * If the ink level is less than 50, set the ink level to 100. 
     * Otherwise, print a message saying that the ink level is too high.
     */
    public void refill() {
        if (this.inkLevel < 50) {
            this.inkLevel = 100;
        } else {
            System.out.println("Cannot refill: Ink level too high!");
        }
    }

    /**
     * Return true if the ink level is 0, otherwise return false.
     * 
     * @return Whether or not the pen has any ink
     */
    public boolean isFinished() {
        return this.inkLevel == 0;
    }

    /**
     * The toString() method returns a string representation of the object
     * 
     * @return: A string that describes the marker.
     */
    @Override
    public String toString() {
        return "Marker[ "
                + "Color: " + this.penColor + ", "
                + "Level: " + this.inkLevel + ", "
                + "Is capped: " + this.isCapped
                + " ]";

    }

}