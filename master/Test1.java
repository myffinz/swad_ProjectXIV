/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmaster;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 *
 * Test Pokemon's takeHit method
 */
public class Test1 {
    // public static Scanner createSimulatedScanner() {
    //     String moveIndex = "";
    //     for(int i=0; i<100; i++) {
    //         moveIndex = moveIndex + (i*i)%2 + "\n";
    //     }
    //     ByteArrayInputStream in = new ByteArrayInputStream(moveIndex.getBytes());
    //     System.setIn(in);
    //     Scanner sc = new Scanner(System.in);
    //     return sc;
    // }
    
    // public static void main(String[] args) throws Exception {
        
    //     Scanner sc = createSimulatedScanner();
    //     PlayerPartyInterface[] t1Pokemon = {Utility.ALL_CLASSES[8].clonePokemon(), 
    //         Utility.ALL_CLASSES[8].clonePokemon(), Utility.ALL_CLASSES[3].clonePokemon(), Utility.ALL_CLASSES[2].clonePokemon()};
    //     PlayerInterface t1 = new EntityPlayer("Trainer1", t1Pokemon, sc);
    //     PlayerPartyInterface[] t2Pokemon = {Utility.ALL_CLASSES[7].clonePokemon(), 
    //         Utility.ALL_CLASSES[7].clonePokemon(), Utility.ALL_CLASSES[5].clonePokemon(), Utility.ALL_CLASSES[7].clonePokemon()};
    //     PlayerInterface t2 = new EntityPlayer("Trainer2", t2Pokemon, sc);
    //     BattleInterface pb = new PlayerBattle(t1, t2);
    //     pb.battle();
    // }
    public static void main(String[] args) throws Exception {
        
        PlayerPartyInterface[] t1Pokemon = {Utility.ALL_CLASSES[0]};
        PlayerInterface t1 = new EntityMob("Trainer1", t1Pokemon);
        PlayerPartyInterface[] t2Pokemon = {Utility.ALL_CLASSES[1]};
        PlayerInterface t2 = new EntityMob("Trainer2", t2Pokemon);
        BattleInterface pb = new PlayerBattle(t1, t2);
        pb.battle();
        
    }
    
}