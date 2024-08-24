import java.util.Random;
import java.util.Scanner;

import PokemonData.PokemonStats;
import PokemonMoves.Move;

public class Fight {
    private final PokemonStats selectedPokemon; // The player's selected Pokémon
    private final PokemonStats computerPokemon; // The computer's Pokémon
    private final Scanner scanMove = new Scanner(System.in); // Scanner to read user input for moves
    private final Random compMove = new Random(); // Random object for generating random moves for the computer

    // Constructor to initialize the selected and computer Pokémon
    public Fight(PokemonStats selectedPokemon, PokemonStats computerPokemon) {
        this.selectedPokemon = selectedPokemon;
        this.computerPokemon = computerPokemon;
    }

    // Method to fight
    public void fight() {
        int playerPokemonHP = selectedPokemon.getHP();
        int computerPokemonHP = computerPokemon.getHP();

        System.out.println("\n" + selectedPokemon.getName() + " V/S " + computerPokemon.getName() + "\n");

        while (true) {
            int userMovePower = getUserMovePower();
            int computerMoveIndex = compMove.nextInt(computerPokemon.getMoves().getSize());
            int computerMovePower = computerPokemon.getMoves().getMove(computerMoveIndex).getPower();

            if (selectedPokemon.getSpeed() > computerPokemon.getSpeed()) {
                computerPokemonHP = executeTurn(selectedPokemon, computerPokemon, userMovePower, computerPokemonHP);
                if (computerPokemonHP <= 0) {
                    System.out.println(computerPokemon.getName() + " has fainted! You win!");
                    break;
                }
                playerPokemonHP = executeTurn(computerPokemon, selectedPokemon, computerMovePower, playerPokemonHP);
                if (playerPokemonHP <= 0) {
                    System.out.println(selectedPokemon.getName() + " has fainted! You lose!");
                    break;
                }
            } else {
                playerPokemonHP = executeTurn(computerPokemon, selectedPokemon, computerMovePower, playerPokemonHP);
                if (playerPokemonHP <= 0) {
                    System.out.println(selectedPokemon.getName() + " has fainted! You lose!");
                    break;
                }
                computerPokemonHP = executeTurn(selectedPokemon, computerPokemon, userMovePower, computerPokemonHP);
                if (computerPokemonHP <= 0) {
                    System.out.println(computerPokemon.getName() + " has fainted! You win!");
                    break;
                }
            }
        }
    }

    // Method to get the user's move power based on their selection
    private int getUserMovePower() {
        System.out.println("Select a move to attack:");
        for (int i = 0; i < selectedPokemon.getMoves().getSize(); i++) {
            Move move = selectedPokemon.getMoves().getMove(i);
            System.out.print((i + 1) + ". " + move.getName() + " ");
        }
        System.out.println();

        int selectedMove = scanMove.nextInt() - 1;
        if (selectedMove < 0 || selectedMove >= selectedPokemon.getMoves().getSize()) {
            System.out.println("Invalid choice");
            return getUserMovePower();
        }

        return selectedPokemon.getMoves().getMove(selectedMove).getPower();
    }

    private int executeTurn(PokemonStats attacker, PokemonStats defender, int movePower, int defenderHP) {
        int attack = attacker.getAttack();
        int defense = defender.getDefense();
        int damage = (int) (0.5 * movePower * (attack / defense)) + 1;

        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " +
                attacker.getMoves().getMove(compMove.nextInt(attacker.getMoves().getSize())).getName() +
                " for " + damage + " damage!");

        defenderHP -= damage;

        if (defenderHP <= 0) {
            System.out.println(defender.getName() + "'s remaining HP: 0");
            return 0; // Ensures HP doesn't go negative and signals fainted status
        } else {
            System.out.println(defender.getName() + "'s remaining HP: " + defenderHP);
            return defenderHP;
        }
    }
}
