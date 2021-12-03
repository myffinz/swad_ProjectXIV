package projectmaster;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
public class MainBattleTest {
    public static void main(String[] args) throws Exception {
        
        PlayerPartyInterface[] A1LP = {Utility.ALL_CLASSES[0]};
        PlayerInterface t1 = new EntityMob("AI_1", A1LP);
        PlayerPartyInterface[] A2LP = {Utility.ALL_CLASSES[1]};
        PlayerInterface t2 = new EntityMob("AI_2", A2LP);
        BattleInterface pb = new PlayerBattle(t1, t2);
        pb.battle();
        
    }
    
}