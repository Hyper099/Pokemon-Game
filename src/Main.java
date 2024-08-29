import PokemonData.PokemonStats;

public class Main {

   public static void main(String[] args) {

      StartGame game = new StartGame();

      // Start the game and select a starter Pokémon
      game.startJourney();

      // Get the player profile and selected Pokémon
      PlayerProfile playerProfile = game.getPlayerProfile();
      PokemonStats selectedPokemon = playerProfile.getActivePokemon(); // Active Pokémon is the starter
      PokemonStats computerPokemon = game.getComputerPokemon();

      // Assuming Menu class takes player profile and computer Pokémon
      Menu menu = new Menu();

      System.out.println("\nLet's start your adventure with " + selectedPokemon.getName() + "!");

      // Pass the player profile and computer Pokémon to the menu
      menu.menuActions(playerProfile, computerPokemon);

      System.out.println("\nThank you for playing the game!\n");
   }
}
