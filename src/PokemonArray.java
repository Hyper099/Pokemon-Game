class PokemonArray {
   public PokemonStats[] pokemons = new PokemonStats[3];
   Moves moves = new Moves();

   public PokemonArray() {
      pokemons[0] = new PokemonStats("Charmendar", "fire", 110, 20, 15, 40, moves.fire("a", "b", "c", "d"));
      pokemons[1] = new PokemonStats("Balbasaur", "grass", 120, 10, 30, 35, moves);
      pokemons[2] = new PokemonStats("Squirtle", "water", 150, 15, 5, 30, moves);
   }
}