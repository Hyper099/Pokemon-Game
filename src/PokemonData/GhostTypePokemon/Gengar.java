package PokemonData.GhostTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.GhostMoves;
import PokemonMoves.FormatOfMoves.Moves;

public class Gengar extends PokemonStats {
   public Gengar() {
      super("Gengar", "Ghost", 140, 40, 30, 110, 16, 100, 30, 50, new Moves(
            GhostMoves.Shadow_ball,
            GhostMoves.Sludge_bomb,
            GhostMoves.Dark_pulse,
            GhostMoves.Dream_eater));
   }
}