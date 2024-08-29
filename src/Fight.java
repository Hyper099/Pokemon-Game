import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Move;
import java.util.Random;
import java.util.Scanner;

import GameMechanics.TypeEffectiveness;

public class Fight {
    private final PlayerProfile playerProfile;
    private final PokemonStats computerPokemon;
    private final TypeEffectiveness typeEffector = new TypeEffectiveness();
    private final Scanner scanMove = new Scanner(System.in);
    private final Random random = new Random();

    // Constructor to initialize the player profile and computer Pokémon
    public Fight(PlayerProfile playerProfile, PokemonStats computerPokemon) {
        this.playerProfile = playerProfile;
        this.computerPokemon = computerPokemon;
    }

    // Method to fight
    public void fight() {
        PokemonStats selectedPokemon = playerProfile.getActivePokemon();  // Get the player's active Pokémon
        int playerPokemonHP = selectedPokemon.getHP();
        int computerPokemonHP = computerPokemon.getHP();

        System.out.println("\n" + selectedPokemon.getName() + " V/S " + computerPokemon.getName() + "\n");

        while (true) {
            int selectedMoveIndex = getUserMoveIndex(selectedPokemon);
            int userMovePower = selectedPokemon.getMoves().getMove(selectedMoveIndex).getPower();

            int computerMoveIndex = random.nextInt(computerPokemon.getMoves().getSize());
            int computerMovePower = computerPokemon.getMoves().getMove(computerMoveIndex).getPower();

            if (selectedPokemon.getSpeed() >= computerPokemon.getSpeed()) {
                computerPokemonHP = userExecuteTurn(selectedPokemon, computerPokemon, userMovePower, computerPokemonHP, selectedMoveIndex);
                if (computerPokemonHP <= 0) {
                    System.out.println("\n" + computerPokemon.getName() + " has fainted! You win!\n");
                    LevelUpTech(selectedPokemon.getName(), selectedPokemon.getLevel(), selectedPokemon.getTotalExp(), selectedPokemon.getNextLvl(), computerPokemon.getExpGiven());
                    break;
                }
                playerPokemonHP = executeTurn(computerPokemon, selectedPokemon, computerMovePower, playerPokemonHP, computerMoveIndex);
                if (playerPokemonHP <= 0) {
                    System.out.println("\n" + selectedPokemon.getName() + " has fainted! You lose!\n");
                    break;
                }
            } else {
                playerPokemonHP = executeTurn(computerPokemon, selectedPokemon, computerMovePower, playerPokemonHP, computerMoveIndex);
                if (playerPokemonHP <= 0) {
                    System.out.println("\n" + selectedPokemon.getName() + " has fainted! You lose!\n");
                    break;
                }
                computerPokemonHP = executeTurn(selectedPokemon, computerPokemon, userMovePower, computerPokemonHP, selectedMoveIndex);
                if (computerPokemonHP <= 0) {
                    System.out.println("\n" + computerPokemon.getName() + " has fainted! You win!\n");
                    LevelUpTech(selectedPokemon.getName(), selectedPokemon.getLevel(), selectedPokemon.getTotalExp(), selectedPokemon.getNextLvl(), computerPokemon.getExpGiven());
                    break;
                }
            }
        }
    }

    // Method to get the user's move index based on their selection
    private int getUserMoveIndex(PokemonStats selectedPokemon) {
        System.out.println("Select a move to attack:");

        for (int i = 0; i < selectedPokemon.getMoves().getSize(); i++) {
            Move move = selectedPokemon.getMoves().getMove(i);
            int movePower = move.getPower();
            int attack = selectedPokemon.getAttack();
            int defense = computerPokemon.getDefense();

            // Calculate damage for display
            int damage = (int) (0.5 * movePower * (attack / defense)) + 1; // damage dealing formula

            System.out.print((i + 1) + ". " + move.getName() + " {" + damage + " damage} ");
        }
        System.out.println();

        int selectedMove = scanMove.nextInt() - 1;

        if (selectedMove < 0 || selectedMove >= selectedPokemon.getMoves().getSize()) {
            System.out.println("Invalid choice");
            return getUserMoveIndex(selectedPokemon);
        }

        return selectedMove;
    }

    // Method to execute a turn
    private int executeTurn(PokemonStats attacker, PokemonStats defender, int movePower, int defenderHP, int moveIndex) {
        int attack = attacker.getAttack();
        int defense = defender.getDefense();

        int damage = (int) (0.5 * movePower * (attack / defense)) + 1; // damage dealing formula

        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " +
                attacker.getMoves().getMove(moveIndex).getName() + " for " + damage + " damage!");

        defenderHP -= damage;

        if (defenderHP <= 0) {
            System.out.println(defender.getName() + "'s remaining HP: 0");
            return 0;
        } else {
            System.out.println(defender.getName() + "'s remaining HP: " + defenderHP);
            return defenderHP;
        }
    }

    // Method to execute a turn for the user's Pokémon, considering type effectiveness
    private int userExecuteTurn(PokemonStats attacker, PokemonStats defender, int movePower, int defenderHP, int moveIndex) {
        int attack = attacker.getAttack();
        int defense = defender.getDefense();
        String computerType = defender.getType();
        String userType = attacker.getType();

        // Check type effectiveness
        String[] superEffectiveTypes = typeEffector.getFireTypeSuperEffectiveness();

        for (String type : superEffectiveTypes) {
            if (type.equals(computerType)) {
                int damage = (int) (2 * (0.5 * movePower * (attack / defense)) + 1); // super effective damage
                System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " +
                        attacker.getMoves().getMove(moveIndex).getName() + " for " + damage + " damage! It's super effective!");

                defenderHP -= damage;

                if (defenderHP <= 0) {
                    System.out.println(defender.getName() + "'s remaining HP: 0");
                    return 0;
                } else {
                    System.out.println(defender.getName() + "'s remaining HP: " + defenderHP);
                    return defenderHP;
                }
            }
        }

        // Normal damage calculation
        int damage = (int) (0.5 * movePower * (attack / defense)) + 1;

        System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " +
                attacker.getMoves().getMove(moveIndex).getName() + " for " + damage + " damage!");

        defenderHP -= damage;

        if (defenderHP <= 0) {
            System.out.println(defender.getName() + "'s remaining HP: 0");
            return 0;
        } else {
            System.out.println(defender.getName() + "'s remaining HP: " + defenderHP);
            return defenderHP;
        }
    }

    // Method to handle level up mechanics
    private int LevelUpTech(String playerPokemonName, int playerPokemonLvl, int playerPokemonTotalExp, int playerPokemonNextLvl, int computerPokemonExpGiven) {
        int leftoverExp = computerPokemonExpGiven - playerPokemonNextLvl;

        if (leftoverExp >= 0) {
            playerProfile.getActivePokemon().setLevel(playerPokemonLvl + 1);
            playerProfile.getActivePokemon().setNextLvl((playerPokemonNextLvl + 3) - leftoverExp);
            System.out.println("Your " + playerPokemonName + " gained " + computerPokemonExpGiven + " exp");
            System.out.println("Congratulations! Your " + playerPokemonName + " has leveled up! It's now level " + playerProfile.getActivePokemon().getLevel());
            return playerProfile.getActivePokemon().getLevel();
        } else {
            playerProfile.getActivePokemon().setNextLvl(playerPokemonNextLvl + leftoverExp);
            System.out.println("Your " + playerPokemonName + " gained " + computerPokemonExpGiven + " exp");
            return playerProfile.getActivePokemon().getLevel();
        }
    }
}
