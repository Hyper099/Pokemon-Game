
import java.util.Scanner;

public class StartGame {
    
    void Start(){
        String [] PlayerPokemon = new String[6];
        Scanner scanChoice = new Scanner(System.in);
        CreatePokemon Starters = new CreatePokemon();
        String StarterChoice;
        System.out.println("HI trainer let us begin your journey!");
        System.out.println("Pick a starter pokemon");
        System.out.println(Starters.Pokemon[0].Name);
        System.out.println(Starters.Pokemon[1].Name);
        System.out.println(Starters.Pokemon[2].Name);
        System.out.println("Enter the name of the pokemon you want");


        StarterChoice = scanChoice.nextLine();

        if(StarterChoice.equals(Starters.Pokemon[0].Name)){
            System.out.println("You picked Bulbasaur");
            PlayerPokemon[0] = Starters.Pokemon[0].Name;
        }
        else if(StarterChoice.equals(Starters.Pokemon[1].Name)){
            System.out.println("You picked Charmander");
            PlayerPokemon[0] = Starters.Pokemon[1].Name;
        }
        else if(StarterChoice.equals(Starters.Pokemon[2].Name)){
            System.out.println("You picked Squirtle");
            PlayerPokemon[0] = Starters.Pokemon[2].Name;
        }
        

        scanChoice.close();

    }
}
