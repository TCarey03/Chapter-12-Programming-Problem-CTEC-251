## Phase 1: The Pot (The Model)

In this phase, I created the CoffeePotModel class. It keeps track of the current coffee volume and maximum capacity using private variables. I added methods to brew coffee, pour coffee, and check the current volume.

I also added validation to prevent negative amounts, overflowing the pot, or pouring more coffee than the pot contains.

I learned that the Model is responsible for managing the program's data and protecting its own state. This is important because it prevents invalid changes and keeps the program working correctly.

---------

## Phase 2: The Terminal Interface (The View)

In this phase, I created the CoffeePotView class. It displays the menu, accepts commands from the user using Scanner, and prints messages to the terminal.

I learned that separating the View from the rest of the program makes the code easier to organize. The View only handles input and output, while the Model manages the coffee pot's data. This makes the program easier to maintain and update.