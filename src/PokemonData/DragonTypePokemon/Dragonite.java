package PokemonData.DragonTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.DragonMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Dragonite extends PokemonStats {
   public Dragonite() {
      super("Dragonite", "Dragon", 220, 70, 80, 80, 16, 120, 60, 70, new Moves(
            DragonMoves.Outrage,
            DragonMoves.Outrage,
            DragonMoves.Outrage,
            DragonMoves.Dragon_claw));
   }
}