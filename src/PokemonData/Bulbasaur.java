package PokemonData;

import PokemonMoves.GrassMoves; // Import GrassMoves from the correct package
import PokemonMoves.MainMoves; // Import MainMoves from the correct package

public class Bulbasaur {
    public String Name = "Bulbasaur";
    public String type = "Grass";
    public int HP = 120;
    public int Attack = 20;
    public int Defence = 30;
    public int Speed = 35;
    public MainMoves Move1, Move2, Move3, Move4;

    public Bulbasaur() {
        GrassMoves BulbasaurMoves = new GrassMoves();

        this.Move1 = BulbasaurMoves.moves[0];
        this.Move2 = BulbasaurMoves.moves[1];
        this.Move3 = BulbasaurMoves.moves[2];
        this.Move4 = BulbasaurMoves.moves[3];
    }
}
