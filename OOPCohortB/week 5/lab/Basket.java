public class Basket {
    private Thing thing1;
    private Thing thing2;
    private Thing thing3;

    // Construct an empty basket.
    public Basket() {
        thing1 = thing2 = thing3 = null;

    }

    /**
    * Add something to the basket
    * @param something the thing to be added to the basket
    */
    public void addThing(Thing something) {

        if (thing1 == null) {
            thing1 = something;

        } else if (thing2 == null) {
            thing2 = something;

        } else if (thing3 == null) {
            thing3 = something;
        } else {
            System.out.println("Basket is full!");
        }
    }

    /**
     * Return the last thing added in the basket
     * 
     * @return The last item, or {@code NULL} if basket is empty.
     */
    public Thing getThing() {

        Thing item = null;

        if (thing3 != null) {
            item = thing3;
            thing3 = null;

        } else if (thing2 != null) {
            item = thing2;
            thing2 = null;

        } else if (thing1 != null) {
            item = thing1;
            thing1 = null;

        } else {
            System.out.println("Basket empty!");
        }

        return item;

        // Same solution, using ternary operators
        // return thing3 != null ? thing3
        //      : thing2 != null ? thing2
        //      : thing1 != null ? thing1
        //      : null;

    }

    @Override
    public String toString() {
        return "{"
                + (thing1 != null ? thing1.toString() : "<empty>") + ", "
                + (thing2 != null ? thing2.toString() : "<empty>") + ", "
                + (thing3 != null ? thing3.toString() : "<empty>")
                + "}";

    }

    public static void main(String[] args) {

        System.out.println(
            Thing.getNumberOfThings()
            + " item(s) have been created so far."
        );

        Thing t1 = new Thing("pen", "Red");
        Thing t2 = new Thing("book", "Blue");
        Thing t3 = new Thing("remote", "Grey");
        Thing t4 = new Thing("duster", "Violet");

        Basket myBasket = new Basket();

        myBasket.addThing(t1);
        myBasket.addThing(t2);

        System.out.println(
            Thing.getNumberOfThings()
            + " item(s) have been created so far.");

        System.out.println(myBasket);

        Thing.sayHello();
    }
}
