public class Main {
   public static void main(String[] args) {
      StartGame game = new StartGame();
      PokemonStats selectedPokemon = game.selectStarterPokemon();
      Move move = selectedPokemon.getMoves().getMove(1);
      Menu menu = new Menu();

      // Further game logic can use the selectedPokemon object
      System.out.println("Let's start your adventure with " + selectedPokemon.getName() + "!");
      menu.displayMenu();

   }
}
