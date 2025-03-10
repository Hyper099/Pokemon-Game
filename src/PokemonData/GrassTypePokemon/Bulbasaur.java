package PokemonData.GrassTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Moves;
import PokemonMoves.GrassMoves;

public class Bulbasaur extends PokemonStats {

    public Bulbasaur() {
        super("Bulbasaur", "Grass", 120, 20, 30, 15,5,70,20,30, new Moves(
                GrassMoves.Vine_whip,
                GrassMoves.Tackle,
                GrassMoves.Leech_seed,
                GrassMoves.Growl));
    }
}
