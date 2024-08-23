package PokemonMoves;

public class MainMoves {
    String Name;
    int Power;

    public MainMoves(String name, int power) {
        this.Name = name;
        this.Power = power;
    }

    public String getName() {
        return Name;
    }

    public int getPower() {
        return Power;
    }
}
