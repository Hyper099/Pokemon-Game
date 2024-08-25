import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Move;
import java.util.Random;
import java.util.Scanner;

import GameMechanics.TypeEffectiveness;

public class Fight {
    private final PokemonStats selectedPokemon;
    private final PokemonStats computerPokemon;
    private TypeEffectiveness typeEffector = new TypeEffectiveness();
    private final Scanner scanMove = new Scanner(System.in);
    private final Random random = new Random();

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

        // Getting the level up requirments

        while (true) {
            int selectedMoveIndex = getUserMoveIndex();
            int userMovePower = selectedPokemon.getMoves().getMove(selectedMoveIndex).getPower();

            int computerMoveIndex = random.nextInt(computerPokemon.getMoves().getSize());
            int computerMovePower = computerPokemon.getMoves().getMove(computerMoveIndex).getPower();

            if (selectedPokemon.getSpeed() >= computerPokemon.getSpeed()) {
                computerPokemonHP = userExecuteTurn(selectedPokemon, computerPokemon, userMovePower, computerPokemonHP,
                        selectedMoveIndex);
                if (computerPokemonHP <= 0) {
                    System.out.println("\n" + computerPokemon.getName() + " has fainted! You win!\n");
                    LevelUpTech(selectedPokemon.getName(), selectedPokemon.getLevel(), selectedPokemon.getTotalExp(),
                            selectedPokemon.getNextLvl(), computerPokemon.getExpGiven());

                    break;
                }
                playerPokemonHP = executeTurn(computerPokemon, selectedPokemon, computerMovePower, playerPokemonHP,
                        computerMoveIndex);
                if (playerPokemonHP <= 0) {
                    System.out.println("\n" + selectedPokemon.getName() + " has fainted! You lose!\n");
                    break;
                }
            } else {
                playerPokemonHP = executeTurn(computerPokemon, selectedPokemon, computerMovePower, playerPokemonHP,
                        computerMoveIndex);
                if (playerPokemonHP <= 0) {
                    System.out.println("\n" + selectedPokemon.getName() + " has fainted! You lose!\n");
                    break;
                }
                computerPokemonHP = executeTurn(selectedPokemon, computerPokemon, userMovePower, computerPokemonHP,
                        selectedMoveIndex);
                if (computerPokemonHP <= 0) {
                    System.out.println("\n" + computerPokemon.getName() + " has fainted! You win!\n");
                    LevelUpTech(selectedPokemon.getName(), selectedPokemon.getLevel(), selectedPokemon.getTotalExp(),
                            selectedPokemon.getNextLvl(), computerPokemon.getExpGiven());
                    break;
                }
            }
        }
    }

    // Method to get the user's move index based on their selection
    private int getUserMoveIndex() {
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
            return getUserMoveIndex();
        }

        return selectedMove;
    }

    private int executeTurn(PokemonStats attacker, PokemonStats defender, int movePower, int defenderHP,
            int moveIndex) {
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
        private int userExecuteTurn(PokemonStats attacker, PokemonStats defender, int movePower, int defenderHP,
        int moveIndex) {
            int attack = attacker.getAttack();
            int defense = defender.getDefense();
            String computerType = computerPokemon.getType();
            String userType = selectedPokemon.getType();

            String arr[] = typeEffector.getFireTypeSuperEffectiveness();

            for(int i =0; i<arr.length; i++){
                if(arr[i].equals(computerType)){
                    int damage = (int) (2*(0.5 * movePower * (attack / defense)) + 1); // damage dealing formula
                    System.out.println(attacker.getName() + " attacks " + defender.getName() + " with " +
                    attacker.getMoves().getMove(moveIndex).getName() + " for " + damage + " damage!, It is Super Effective!");

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



   
  
    private int LevelUpTech(String playerPokemonName ,int playerPokemonLvl ,int playerPokemonTotalExp, int playerPokemonNextLvl ,int computerPokemonExpGiven){
        int leftoverExp = computerPokemonExpGiven - playerPokemonNextLvl;

        if(leftoverExp >= 0){
            selectedPokemon.setLevel(playerPokemonLvl+1);
            selectedPokemon.setNextLvl((playerPokemonNextLvl +3)- leftoverExp); 
            System.out.println("Your "+ playerPokemonName+" gained "+ computerPokemonExpGiven+" exp");
            System.out.println("Congratulations your " + playerPokemonName+ " has leveled up!, It's level is now " + selectedPokemon.getLevel());
            return selectedPokemon.getLevel();
        }
        else{
            selectedPokemon.setNextLvl(playerPokemonNextLvl + leftoverExp);
            System.out.println("Your "+ playerPokemonName+" gained "+ computerPokemonExpGiven+" exp");
            return selectedPokemon.getLevel();
        }
    }
}