public class Menu {
   public void displayMenu() {
      String actions[] = new String[] { "Fight", "Display Pokemon Info", "Exit" };

      System.out.println("Select the actions to perform (Select Index): ");
      for (int i = 0; i < actions.length; i++) {
         System.out.println((i + 1) + ". " + actions[i]);
      }
   }
}