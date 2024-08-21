class PokemonArray {
   public PokemonStats[] pokemons = new PokemonStats[3];

   public PokemonArray() {
      pokemons[0] = new PokemonStats("Charmendar", 110, 20, 15, 40);
      pokemons[1] = new PokemonStats("Balbasaur", 120, 10, 30, 35);
      pokemons[2] = new PokemonStats("Squirtle", 150, 15, 5, 30);
   }
}