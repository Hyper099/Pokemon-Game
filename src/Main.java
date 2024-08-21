public class Main {
   public static void main(String[] args) {
      System.out.println("Displaying Pokemon:");
      PokemonArray array = new PokemonArray();
      for (PokemonStats p : array.pokemons) {
         System.out.println(
               "\n" + p.getName() + ":\n HP: " + p.getHP() + "\n Attack: " + p.getAttack() + "\n Defense: "
                     + p.getDefense()
                     + "\n Sp. Attack: " + p.getSpAttack());
      }
   }
}