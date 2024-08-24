package PokemonData.FightingTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FightingMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Machoke extends PokemonStats {
   public Machoke() {
      super("Machoke", "Fighting", 180, 45, 40, 45, 8, 120, 50, 55, new Moves(
            FightingMoves.Cross_chop,
            FightingMoves.Submission,
            FightingMoves.Revenge,
            FightingMoves.Bulk_up));
   }
}