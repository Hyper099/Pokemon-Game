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

            pokemons[0] = new PokemonStats(
                        charmander.getName(),
                        charmander.getType(),
                        charmander.getHP(),
                        charmander.getAttack(),
                        charmander.getDefense(),
                        charmander.getSpeed(),
                        charmanderMoves);

            pokemons[1] = new PokemonStats(
                        bulbasaur.getName(),
                        bulbasaur.getType(),
                        bulbasaur.getHP(),
                        bulbasaur.getAttack(),
                        bulbasaur.getDefense(),
                        bulbasaur.getSpeed(),
                        bulbasaurMoves);

            pokemons[2] = new PokemonStats(
                        squirtle.getName(),
                        squirtle.getType(),
                        squirtle.getHP(),
                        squirtle.getAttack(),
                        squirtle.getDefense(),
                        squirtle.getSpeed(),
                        squirtleMoves);
      }
}