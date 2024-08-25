package PokemonData.GrassTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.GrassMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Ivysaur extends PokemonStats {
   public Ivysaur() {
      super("Ivysaur", "Grass", 140, 25, 35, 40, 7, 90, 30, 40, new Moves(
            GrassMoves.Razor_leaf,
            GrassMoves.Tackle,
            GrassMoves.Poison_powder,
            GrassMoves.Growl));
   }
}