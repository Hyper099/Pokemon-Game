package PokemonData.GrassTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.GrassMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Venusaur extends PokemonStats {
   public Venusaur() {
      super("Venusaur", "Grass", 180, 35, 45, 50, 10, 120, 40, 50, new Moves(
            GrassMoves.Solar_beam,
            GrassMoves.Vine_whip,
            GrassMoves.Sleep_powder,
            GrassMoves.Growth));
   }
}