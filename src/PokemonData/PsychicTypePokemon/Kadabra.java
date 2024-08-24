package PokemonData.PsychicTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.PsychicMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Kadabra extends PokemonStats {
   public Kadabra() {
      super("Kadabra", "Psychic", 110, 25, 15, 120, 17, 90, 30, 50, new Moves(
            PsychicMoves.Psybeam,
            PsychicMoves.Confusion,
            PsychicMoves.Reflect,
            PsychicMoves.Psychic));
   }
}