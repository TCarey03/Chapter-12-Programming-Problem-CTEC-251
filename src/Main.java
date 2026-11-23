public class Main {
    public static void main(String[] args) {

        CoffeePotModel pot = new CoffeePotModel(20);

        // Test brewing coffee
        pot.brew(10);
        System.out.println("After brewing: " + pot.getCurrentVolume());

        // Test pouring coffee
        pot.pour(5);
        System.out.println("After pouring: " + pot.getCurrentVolume());

        // Test exceeding capacity
        try {
            pot.brew(20);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test pouring too much coffee
        try {
            pot.pour(20);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test negative amount
        try {
            pot.brew(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
