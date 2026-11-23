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

            String input = view.getUserInput();

            // Split the command into parts
            String[] parts = input.trim().split("\\s+");

            String command = parts[0].toLowerCase();

            try {

                if (command.equals("brew")) {

                    int amount = Integer.parseInt(parts[1]);
                    model.brew(amount);

                    view.displayMessage("Coffee brewed successfully!");

                } else if (command.equals("pour")) {

                    int amount = Integer.parseInt(parts[1]);
                    model.pour(amount);

                    view.displayMessage("Coffee poured successfully!");

                } else if (command.equals("status")) {

                    view.displayMessage(
                            "Current coffee volume: " + model.getCurrentVolume()
                    );

                } else if (command.equals("exit")) {

                    running = false;
                    view.displayMessage("Goodbye!");

                } else {

                    view.displayMessage("Unknown command. Please try again.");

                }

            } catch (NumberFormatException e) {

                view.displayMessage("Please enter a valid number.");

            } catch (IllegalArgumentException | IllegalStateException e) {

                view.displayMessage("Error: " + e.getMessage());

            } catch (ArrayIndexOutOfBoundsException e) {

                view.displayMessage("Please enter an amount after brew or pour.");

            }
        }
    }
}
