package PokemonData.WaterTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.WaterMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Wartortle extends PokemonStats {
   public Wartortle() {
      super("Wartortle", "Water", 150, 35, 40, 45, 9, 100, 40, 50, new Moves(
            WaterMoves.Bubble_beam,
            WaterMoves.Tackle,
            WaterMoves.Surf,
            WaterMoves.Surf));
   }
}