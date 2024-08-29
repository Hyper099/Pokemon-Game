package PokemonData.FireTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FireMoves;
import PokemonMoves.FlyingMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Charizard extends PokemonStats {
   public Charizard() {
      super("Charizard", "Fire", 180, 50, 40, 70, 12, 140, 50, 70, new Moves(
            FireMoves.Fire_blast,
            FireMoves.Flamethrower,
            FlyingMoves.Wing_attack,
            FireMoves.Flame_wheel));
   }
}