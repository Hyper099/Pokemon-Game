import PokemonData.PokemonStats;

public class Main {

   // Notes:
   // Initialize scanner wherever using as private

   public static void main(String[] args) {

      StartGame game = new StartGame();

      PokemonStats selectedPokemon = game.selectStarterPokemon();
      PokemonStats computerPokemon = game.getComputerPokemon();
      Menu menu = new Menu();

      System.out.println("\nLet's start your adventure with " + selectedPokemon.getName() + "!");

      menu.menuActions(selectedPokemon, computerPokemon);

      System.out.println("\nThankyou for Playing the game!\n");
   }
}
