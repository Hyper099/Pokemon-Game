import PokemonMoves.Move;

public class PlayerProfile {
   private PokemonStats selectedPokemon; // inserting selected pokemon as player

   public PlayerProfile(PokemonStats selectedPokemon) {
      this.selectedPokemon = selectedPokemon;
   }

   public void getName() {
      System.out.println("Player 1: " + selectedPokemon.getName());
   }

   // call a function always with move (coz move is single) (and moves is a array
   // of move)
   public void getMove(int index) {
      Move playerMove = selectedPokemon.getMoves().getMove(index); // use this getter to get move.
      System.out.println(playerMove.getName());
   }

}
