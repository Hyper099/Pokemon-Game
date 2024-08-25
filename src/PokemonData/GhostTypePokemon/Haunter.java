package PokemonData.GhostTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.GhostMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Haunter extends PokemonStats {
   public Haunter() {
      super("Haunter", "Ghost", 120, 35, 25, 100, 14, 80, 25, 40, new Moves(
            GhostMoves.Shadow_ball,
            GhostMoves.Dream_eater,
            GhostMoves.Nightmare,
            GhostMoves.Sucker_punch));
   }
}