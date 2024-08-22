public class Moves {
   private String move1, move2, move3, move4;

   public String fire(String move1, String move2, String move3, String move4) {
      this.move1 = move1;
      this.move2 = move2;
      this.move3 = move3;
      this.move4 = move4;
      return (this.move1 + this.move2 + this.move3 + this.move4);
   }

   public String getMove1() {
      return move1;
   }

   public String getMove2() {
      return move2;
   }

   public String getMove3() {
      return move3;
   }

   public String getMove4() {
      return move4;
   }

   // public void grass(String move1, String move2, String move3, String move4)

   // public void water(String move1, String move2, String move3, String move4)
}
