public class Main {
    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(45, 90, 1000);
        Boxer anotherBoxer = new Boxer(55, 87, 1900);
        if (ourBoxer.fight(anotherBoxer)) {
            System.out.println("Our Boxer won");
        } else {
            System.out.println("Our Boxer lose");
        }
        if (anotherBoxer.fight(ourBoxer)) {
            System.out.println("Another Boxer won");
        } else {
            System.out.println("Another Boxer lose");
        }

        /**
         * The code below related for class Vehicles.
         */
//        Vehicles car = new Car("BMW","4x4",220,"E90", 240);
//        ((Car )car).increaseSpeed(5);
//        ((Car )car).increaseSpeed(5);
//        ((Car )car).increaseSpeed(5);
//        ((Car )car).increaseSpeed(5);
//        ((Car )car).increaseSpeed(5);
//        ((Car )car).increaseSpeed(5);
    }
}
