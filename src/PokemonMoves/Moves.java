package PokemonMoves;

public class Moves {
   private final Move[] moves;

   public Moves(Move move1, Move move2, Move move3, Move move4) {
      this.moves = new Move[] { move1, move2, move3, move4 };
   }

   public Move getMove(int index) {
      if (index >= 0 && index < moves.length) {
         return moves[index];
      } else {
         return null;
      }
   }

   public int getSize() {
      return moves.length;
   }
}