package PokemonMoves;

public class WaterMoves {
    public MainMoves[] moves = new MainMoves[4];

    public WaterMoves() {
        moves[0] = new MainMoves("WaterGun", 45);
        moves[1] = new MainMoves("Splash", 55);
        moves[2] = new MainMoves("HydroPump", 120);
        moves[3] = new MainMoves("AquaJet", 80);
    }
}
