package PokemonData.IceTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.IceMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Froslass extends PokemonStats {
   public Froslass() {
      super("Froslass", "Ice", 120, 35, 45, 110, 18, 90, 50, 80,
            new Moves(
                  IceMoves.Ice_shard,
                  IceMoves.Ice_shard,
                  IceMoves.Ice_shard,
                  IceMoves.Hail));
   }
}