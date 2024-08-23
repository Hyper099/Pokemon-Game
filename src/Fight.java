import java.util.Random;
import java.util.Scanner;

import PokemonData.PokemonStats;

public class Fight {
    private int damage;
    private final PokemonStats selectedPokemon;
    private final PokemonStats computerPokemon;

    public Fight(PokemonStats selectedPokemon, PokemonStats computerPokemon) {
        this.selectedPokemon = selectedPokemon;
        this.computerPokemon = computerPokemon;
    }

    public void performAction() {
        System.out.println(selectedPokemon.getAttack());
        System.out.println(computerPokemon.getSpeed());
    }

    public void fight() {
        Scanner scanMove = new Scanner(System.in);
        Random compMove = new Random();

        // Storing HP of playerPokemon and computerPokemon
        int playerPokemonHP = selectedPokemon.getHP();
        int computerPokemonHP = computerPokemon.getHP();

        boolean isPlaying = true;
        int selectedMove = 0;
        int userMovePower = 0;
        int computerMovePower;

        while (isPlaying) {
            System.out.println("Select a move to attack: ");
            System.out.println(selectedPokemon.getMoves().getMove(0));
            System.out.println(selectedPokemon.getMoves().getMove(1));
            System.out.println(selectedPokemon.getMoves().getMove(2));
            System.out.println(selectedPokemon.getMoves().getMove(3));

            selectedMove = scanMove.nextInt();

            switch (selectedMove) {
                case 1 -> userMovePower = selectedPokemon.getMoves().getMove(0).getPower();
                case 2 -> userMovePower = selectedPokemon.getMoves().getMove(1).getPower();
                case 3 -> userMovePower = selectedPokemon.getMoves().getMove(2).getPower();
                case 4 -> userMovePower = selectedPokemon.getMoves().getMove(3).getPower();
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
