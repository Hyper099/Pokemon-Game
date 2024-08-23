package PokemonData;

import PokemonMoves.GrassMoves;
import PokemonMoves.Moves;

public class Bulbasaur {
    public String name = "Bulbasaur";
    public String type = "Grass";
    public int hp = 120;
    public int attack = 20;
    public int defense = 30;
    public int speed = 35;
    public Moves Moves;

    public Bulbasaur() {
        this.Moves = new Moves(
                GrassMoves.Vine_whip,
                GrassMoves.Tackle,
                GrassMoves.Leech_seed,
                GrassMoves.Growl);
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
