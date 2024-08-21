import java.util.Scanner;

public class StartGame {

    String StarterPokemon() {
        String PlayerPokemon = "tatti";
        try (Scanner scanChoice = new Scanner(System.in)) {
            PokemonArray Starters = new PokemonArray();
            String StarterChoice;
            System.out.println("Hi! trainer let us begin your journey!");
            System.out.println("Pick a starter pokemon : ");
            System.out.println(Starters.pokemons[0].getName());
            System.out.println(Starters.pokemons[1].getName());
            System.out.println(Starters.pokemons[2].getName());
            System.out.print("Enter the name of the pokemon you want : ");

            StarterChoice = scanChoice.nextLine();

            if (StarterChoice.equals(Starters.pokemons[0].getName())) {
                PlayerPokemon = Starters.pokemons[0].getName();
            } else if (StarterChoice.equals(Starters.pokemons[1].getName())) {
                PlayerPokemon = Starters.pokemons[1].getName();
            } else if (StarterChoice.equals(Starters.pokemons[2].getName())) {
                PlayerPokemon = Starters.pokemons[2].getName();
            }
        }
        return PlayerPokemon;
    }
}
