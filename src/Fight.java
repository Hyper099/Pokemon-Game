import java.util.Random;
import java.util.Scanner;

import PokemonData.PokemonStats;
import PokemonMoves.Move;

public class Fight {
    int Damage;
    private PokemonStats selectedPokemon;
    private PokemonStats ComputerPokemon;

    public Fight(PokemonStats selectedPokemon, PokemonStats ComputerPokemon) {
        this.selectedPokemon = selectedPokemon;
        this.ComputerPokemon = ComputerPokemon;
    }

    public String getName() {
        return selectedPokemon.getName();
    }

    // call a function always with move (coz move is single) (and moves is a array
    // of move)
    public void getMove(int index) {
        Move playerMove = selectedPokemon.getMoves().getMove(index); // use this getter to get move.
        System.out.println(playerMove.getName());
    }

    public void Stuff() {
        System.out.println(selectedPokemon.getAttack());
        System.out.println(ComputerPokemon.getSpeed());

    }

    void fight() {
        Scanner scanMove = new Scanner(System.in);
        Random CompMove = new Random();

        int PlayerHP = selectedPokemon.getHP();
        int ComputerHP = ComputerPokemon.getHP();
        boolean isPlaying = true;
        int selectedMove;
        int UserMovePower;
        int ComputerMovePower;
        while (isPlaying) {
            System.out.println("Select a move to attack: ");
            System.out.println(selectedPokemon.getMoves().getMove(0));
            System.out.println(selectedPokemon.getMoves().getMove(1));
            System.out.println(selectedPokemon.getMoves().getMove(2));
            System.out.println(selectedPokemon.getMoves().getMove(3));

            selectedMove = scanMove.nextInt();

            switch (selectedMove) {
                case 1 -> {
                    UserMovePower = selectedPokemon.getMoves().getMove(0).getPower();

                }
                case 2 -> {
                    UserMovePower = selectedPokemon.getMoves().getMove(1).getPower();
                }
                case 3 -> {
                    UserMovePower = selectedPokemon.getMoves().getMove(2).getPower();
                }
                case 4 -> {
                    UserMovePower = selectedPokemon.getMoves().getMove(3).getPower();
                }
                default -> System.out.println("Invalid choice");
            }

        }

    }

}
