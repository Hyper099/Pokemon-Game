import java.util.Scanner;

public class StartGame {

    public PokemonStats selectStarterPokemon() {
        try (Scanner scanChoice = new Scanner(System.in)) {
            PokemonArray starters = new PokemonArray();
            String starterChoice;
            System.out.println("Hi! Trainer, let us begin your journey!");
            System.out.println("Pick a starter Pokémon: ");

            for (PokemonStats pokemon : starters.pokemons) {
                System.out.println(pokemon.getName());
            }
            System.out.print("Enter the name of the Pokémon you want: ");

            starterChoice = scanChoice.nextLine();

            PokemonStats selectedPokemon = null;

            for (PokemonStats pokemon : starters.pokemons) {
                if (starterChoice.equalsIgnoreCase(pokemon.getName())) {
                    selectedPokemon = pokemon;
                    break;
                }
            }

            if (selectedPokemon != null) {
                System.out.println(
                        "You selected: " + selectedPokemon.getName() + " (" + selectedPokemon.getType() + " type)");
                System.out.println("Moves:");
                for (int i = 0; i < 4; i++) {
                    Move move = selectedPokemon.getMoves().getMove(i);
                    System.out.println(move.getName() + " (Power: " + move.getPower() + ")");
                }
                return selectedPokemon;
            } else {
                System.out.println("Invalid choice. Please try again.");
                return selectStarterPokemon(); // Recursively call the method again if the input is invalid.
            }
        }
    }
}
