import PokemonData.Bulbasaur;
import PokemonData.Charmander;
import PokemonData.PokemonStats;
import PokemonData.Squirtle;

class PokemonArray {
      public PokemonStats[] pokemons = new PokemonStats[3];

      public PokemonArray() {
            pokemons[0] = new Charmander();
            pokemons[1] = new Bulbasaur();
            pokemons[2] = new Squirtle();
      }
}
