import PokemonData.PokemonStats;
import java.util.ArrayList;
import java.util.List;

public class PlayerProfile {
    private String playerName;
    private List<PokemonStats> pokemonTeam;

    public PlayerProfile(String playerName) {
        this.playerName = playerName;
        this.pokemonTeam = new ArrayList<>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public List<PokemonStats> getPokemonTeam() {
        return pokemonTeam;
    }

    public void addPokemonToTeam(PokemonStats pokemon) {
        this.pokemonTeam.add(pokemon);
    }

    public PokemonStats getActivePokemon() {
        // In case you want to manage the active Pokémon in battles
        if (!pokemonTeam.isEmpty()) {
            return pokemonTeam.get(0); // Assuming the first Pokémon in the list is active
        }
        return null;
    }

    // Other methods to manage the player's Pokémon team can be added here
}
