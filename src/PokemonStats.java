import PokemonMoves.Moves;

//CLASS FOR ALL POKEMON STATS

class PokemonStats {
   private final String name;
   private final String type;
   private final int hp;
   private final int attack;
   private final int defense;
   private final int speed;
   private final Moves moves;

   public PokemonStats(String name, String type, int hp, int attack, int defense, int speed, Moves moves) {
      this.name = name;
      this.type = type;
      this.hp = hp;
      this.attack = attack;
      this.defense = defense;
      this.speed = speed;
      this.moves = moves;
   }

   // USE THESE GETTERS TO GET DATA ABOUT A POKEMON FROM A OBJECT MADE FROM THIS
   // CLASS(PokemonStats pokemon)

   public String getName() {
      return name;
   }

   public String getType() {
      return type;
   }

   public int getHP() {
      return hp;
   }

   public int getAttack() {
      return attack;
   }

   public int getDefense() {
      return defense;
   }

   public int getSpeed() {
      return speed;
   }

   public Moves getMoves() {
      return moves;
   }
}