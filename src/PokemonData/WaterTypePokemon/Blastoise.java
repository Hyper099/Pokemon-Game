package PokemonData.WaterTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Moves;
import PokemonMoves.IceMoves;
import PokemonMoves.WaterMoves;

public class Blastoise extends PokemonStats {
   public Blastoise() {
      super("Blastoise", "Water", 200, 45, 50, 60, 14, 150, 50, 70, new Moves(
            WaterMoves.Hydro_pump,
            WaterMoves.Surf,
            IceMoves.Ice_beam,
            WaterMoves.Surf));
   }
}