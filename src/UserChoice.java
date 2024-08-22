import java.util.Scanner;

public class UserChoice {
   private final Scanner choice = new Scanner(System.in); // Scanner as a class member

   public void userChoice(PokemonStats selectedPokemon) {
      Menu menu = new Menu();
      boolean continueInput = true;

      while (continueInput) {
         menu.displayMenu(); // Display the menu
         System.out.print("Enter your choice: ");

         // Check if the next input is an integer
         if (choice.hasNextInt()) {
            int userChoice = choice.nextInt(); // Read the choice
            choice.nextLine(); // Consume the newline character

            switch (userChoice) {
               case 1 -> {
                  System.out.println("You chose to fight!");
                  // Implement fight logic here
               }
               case 2 -> {
                  System.out.println("Displaying selected Pokémon info:");
                  System.out.println("Name: " + selectedPokemon.getName());
                  System.out.println("Type: " + selectedPokemon.getType());
                  System.out.println("HP: " + selectedPokemon.getHP());
                  System.out.println("Attack: " + selectedPokemon.getAttack());
                  System.out.println("Defense: " + selectedPokemon.getDefense());
                  System.out.println("Speed: " + selectedPokemon.getSpeed());
                  System.out.println("Moves:");

                  for (int i = 0; i < selectedPokemon.getMoves().getSize(); i++) {
                     Move move = selectedPokemon.getMoves().getMove(i);
                     System.out.println(move.getName() + " (Power: " + move.getPower() + ")");
                  }
               }
               case 3 -> {
                  System.out.println("Exiting Program.");
                  continueInput = false; // Exit the loop
               }
               default -> System.out.println("Invalid choice. Please try again.");
            }
         } else {
            // Clear the invalid input
            System.out.println("Invalid input. Please enter an integer.");
            choice.nextLine(); // Consume the invalid input
         }
      }
   }

   public void closeScanner() {
      choice.close(); // Only call this when you're completely done with input
   }
}
