package PokemonData.ElectricTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.ElectricMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Jolteon extends PokemonStats {
   public Jolteon() {
      super("Jolteon", "Electric", 130, 30, 25, 110, 12, 100, 35, 45, new Moves(
            ElectricMoves.Thunder_shock,
            ElectricMoves.Thunder_shock,
            ElectricMoves.Thunder_shock,
            ElectricMoves.Thunderbolt));
   }
}