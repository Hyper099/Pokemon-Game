import java.util.Random;
import java.util.Scanner;

import PokemonData.PokemonStats;
import PokemonMoves.Move;

public class Fight {
    private int damage = 0; // Variable to hold the damage value for attacks
    private final PokemonStats selectedPokemon; // The player's selected Pokémon
    private final PokemonStats computerPokemon; // The computer's Pokémon

    // Constructor to initialize the selected and computer Pokémon
    public Fight(PokemonStats selectedPokemon, PokemonStats computerPokemon) {
        this.selectedPokemon = selectedPokemon;
        this.computerPokemon = computerPokemon;
    }

    // Method to fight
    public void fight() {

        Scanner scanMove = new Scanner(System.in); // Scanner to read user input for moves
        Random compMove = new Random(); // Random object for generating random moves for the computer

        // Storing HP of player Pokémon and computer Pokémon
        int playerPokemonHP = selectedPokemon.getHP();
        int computerPokemonHP = computerPokemon.getHP();

        int playerPokemonAttack = selectedPokemon.getAttack();
        int computerPokemonAttack = computerPokemon.getAttack();

        int userMovePower; // Variable to hold the power of the user's move
        int computerMovePower; // Variable to hold the power of the computer's move

        System.out.println("\n" + selectedPokemon.getName() + " V/S " + computerPokemon.getName() + "\n");

        boolean isPlaying = true;
        while (isPlaying) {
            System.out.println("Select a move to attack: ");

            for (int i = 0; i < selectedPokemon.getMoves().getSize(); i++) {
                Move move = selectedPokemon.getMoves().getMove(i);
                System.out.print((i + 1) + ". " + move.getName() + " ");
            }

            System.out.println();
            int selectedMove = scanMove.nextInt();
            selectedMove -= 1;

            // Determine the power of the selected move based on user input
            switch (selectedMove) {
                case 0 -> userMovePower = selectedPokemon.getMoves().getMove(0).getPower();
                case 1 -> userMovePower = selectedPokemon.getMoves().getMove(1).getPower();
                case 2 -> userMovePower = selectedPokemon.getMoves().getMove(2).getPower();
                case 3 -> userMovePower = selectedPokemon.getMoves().getMove(3).getPower();
                default -> {
                    System.out.println("Invalid choice");
                    continue;
                }
            }
            System.out.println(userMovePower);

            // Additional fight logic (like attacking and checking HP) would go here

            damage = (userMovePower + playerPokemonAttack) / 2; // yeh logic google pe dekha bohot bada logic hai iska.

            computerPokemonHP -= damage;
            System.out.println(selectedPokemon.getName() + " attacks " + computerPokemon.getName() + " with "
                    + selectedPokemon.getMoves().getMove(selectedMove).getName() + " for " + damage
                    + " damage!");

            if (computerPokemonHP <= 0) {
                System.out.println(computerPokemon.getName() + "'s remaining HP: " + 0);

            } else {
                System.out.println(computerPokemon.getName() + "'s remaining HP: " + computerPokemonHP);

            }

            if (computerPokemonHP <= 0) {
                System.out.println(computerPokemon.getName() + " has fainted! You win!");
                isPlaying = false;
                // break;
            }
        }
        scanMove.close();
    }
}
