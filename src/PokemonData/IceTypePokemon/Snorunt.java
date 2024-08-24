package PokemonData.IceTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.IceMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Snorunt extends PokemonStats {
   public Snorunt() {
      super("Snorunt", "Ice", 100, 20, 30, 50, 10, 60, 20, 30, new Moves(
            IceMoves.Ice_shard,
            IceMoves.Headbutt,
            IceMoves.Protect,
            IceMoves.Blizzard));
   }
}