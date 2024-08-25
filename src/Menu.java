import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Move;
import java.util.Scanner;

public class Menu {

   // Add all the menu actions in this list
   String[] actions = new String[] { "Fight", "Display Pokemon Info", "Exit" };

   private final Scanner scanner = new Scanner(System.in);

   public void displayMenu() {
      System.out.println("\nDisplaying available actions in the menu:");
      for (int i = 0; i < actions.length; i++) {
         System.out.println((i + 1) + ". " + actions[i]);
      }
   }

   public int getChoice() {
      return scanner.nextInt();
   }

   public void menuActions(PokemonStats selectedPokemon, PokemonStats computerPokemon) {

      displayMenu();

      System.out.print("Select your action (select index): ");

      switch (getChoice()) {
         case 1 -> {
            System.out.println("Commencing fight.");
            Fight fight = new Fight(selectedPokemon, computerPokemon);
            fight.fight();
         }
         case 2 -> {
            System.out.println("\nYou chose to display Pokémon info\n");
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
               System.out.println((i + 1) + ": " + move.getName() + " (Power: " + move.getPower() + ")");
            }
            menuActions(selectedPokemon, computerPokemon);

         }
         case 3 -> {
            System.out.println("Exiting the game.");

         }
         default -> {
            System.out.println("Invalid choice! Try again.");
            menuActions(selectedPokemon, computerPokemon);
         }
      }
   }
}
