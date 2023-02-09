public class TestMarker {

    public static void testMarkerPrinting() {

        Marker blackMarker = new Marker();
        Marker redMarker = new Marker("red");
        Marker blueMarker = new Marker("blue", (byte) 25);

        System.out.println("\nRunning testMarkerPrinting()...");
        System.out.println("Black marker: " + blackMarker);
        System.out.println("Blue marker: " + blueMarker);
        System.out.println("Red marker: " + redMarker);
        System.out.println("...done\n");
        
    }
    
    public static void testMarkerLevel() {
        
        Marker testMarker = new Marker("Purple", (byte) 23);
        
        System.out.println("\nRunning testMarkerLevel()...");
        
        // Checking that the ink level of the marker is 23.
        System.out.println("Marker level is 23 initially: "
        + (testMarker.getInkLevel() == 23)); // should be true
        
        // Attempt to set ink level to an illegal value
        testMarker.setInkLevel((byte) 120); // we should get a message
        
        // Checking that the ink level of the marker is not 120.
        System.out.println("Marker level is changed to 120: "
        + (testMarker.getInkLevel() == 120)); // should be false
        
        // Checking that the ink level of the marker is 23.
        System.out.println("Marker level is still 23: "
        + (testMarker.getInkLevel() == 23)); // should be true
        
        System.out.println("...done\n");
        
    }
    
    public static void main(String[] args) {
        
        // run test to print markers
        TestMarker.testMarkerPrinting();

        TestMarker.testMarkerLevel();
    }

}
