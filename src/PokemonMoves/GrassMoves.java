package PokemonMoves;



public class GrassMoves {
    public MainMoves[] moves = new MainMoves[4];

    public GrassMoves() {
        moves[0] = new MainMoves("Vine Whip", 45);
        moves[1] = new MainMoves("Razor Leaf", 55);
        moves[2] = new MainMoves("Solar Beam", 120);
        moves[3] = new MainMoves("Seed Bomb", 80);
    }
}
