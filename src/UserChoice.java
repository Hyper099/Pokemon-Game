import java.util.Scanner;

public class UserChoice {
   public void userchoice(PokemonStats selectedPokemon) {
      Menu menu = new Menu();

      Scanner choice = new Scanner(System.in);

      menu.displayMenu();

      System.out.print("Enter your choice: ");
      int userChoice = choice.nextInt();

      switch (userChoice) {
         case 1 -> {
            System.out.println("You chose to fight!");

         }
         case 2 -> {
            System.out.println("Displaying selected Pokémon info:");

            System.out.println("Displaying selected Pokémon info:");
            System.out.println("Name: " + selectedPokemon.getName());
            System.out.println("Type: " + selectedPokemon.getType());
            System.out.println("HP: " + selectedPokemon.getHP());
            System.out.println("Attack: " + selectedPokemon.getAttack());
            System.out.println("Defense: " + selectedPokemon.getDefense());
            System.out.println("Speed: " + selectedPokemon.getSpeed());
            System.out.println("Moves:");
            for (int i = 0; i < 4; i++) {
               Move move = selectedPokemon.getMoves().getMove(i);
               System.out.println(move.getName() + " (Power: " + move.getPower() + ")");
            }
         }

         case 3 -> {
            System.out.println("Exiting Program.");
            choice.close();
            System.exit(0);
         }
         default -> System.out.println("Invalid choice try again.");
      }
   }
}
