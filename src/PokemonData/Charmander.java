package PokemonData;

import PokemonMoves.FireMoves;
import PokemonMoves.MainMoves;

public class Charmander {

    public String Name = "Charmander";
    public String type = "Fire";
    public int HP = 100;
    public int Attack = 30;
    public int Defence = 20;
    public int Speed = 25;
    public MainMoves Move1, Move2, Move3, Move4;

    public Charmander() {

        FireMoves CharmanderMoves = new FireMoves();

        this.Move1 = CharmanderMoves.moves[0];
        this.Move2 = CharmanderMoves.moves[1];
        this.Move3 = CharmanderMoves.moves[2];
        this.Move4 = CharmanderMoves.moves[3];

    }

    public String getName() {
        return Name;
    }

    public MainMoves getMoves() {
        return Move1;
    }
}
