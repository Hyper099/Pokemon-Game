package PokemonData;

import PokemonMoves.WaterMoves;
import PokemonMoves.MainMoves;

public class Squirtle {
    
    public String Name = "Charmander";
    String type = "Fire";
    int HP= 100;
    int Attack = 30;
    int Defence = 20;
    int Speed = 25;
    MainMoves Move1, Move2,Move3,Move4;

    public Squirtle(){
        

        
    WaterMoves SquirtleMoves = new WaterMoves();

    
    this.Move1 = SquirtleMoves.moves[0];
    this.Move2 = SquirtleMoves.moves[1];
    this.Move3 = SquirtleMoves.moves[2];
    this.Move4 = SquirtleMoves.moves[3];
    }
}
