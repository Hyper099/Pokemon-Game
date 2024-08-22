import java.util.Scanner;

public class Menu {
   String actions[] = new String[] { "Fight", "Display Pokemon Info", "Exit" };

   private Scanner scanner = new Scanner(System.in);

   public void displayMenu() {
      System.out.println("Select the actions to perform (Select Index): ");
      for (int i = 0; i < actions.length; i++) {
         System.out.println((i + 1) + ". " + actions[i]);
      }
   }

   public int getChoice() {
      return (scanner.nextInt());
   }

   public void menuActions() {
      switch (getChoice()) {
         case 1 -> System.out.println("You chose to Fight");
         case 2 -> System.out.println("You chose to Display Pokemon Info");
         case 3 -> {
            System.out.println("You chose to Exit");
            scanner.close();
            System.exit(0);
         }
         default -> {
            System.out.println("Invalid Choice");
            menuActions();
         }
      }
   }
}