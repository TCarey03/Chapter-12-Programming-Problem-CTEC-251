public class CoffeePotController {

    private CoffeePotModel model;
    private CoffeePotView view;

    // Constructor
    public CoffeePotController(CoffeePotModel model, CoffeePotView view) {
        this.model = model;
        this.view = view;
    }

    // Start the application
    public void start() {

        boolean running = true;

        while (running) {

            view.showMenu();

            String input = view.getUserInput().trim();

            if (input.isEmpty()) {
                view.displayMessage("Please enter a command.");
                continue;
            }

            String[] parts = input.split("\\s+");

            String command = parts[0].toLowerCase();

            try {

                if (command.equals("brew")) {

                    if (parts.length != 2) {
                        view.displayMessage("Usage: brew <amount>");
                        continue;
                    }

                    int amount = Integer.parseInt(parts[1]);

                    model.brew(amount);

                    view.displayMessage("Coffee brewed successfully!");
                    showStatus();

                } else if (command.equals("pour")) {

                    if (parts.length != 2) {
                        view.displayMessage("Usage: pour <amount>");
                        continue;
                    }

                    int amount = Integer.parseInt(parts[1]);

                    model.pour(amount);

                    view.displayMessage("Coffee poured successfully!");
                    showStatus();

                } else if (command.equals("status")) {

                    showStatus();

                } else if (command.equals("exit")) {

                    running = false;
                    view.displayMessage("Goodbye!");

                } else {

                    view.displayMessage("Unknown command. Please try again.");

                }

            } catch (NumberFormatException e) {

                view.displayMessage("Invalid amount. Please enter a number.");

            } catch (IllegalArgumentException | IllegalStateException e) {

                view.displayMessage("Error: " + e.getMessage());

            }
        }
    }

    // Display the current coffee volume
    private void showStatus() {
        view.displayMessage(
                "Current coffee volume: " + model.getCurrentVolume()
        );
    }
}