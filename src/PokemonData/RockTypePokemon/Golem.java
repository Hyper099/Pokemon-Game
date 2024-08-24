package PokemonData.RockTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.RockMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Golem extends PokemonStats {
   public Golem() {
      super("Golem", "Rock", 200, 60, 80, 40, 14, 130, 80, 100, new Moves(
            RockMoves.Stone_edge,
            RockMoves.Rollout,
            RockMoves.Earthquake,
            RockMoves.Explosion));
   }
}