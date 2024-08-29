import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Move;
import java.util.Scanner;

public class Menu {

    // List of menu actions
    String[] actions = new String[]{"Fight", "Display Pokémon Info", "Exit"};

    private final Scanner scanner = new Scanner(System.in);

    // Display available menu actions
    public void displayMenu() {
        System.out.println("\nDisplaying available actions in the menu:");
        for (int i = 0; i < actions.length; i++) {
            System.out.println((i + 1) + ". " + actions[i]);
        }
    }

    // Get user's menu choice
    public int getChoice() {
        return scanner.nextInt();
    }

    // Perform actions based on user's choice
    public void menuActions(PlayerProfile playerProfile, PokemonStats computerPokemon) {

        displayMenu();

        System.out.print("Select your action (select index): ");

        switch (getChoice()) {
            case 1 -> {
                System.out.println("Commencing fight.");
                Fight fight = new Fight(playerProfile, computerPokemon);
                fight.fight();
            }
            case 2 -> {
                System.out.println("\nYou chose to display Pokémon info\n");

                // Assuming we display info for the first Pokémon in the player's team
                PokemonStats selectedPokemon = playerProfile.getActivePokemon();
                
                if (selectedPokemon != null) {
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
                } else {
                    System.out.println("No Pokémon available in the team.");
                }
                // Display the menu again after showing Pokémon info
                menuActions(playerProfile, computerPokemon);

            }
            case 3 -> {
                System.out.println("Exiting the game.");
                // Handle any cleanup if necessary
            }
            default -> {
                System.out.println("Invalid choice! Try again.");
                menuActions(playerProfile, computerPokemon);
            }
        }
    }
}
