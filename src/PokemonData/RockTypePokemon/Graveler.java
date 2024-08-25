package PokemonData.RockTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.RockMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Graveler extends PokemonStats {
   public Graveler() {
      super("Graveler", "Rock", 160, 50, 60, 30, 10, 100, 60, 70, new Moves(
            RockMoves.Rock_blast,
            RockMoves.Self_destruct,
            RockMoves.Rock_polish,
            RockMoves.Earthquake));
   }
}