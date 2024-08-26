package PokemonData.RockTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.RockMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Geodude extends PokemonStats {
   public Geodude() {
      super("Geodude", "Rock", 120, 40, 50, 20, 8, 70, 40, 50, new Moves(
            RockMoves.Rock_throw,
            RockMoves.Rock_throw,
            RockMoves.Rock_throw,
            RockMoves.Rock_throw));
   }
}