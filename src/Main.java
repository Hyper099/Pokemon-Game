public class Main {

   public static void main(String[] args) {

      StartGame game = new StartGame();
      PokemonStats selectedPokemon = game.selectStarterPokemon();
      Menu menu = new Menu();

      System.out.println("\nLet's start your adventure with " + selectedPokemon.getName() + "!\n");
      menu.displayMenu();
      menu.menuActions();

   }
}