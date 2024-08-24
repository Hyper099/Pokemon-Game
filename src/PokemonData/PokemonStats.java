package PokemonData;

import PokemonMoves.FormatOfMoves.Moves;

public class PokemonStats {
   private final String name;
   private final String type;
   private int hp;
   private int attack;
   private int defense;
   private int speed;
   private int level;
   private int totalExp; // total exp from the start, will get added up everytime a pokemon is defeated
   private int nextLvl; // tells the the exp needed to lvl up to next lvl
   private int expGiven; // the exp given to opponent pokemon when they defeat our pokemon and vice versa
   private final Moves moves;

   public PokemonStats(String name, String type, int hp, int attack, int defense, int speed, int level, int totalExp,
         int nextLvl, int expGiven, Moves moves) {
      this.name = name;
      this.type = type;
      this.hp = hp;
      this.attack = attack;
      this.defense = defense;
      this.speed = speed;
      this.moves = moves;
      this.level = level;
      this.totalExp = totalExp;
      this.nextLvl = nextLvl;
      this.expGiven = expGiven;
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

   public int getLevel() {
      return level;
   }

   public int getTotalExp() {
      return totalExp;
   }

   public int getNextLvl() {
      return nextLvl;
   }

   public int getExpGiven() {
      return expGiven;
   }

   public Moves getMoves() {
      return moves;
   }

   // setters
   public void setLevel(int newData) {
      level = newData;
   }

   public void setNextLvl(int newData) {
      nextLvl = newData;
   }

   public void setHp(int newData) {
      hp = newData;

   }

   public void setAttack(int newData) {
      attack = newData;

   }

   public void setDefence(int newData) {
      defense = newData;

   }

   public void setSpeed(int newData) {
      speed = newData;

   }
}
