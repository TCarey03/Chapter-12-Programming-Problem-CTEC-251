import java.util.Scanner;

public class CoffeePotView {

    private Scanner scanner;

    // Constructor
    public CoffeePotView() {
        scanner = new Scanner(System.in);
    }

    // Display the available commands
    public void showMenu() {
        System.out.println("\n===== Coffee Pot Menu =====");
        System.out.println("brew <amount> - Add coffee");
        System.out.println("pour <amount> - Remove coffee");
        System.out.println("status - Check coffee volume");
        System.out.println("exit - Quit the program");
        System.out.print("Enter command: ");
    }

    // Get input from the user
    public String getUserInput() {
        return scanner.nextLine();
    }

    // Display a message
    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}
