class PokemonStats {
   private final String name;
   private final String type;
   private final int hp;
   private final int attack;
   private final int defense;
   private final int spattack;
   Moves moves = new Moves();

   public PokemonStats(String name, String type, int hp, int attack, int defense, int spattack, Moves moves) {
      this.name = name;
      this.type = type;
      this.hp = hp;
      this.attack = attack;
      this.defense = defense;
      this.spattack = spattack;
      moves.fire(type, type, type, type);
   }

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

   public int getSpAttack() {
      return spattack;
   }

}
