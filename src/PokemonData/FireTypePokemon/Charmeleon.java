package PokemonData.FireTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FireMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Charmeleon extends PokemonStats {
   public Charmeleon() {
      super("Charmeleon", "Fire", 140, 40, 30, 55, 8, 100, 30, 50, new Moves(
            FireMoves.Flamethrower,
            FireMoves.Scratch,
            FireMoves.Slash,
            FireMoves.Smokescreen));
   }
}