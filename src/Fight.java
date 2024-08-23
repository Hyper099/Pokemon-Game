

public class Fight {
    int Damage;


    public PokemonStats selectedPokemon;
    PlayerProfile gamer = new PlayerProfile(selectedPokemon);
    
    public void getName(){
        System.out.println(gamer.getName());
    }
}
