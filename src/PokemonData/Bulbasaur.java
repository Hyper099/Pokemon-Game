package PokemonData;

import PokemonMoves.GrassMoves;
import PokemonMoves.Moves;

public class Bulbasaur {
    public String Name = "Bulbasaur";
    public String type = "Grass";
    public int HP = 120;
    public int Attack = 20;
    public int Defence = 30;
    public int Speed = 35;
    public Moves Moves;

    public Bulbasaur() {
        this.Moves = new Moves(
                GrassMoves.Vine_whip,
                GrassMoves.Tackle,
                GrassMoves.Leech_seed,
                GrassMoves.Growl);
    }

    public Moves getMoves() {
        return Moves;
    }

}
