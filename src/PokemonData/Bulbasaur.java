package PokemonData;

import PokemonMoves.GrassMoves;
import PokemonMoves.Moves;

public class Bulbasaur extends PokemonStats {

    public Bulbasaur() {
        super("Bulbasaur", "Grass", 120, 20, 30, 35,5,70,20,30, new Moves(
                GrassMoves.Vine_whip,
                GrassMoves.Tackle,
                GrassMoves.Leech_seed,
                GrassMoves.Growl));
    }
}
