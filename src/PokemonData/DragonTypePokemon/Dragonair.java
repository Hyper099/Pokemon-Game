package PokemonData.DragonTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.DragonMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Dragonair extends PokemonStats {
   public Dragonair() {
      super("Dragonair", "Dragon", 160, 45, 50, 70, 14, 90, 40, 50, new Moves(
            DragonMoves.Dragon_breath,
            DragonMoves.Dragon_claw,
            DragonMoves.Dragon_pulse,
            DragonMoves.Dragon_tail));
   }
}