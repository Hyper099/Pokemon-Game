public class Main {
   public static void main(String[] args) {
      StartGame game = new StartGame();
      PokemonStats selectedPokemon = game.selectStarterPokemon();
      UserChoice userChoice = new UserChoice();

      System.out.println("\nLet's start your adventure with " + selectedPokemon.getName() + "!\n");
      userChoice.userChoice(selectedPokemon);
      userChoice.closeScanner();
   }
}