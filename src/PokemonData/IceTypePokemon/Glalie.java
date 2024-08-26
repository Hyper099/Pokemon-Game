package PokemonData.IceTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Moves;
import PokemonMoves.IceMoves;

public class Glalie extends PokemonStats {
   public Glalie() {
      super("Glalie", "Ice", 140, 40,
            50, 70, 12, 90, 40, 60,
            new Moves(
                  IceMoves.Ice_beam,
                  IceMoves.Ice_shard,
                  IceMoves.Ice_shard,
                  IceMoves.Frost_breath));
   }
}