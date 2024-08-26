package PokemonData.ElectricTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.ElectricMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Raichu extends PokemonStats {
   public Raichu() {
      super("Raichu", "Electric", 150, 35, 25, 90, 14, 120, 40, 55, new Moves(
            ElectricMoves.Thunderbolt,
            ElectricMoves.Thunder_shock,
            ElectricMoves.Thunder_shock,
            ElectricMoves.Thunder));
   }
}