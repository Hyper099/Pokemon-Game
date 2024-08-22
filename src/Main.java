public class Main {
   public static void main(String[] args) {
      StartGame game = new StartGame();
      PokemonStats selectedPokemon = game.selectStarterPokemon();

      // Further game logic can use the selectedPokemon object
      System.out.println("Let's start your adventure with " + selectedPokemon.getName() + "!");
   }
}
