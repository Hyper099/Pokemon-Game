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
        //Attack stats of mons
        int playerPokemonAttack = selectedPokemon.getAttack();
        int computerPokemonAttack = computerPokemon.getAttack();

        //Defence stats of mons

        int playerPokemonDefence = selectedPokemon.getDefense();
        int computerPokemonDefence = computerPokemon.getDefense();

        //Speed stats of mons

        int playerPokemonSpeed = selectedPokemon.getSpeed();
        int computerPokemonSpeed = computerPokemon.getSpeed();

        int userMovePower; // Variable to hold the power of the user's move
        int computerMoveIndex;
        String computerMove;
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
                case 0 -> {
                    userMovePower = selectedPokemon.getMoves().getMove(0).getPower();
                    
                }
                case 1 -> userMovePower = selectedPokemon.getMoves().getMove(1).getPower();
                case 2 -> userMovePower = selectedPokemon.getMoves().getMove(2).getPower();
                case 3 -> userMovePower = selectedPokemon.getMoves().getMove(3).getPower();
                default -> {
                    System.out.println("Invalid choice");
                    continue;
                }
            }
            // segment for randonly selecting move of computePokemon
            computerMoveIndex = compMove.nextInt(3)+1;
                    computerMove = computerPokemon.getMoves().getMove(computerMoveIndex).getName();
                    computerMovePower = computerPokemon.getMoves().getMove(computerMoveIndex).getPower();
                    
            System.out.println(userMovePower);
            System.out.println(computerMove);

            //  fight logic (like attacking and checking HP) would go here, without level up feature

            if(playerPokemonSpeed > computerPokemonSpeed){ //faster one attacks first

                //formula for calculation damage

                damage = (int)(0.5*userMovePower* (playerPokemonAttack/computerPokemonDefence))+1; //cuz 0.5 will make it a double which will be an issue

                //So first player attacked first
                System.out.println(selectedPokemon.getName() + " attacks " + computerPokemon.getName() + " with "
                + selectedPokemon.getMoves().getMove(selectedMove).getName() + " for " + damage
                + " damage!");

                computerPokemonHP -= damage;

                //Now computer's turn
                damage = (int)(0.5*computerMovePower* (computerPokemonAttack/playerPokemonDefence))+1;

                //damage window for computer
                System.out.println(computerPokemon.getName() + " attacks " + selectedPokemon.getName() + " with "
                + computerPokemon.getMoves().getMove(computerMoveIndex).getName() + " for " + damage
                + " damage!");
    


            }


            // if comp mon is faster , we jusr swap the attack order

            else if(playerPokemonSpeed < computerPokemonSpeed){ //faster one attacks first

                

                //Now computer's turn
                damage = (int)(0.5*computerMovePower* (computerPokemonAttack/playerPokemonDefence))+1;

                //damage window for computer
                System.out.println(computerPokemon.getName() + " attacks " + selectedPokemon.getName() + " with "
                + computerPokemon.getMoves().getMove(computerMoveIndex).getName() + " for " + damage
                + " damage!");

                playerPokemonHP -= damage;

                //formula for calculation damage

                damage = (int)(0.5*userMovePower* (playerPokemonAttack/computerPokemonDefence))+1; //cuz 0.5 will make it a double which will be an issue

                //So first player attacked first
                System.out.println(selectedPokemon.getName() + " attacks " + computerPokemon.getName() + " with "
                + selectedPokemon.getMoves().getMove(selectedMove).getName() + " for " + damage
                + " damage!");

                computerPokemonHP -= damage;
    


            }

            

            




























          
            if (computerPokemonHP <= 0) {
                System.out.println(computerPokemon.getName() + " has fainted! You win!");
                isPlaying = false;
                

            } else {
                System.out.println(computerPokemon.getName() + "'s remaining HP: " + computerPokemonHP);

            }

            if(playerPokemonHP <=0){
                System.out.println(computerPokemon.getName() + " has fainted! You win!");
                isPlaying = false;

            }
            else {
                System.out.println(selectedPokemon.getName() + "'s remaining HP: " + playerPokemonHP);
            }
          
        }
        scanMove.close();
    }
}
