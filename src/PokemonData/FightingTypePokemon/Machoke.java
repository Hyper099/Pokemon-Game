package PokemonData.FightingTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FightingMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Machoke extends PokemonStats {
   public Machoke() {
      super("Machoke", "Fighting", 180, 45, 40, 45, 8, 120, 50, 55, new Moves(
         FightingMoves.Karate_chop,
         FightingMoves.Karate_chop,
         FightingMoves.Karate_chop,
            FightingMoves.Bulk_up));
   }
}