package PokemonData;

import PokemonMoves.Moves;
import PokemonMoves.WaterMoves;

public class Squirtle {

    public String name = "Charmander";
    public String type = "Fire";
    public int hp = 100;
    public int attack = 30;
    public int defense = 20;
    public int speed = 25;
    public Moves Moves;

    public Squirtle() {

        this.Moves = new Moves(
                WaterMoves.Water_gun,
                WaterMoves.Tackle,
                WaterMoves.Bubble,
                WaterMoves.Tail_whip);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public Moves getMoves() {
        return Moves;
    }
}
