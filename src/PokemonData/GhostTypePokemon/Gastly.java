package PokemonData.GhostTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Moves;
import PokemonMoves.GhostMoves;

public class Gastly extends PokemonStats {
    public Gastly() {
        super("Gastly", "Ghost", 90, 20, 15, 80, 12, 60, 15, 20, new Moves(
                GhostMoves.Lick,
                GhostMoves.Lick,
                GhostMoves.Lick,
                
                GhostMoves.Night_shade));
    }
}