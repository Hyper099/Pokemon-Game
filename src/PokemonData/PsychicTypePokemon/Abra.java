package PokemonData.PsychicTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.PsychicMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Abra extends PokemonStats {
   public Abra() {
      super("Abra", "Psychic", 90, 15, 10, 105, 15, 70, 10, 25, new Moves(
            PsychicMoves.Teleport,
            PsychicMoves.Psychic,
            PsychicMoves.Confusion,
            PsychicMoves.Psybeam));
   }
}