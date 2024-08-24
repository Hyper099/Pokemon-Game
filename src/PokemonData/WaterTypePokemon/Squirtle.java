package PokemonData.WaterTypePokemon;

import PokemonData.PokemonStats;
import PokemonMoves.FormatOfMoves.Moves;
import PokemonMoves.WaterMoves;

public class Squirtle extends PokemonStats {

    public Squirtle() {
        super("Squirtle", "Water", 100, 30, 20, 25, 5, 70, 20, 30, new Moves(
                WaterMoves.Water_gun,
                WaterMoves.Tackle,
                WaterMoves.Bubble,
                WaterMoves.Tail_whip));
    }
}
