package PokemonMoves;

// a single move which will later be stores in the moves array.
public class Move {

   private final String name;
   private final int power;

   public Move(String name, int power) {
      this.name = name;
      this.power = power;
   }

   public String getName() {
      return name;
   }

   public int getPower() {
      return power;
   }
}