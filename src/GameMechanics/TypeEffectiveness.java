package GameMechanics;

public class TypeEffectiveness {
    //Still work in progress
    
        String FireWeakness[] = {"Ground", "Rock", "Water"};
        String FireSuperEffective[] = {"Ice", "Bug", "Grass", "Steel"};

        public String[] getFireTypeWeakness(){
            return FireWeakness;
            
        }
        public String[] getFireTypeSuperEffectiveness(){
            return FireSuperEffective;
        }
    
}
