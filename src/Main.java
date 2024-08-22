public class Main {
   public static void main(String[] args) {
      StartGame game = new StartGame();
      PokemonStats selectedPokemon = game.selectStarterPokemon();

      System.out.println("\nLet's start your adventure with " + selectedPokemon.getName() + "!\n");
   }
}