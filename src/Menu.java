import java.util.Scanner;

import PokemonData.PokemonStats;
import PokemonMoves.Move;

public class Menu {

   // Add all the menu actions in this list
   String[] actions = new String[] { "Fight", "Display Pokemon Info", "Exit" };

   private Scanner scanner = new Scanner(System.in);

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

      boolean continuePlaying = true;
      while (continuePlaying) {

         displayMenu();

         System.out.print("Select your action (select index): ");

         switch (getChoice()) {
            case 1 -> {
               System.out.println("Commencing fight.");
               Fight fight = new Fight(selectedPokemon, computerPokemon);
               fight.performAction();
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
            }
            case 3 -> {
               System.out.println("Exiting the game.");
               scanner.close();
               continuePlaying = false;
            }
            default -> System.out.println("Invalid choice! Try again.");
         }
      }
   }
}
