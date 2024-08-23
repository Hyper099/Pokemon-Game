public class Main {

   public static void main(String[] args) {

      StartGame game = new StartGame();
      PokemonStats selectedPokemon = game.selectStarterPokemon();
      Menu menu = new Menu();
      // PlayerProfile player1 = new PlayerProfile();
      System.out.println("\nLet's start your adventure with " + selectedPokemon.getName() + "!");

      // player1.addCharmander();
      // player1.displayName();
      // player1.move1();
      menu.menuActions(selectedPokemon);
      System.out.println("hmm");
   }
}