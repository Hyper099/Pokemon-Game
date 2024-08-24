import java.util.Random;
import java.util.Scanner;

import PokemonData.PokemonStats;

public class StartGame {
   private final Scanner scanChoice = new Scanner(System.in);
   private final Random random = new Random();

   public PokemonStats selectStarterPokemon() {
      PokemonArray starters = new PokemonArray();
      String starterChoice;
      PokemonStats selectedPokemon = null;

      System.out.println("Hi! Trainer, let us begin your journey!");
      System.out.println("Pick a starter Pokémon: ");

      for (int i = 0; i < starters.pokemons.length; i++) {
         System.out.println((i + 1) + ". " + starters.pokemons[i].getName());
      }

      while (selectedPokemon == null) {
         System.out.print("Enter the name of the Pokémon you want: ");
         starterChoice = scanChoice.nextLine();

         for (PokemonStats pokemon : starters.pokemons) {
            if (starterChoice.equalsIgnoreCase(pokemon.getName())) {
               selectedPokemon = pokemon;
               break;
            }
         }

         if (selectedPokemon != null) {
            System.out.println(
                  "You selected: " + selectedPokemon.getName() + " (" + selectedPokemon.getType() + " type)");
         } else {
            System.out.println("Invalid choice. Please try again.");
         }
      }
      return selectedPokemon;
   }

   public PokemonStats getComputerPokemon() {

      PokemonArray starters = new PokemonArray();

      int computerPokemonIndex = random.nextInt(starters.pokemons.length);
      PokemonStats computerPokemon = starters.pokemons[computerPokemonIndex];

      return computerPokemon;
   }
}
