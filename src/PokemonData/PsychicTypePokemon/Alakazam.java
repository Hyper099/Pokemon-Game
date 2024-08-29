package PokemonData.PsychicTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.PsychicMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Alakazam extends PokemonStats {
   public Alakazam() {
      super("Alakazam", "Psychic", 130, 35, 20, 135, 19, 110, 50, 70, new Moves(
            PsychicMoves.Psychic,
            PsychicMoves.Psychic,
           
            PsychicMoves.Psybeam,
            PsychicMoves.Future_sight));
   }
}