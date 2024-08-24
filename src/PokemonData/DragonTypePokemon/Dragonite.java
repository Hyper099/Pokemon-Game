package PokemonData.DragonTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.DragonMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Dragonite extends PokemonStats {
   public Dragonite() {
      super("Dragonite", "Dragon", 220, 70, 80, 80, 16, 120, 60, 70, new Moves(
            DragonMoves.Outrage,
            DragonMoves.Fire_punch,
            DragonMoves.Hyper_beam,
            DragonMoves.Dragon_claw));
   }
}