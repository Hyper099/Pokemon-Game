import PokemonData.Charmander;

public class PlayerProfile {
   public Charmander[] array = new Charmander[1];

   public void addCharmander() {
      array[0] = new Charmander();
   }

   public void displayName() {
      System.out.println(array[0].getName());
   }

   public void move1() {
      System.out.println(array[0].getMoves());
   }
}
