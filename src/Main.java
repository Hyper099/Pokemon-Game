
import PokemonData.PokemonStats;

public class Main {

   // Notes:
   // INTIALIZE SCANNER WHEREVER USING AS PRIVATE

   public static void main(String[] args) {

      StartGame game = new StartGame();
     
      PokemonStats selectedPokemon = game.selectStarterPokemon();
      PokemonStats ComputerPokemon = game.ComputerPokemon();
      Menu menu = new Menu();
      PlayerProfile player = new PlayerProfile(selectedPokemon);

      System.out.println("\nLet's start your adventure with " + selectedPokemon.getName() + "!");

      menu.menuActions(selectedPokemon);

      // plyaer controls can be done this way now
      player.getMove(1);
      player.getName();

   }
}