package PokemonData;

import PokemonMoves.Moves;
import PokemonMoves.WaterMoves;

public class Squirtle extends PokemonStats {

    public Squirtle() {
        super("Squirtle", "Water", 100, 30, 20, 25, new Moves(
                WaterMoves.Water_gun,
                WaterMoves.Tackle,
                WaterMoves.Bubble,
                WaterMoves.Tail_whip));
    }
}
