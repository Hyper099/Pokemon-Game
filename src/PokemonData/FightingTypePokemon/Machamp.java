package PokemonData.FightingTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FightingMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Machamp extends PokemonStats {
   public Machamp() {
      super("Machamp", "Fighting", 220, 55, 50, 55, 12, 150, 70, 80, new Moves(
            FightingMoves.Dynamic_punch,
            FightingMoves.Karate_chop,
            FightingMoves.Seismic_toss,
            FightingMoves.Bulk_up));
   }
}