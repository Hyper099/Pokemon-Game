package PokemonData;

import PokemonMoves.FireMoves;
import PokemonMoves.Moves;

public class Charmander {

    public String name = "Charmander";
    public String type = "Fire";
    public int hp = 100;
    public int attack = 30;
    public int defense = 20;
    public int speed = 25;
    public Moves Moves;

    public Charmander() {
        this.Moves = new Moves(
                FireMoves.Ember,
                FireMoves.Scratch,
                FireMoves.Growl,
                FireMoves.Fire_fang);
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
