class PokemonStats {
   private final String name;
   private final int hp;
   private final int attack;
   private final int defense;
   private final int spattack;

   public PokemonStats(String name, int hp, int attack, int defense, int spattack) {
      this.name = name;
      this.hp = hp;
      this.attack = attack;
      this.defense = defense;
      this.spattack = spattack;
   }

   public String getName() {
      return name;
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
