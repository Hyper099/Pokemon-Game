class PokemonArray {
   public PokemonStats[] pokemons = new PokemonStats[3];

   public PokemonArray() {
      Move ember = new Move("Ember", 40);
      Move scratch = new Move("Scratch", 30);
      Move growl = new Move("Growl", 0);
      Move fireFang = new Move("Fire Fang", 65);
      
      Moves charmanderMoves = new Moves(ember, scratch, growl, fireFang);

      Move vineWhip = new Move("Vine Whip", 45);
      Move tackle = new Move("Tackle", 40);
      Move leechSeed = new Move("Leech Seed", 0);
      Move growlBulbasaur = new Move("Growl", 0);
      Moves bulbasaurMoves = new Moves(vineWhip, tackle, leechSeed, growlBulbasaur);

      Move waterGun = new Move("Water Gun", 40);
      Move tailWhip = new Move("Tail Whip", 0);
      Move bubble = new Move("Bubble", 40);
      Move tackleSquirtle = new Move("Tackle", 40);
      Moves squirtleMoves = new Moves(waterGun, tailWhip, bubble, tackleSquirtle);

      pokemons[0] = new PokemonStats("Charmander", "fire", 110, 20, 15, 40, charmanderMoves);
      pokemons[1] = new PokemonStats("Bulbasaur", "grass", 120, 10, 30, 35, bulbasaurMoves);
      pokemons[2] = new PokemonStats("Squirtle", "water", 150, 15, 5, 30, squirtleMoves);
   }
}