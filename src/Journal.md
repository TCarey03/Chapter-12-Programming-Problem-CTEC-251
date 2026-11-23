## Phase 1: The Pot (The Model)

In this phase, I created the CoffeePotModel class. It keeps track of the current coffee volume and maximum capacity using private variables. I added methods to brew coffee, pour coffee, and check the current volume.

I also added validation to prevent negative amounts, overflowing the pot, or pouring more coffee than the pot contains.

I learned that the Model is responsible for managing the program's data and protecting its own state. This is important because it prevents invalid changes and keeps the program working correctly.

---------

## Phase 2: The Terminal Interface (The View)

In this phase, I created the CoffeePotView class. It displays the menu, accepts commands from the user using Scanner, and prints messages to the terminal.

I learned that separating the View from the rest of the program makes the code easier to organize. The View only handles input and output, while the Model manages the coffee pot's data. This makes the program easier to maintain and update.

---------

## Phase 3: The Command Center (The Controller)

In this phase, I created the CoffeePotController class. The Controller connects the Model and View and processes commands entered by the user.

When the user types a command, the View receives the input and passes it to the Controller. The Controller separates the command and amount, converts the amount into an integer, and decides which Model method to call. The Model then updates the coffee volume if the operation is valid.

I also added error handling so invalid commands and amounts display helpful messages instead of crashing the program.

I learned that the Controller manages the application's logic and connects the other two parts of the MVC pattern.

---------

## Phase 4: The Full Cycle (Integration)

In this phase, I connected and improved the Model, View, and Controller. I updated the Controller to automatically display the current coffee volume after successful brewing and pouring.

I also added better error handling for invalid commands, missing amounts, and non-numeric input. The exit command now properly stops the program.

The hardest part was connecting all three classes and making sure they worked together. Separating the Model, View, and Controller made error handling easier because each class has its own responsibility. The Model protects the coffee pot's data, the View displays messages, and the Controller handles commands and errors.