public class CoffeePotModel {

    // Private fields to store the pot's volume and capacity
    private int currentVolume;
    private int maxCapacity;

    // Constructor
    public CoffeePotModel(int maxCapacity) {
        this.currentVolume = 0;
        this.maxCapacity = maxCapacity;
    }

    // Get the current coffee volume
    public int getCurrentVolume() {
        return currentVolume;
    }

    // Add coffee to the pot
    public void brew(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        if (currentVolume + amount > maxCapacity) {
            throw new IllegalStateException("Coffee pot capacity exceeded.");
        }

        currentVolume += amount;
    }

    // Remove coffee from the pot
    public void pour(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        if (currentVolume - amount < 0) {
            throw new IllegalStateException("Not enough coffee in the pot.");
        }

        currentVolume -= amount;
    }
}
