package PokemonData;

import PokemonMoves.Moves;
import PokemonMoves.WaterMoves;

public class Squirtle {

    public String Name = "Charmander";
    public String type = "Fire";
    public int HP = 100;
    public int Attack = 30;
    public int Defence = 20;
    public int Speed = 25;
    public Moves Moves;

    public Squirtle() {

        this.Moves = new Moves(
                WaterMoves.Water_gun,
                WaterMoves.Tackle,
                WaterMoves.Bubble,
                WaterMoves.Tail_whip);
    }

    public Moves getMoves() {
        return Moves;
    }
}
