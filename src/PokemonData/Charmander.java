package PokemonData;

import PokemonMoves.FireMoves;
import PokemonMoves.Moves;

public class Charmander {

    public String Name = "Charmander";
    public String type = "Fire";
    public int HP = 100;
    public int Attack = 30;
    public int Defence = 20;
    public int Speed = 25;
    public Moves Moves;

    public Charmander() {
        this.Moves = new Moves(
                FireMoves.Ember,
                FireMoves.Scratch,
                FireMoves.Growl,
                FireMoves.Fire_fang);
    }

    public String getName() {
        return Name;
    }

    public Moves getMoves() {
        return Moves;
    }
}
