import PokemonData.Bulbasaur;
import PokemonData.Charmander;
import PokemonData.Squirtle;
import PokemonMoves.Moves;

class PokemonArray {
   public PokemonStats[] pokemons = new PokemonStats[3];

   public PokemonArray() {
      // CALL OBJECTS OF POKEMON
      Charmander charmander = new Charmander();
      Bulbasaur bulbasaur = new Bulbasaur();
      Squirtle squirtle = new Squirtle();

      // ASSIGN MOVES TO THE POKEMON OBJETS
      Moves charmanderMoves = charmander.getMoves();
      Moves bulbasaurMoves = bulbasaur.getMoves();
      Moves squirtleMoves = squirtle.getMoves();

      pokemons[0] = new PokemonStats("Charmander", "fire", 110, 20, 15, 40, charmanderMoves);
      pokemons[1] = new PokemonStats("Bulbasaur", "grass", 120, 10, 30, 35, bulbasaurMoves);
      pokemons[2] = new PokemonStats("Squirtle", "water", 150, 15, 5, 30,
            squirtleMoves);
   }
}