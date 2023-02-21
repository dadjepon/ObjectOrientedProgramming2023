public class Thing {

    private static int createdSoFar = 0; // number of things created

    private String name;
    private String color;

    public Thing(String name, String color) {
        createdSoFar++;
        this.name = name;
        this.color = color;
    }

    /**
     * Get the name of the thing
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the thing
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the name of the thing
     * @return the color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * Set the name of the thing
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "(" + this.color + " " + this.name + ")";

    }

    /**
     * A demo static method
     * It prints "Hello!" to the console
     */
    public static void sayHello() {
        System.out.println("Hello!");
    }

    /**
     * Returns the number of things that have been created so far.
     * 
     * @return The number of things created so far.
     */
    public static int getNumberOfThings() {
        return Thing.createdSoFar;
    }
}
