package PokemonData.FightingTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FightingMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Machop extends PokemonStats {
   public Machop() {
      super("Machop", "Fighting", 140, 35, 25, 35, 6, 100, 35, 40, new Moves(
            FightingMoves.Karate_chop,
            FightingMoves.Low_kick,
            FightingMoves.Karate_chop,
            FightingMoves.Karate_chop));
   }
}