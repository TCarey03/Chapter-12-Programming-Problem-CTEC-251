public class Main {

    public static void main(String[] args) {

        // Create the Model
        CoffeePotModel model = new CoffeePotModel(20);

        // Create the View
        CoffeePotView view = new CoffeePotView();

        // Create the Controller
        CoffeePotController controller =
                new CoffeePotController(model, view);

        // Start the application
        controller.start();
    }
}
