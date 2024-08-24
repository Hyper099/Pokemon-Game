package PokemonData.FireTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FireMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Charmander extends PokemonStats {

   public Charmander() {
      super("Charmander", "Fire", 100, 30, 20, 25, 5, 70, 20, 30, new Moves(
            FireMoves.Ember,
            FireMoves.Scratch,
            FireMoves.Growl,
            FireMoves.Fire_fang));
   }
}
