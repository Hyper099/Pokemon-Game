package PokemonData.DragonTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.DragonMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Dratini extends PokemonStats {
   public Dratini() {
      super("Dratini", "Dragon", 120, 30, 35, 50, 12, 70, 30, 40, new Moves(
            DragonMoves.Dragon_breath,
            DragonMoves.Draco_meteor,
            DragonMoves.Dragon_claw,
            DragonMoves.Dragon_pulse));
   }
}