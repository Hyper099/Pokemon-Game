package PokemonData.ElectricTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.ElectricMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Pikachu extends PokemonStats {
   public Pikachu() {
      super("Pikachu", "Electric", 100, 20, 15, 55, 10, 90, 25, 35, new Moves(
            ElectricMoves.Thunder_shock,
            ElectricMoves.Quick_attack,
            ElectricMoves.Tail_whip,
            ElectricMoves.Thunder_wave));
   }
}