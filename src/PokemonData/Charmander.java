package PokemonData;

import PokemonMoves.FireMoves;
import PokemonMoves.Moves;

public class Charmander extends PokemonStats {

   public Charmander() {
      super("Charmander", "Fire", 100, 30, 20, 25, new Moves(
            FireMoves.Ember,
            FireMoves.Scratch,
            FireMoves.Growl,
            FireMoves.Fire_fang));
   }
}
