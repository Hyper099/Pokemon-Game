import java.util.Scanner;

public class StartGame {
   private Scanner scanChoice = new Scanner(System.in);

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
            if (starterChoice.equalsIgnoreCase(pokemon.getName())) { // equals to the name of the Pokemon without
                                                                     // checking for the upper or lower case
               selectedPokemon = pokemon;
               break;
            }
         }
         // BREAKDOWN UNDERSTANING OF ABOVE FOR LOOP
         // for(DATATYPE {which is PokemonStats here} ELEMENT NAME {which we are using to
         // loop in it}: ARRAY NAME )

         if (selectedPokemon != null) {
            System.out.println(
                  "You selected: " + selectedPokemon.getName() + " (" + selectedPokemon.getType() + " type)");
         } else {
            System.out.println("Invalid choice. Please try again.");
         }
      }
      return selectedPokemon; // same DATATYPE as PokemonStats
   }
}
