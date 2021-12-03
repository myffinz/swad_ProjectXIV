package projectmaster;

public class PlayerBattle implements BattleInterface {
    protected PlayerInterface party1;
    protected PlayerInterface party2;
    private int round;
    
    public PlayerBattle(PlayerInterface pc1, PlayerInterface pc2) {
        this.party1 = pc1;
        this.party2 = pc2;
        round = 0;
    }
    
    @Override
    public void battle() throws CheckedNullPointerException {
        if(party1 == null || party2 == null) {
            throw new CheckedNullPointerException("Party cannot be null");
        }
        while(!playOneRound()) {
            
        }
    }
    
    
    protected boolean playOneRound() {
        phase1PrintRoundInfo();
        phase2TakeAction();
        phase3DetermineResult();
        return phase4IsBattleOver();
    }
    
    protected void phase1PrintRoundInfo() {
        round++;
        System.out.println();
        System.out.println();
        System.out.println("======================Round "+round+"======================");
        printRoundInfo(party1);
        printRoundInfo(party2);
    }
    
    protected void printRoundInfo(PlayerInterface t) {
        PlayerPartyInterface c = t.getCurrentPartyMember();
        System.out.println(t.getName()+" has "+t.getNumAlivePlayers()+
                " members and is now a "+c.getName()+" (HP = "+c.getHPStat()+")");
    }
    
    protected void phase2TakeAction() {
        PlayerPartyInterface p1 = party1.getCurrentPartyMember();
        PlayerPartyInterface p2 = party2.getCurrentPartyMember();
        PlayerInterface fasterPC = party2;
        PlayerInterface slowerPC = party1;
        PlayerPartyInterface fasterChar = p2;
        PlayerPartyInterface slowerChar = p1;
        
        //p1 also attacks first if p1's speed == p2's speed
        if(p1.getSpeedStat() >= p2.getSpeedStat()) {
            fasterChar = p1;
            slowerChar = p2;
            fasterPC = party1;
            slowerPC = party2;
        }
        
        attack(fasterPC, fasterChar, slowerPC, slowerChar);
        
        if(!slowerChar.checkDeadStatus()) {
            attack(slowerPC, slowerChar, fasterPC, fasterChar);
        }
    }
    
    private void attack(PlayerInterface attackerTrainer, PlayerPartyInterface attacker, PlayerInterface victimTrainer, PlayerPartyInterface victim) {
        System.out.println("----------- "+attackerTrainer.getName()+"'s "+attacker.getName()+"'s attacking turn -----------");
        Move attackerMove = attacker.selectAttackMove(attackerTrainer);
        int damage = victim.takeHit(attacker, attackerMove);
        System.out.println(attackerTrainer.getName()+"'s "+attacker.getName() + " uses "+attackerMove.name+", dealing "+damage+" HP.");
        if(victim.checkDeadStatus()) {
            System.out.println(victimTrainer.getName()+"'s "+victim.getName()+" has reach 0 HP.");
        } else {
            System.out.println(victimTrainer.getName()+"'s "+victim.getName()+"'s HP: "+victim.getHPStat());
        }
    }
    
    // Set currentPokemon to the new one if the current one is dead
    protected void phase3DetermineResult() {
        determineResult(party1);
        determineResult(party2);
    }
    
    protected void determineResult(PlayerInterface t) {
        if(t.switchPartyMember()) {
            PlayerPartyInterface n = t.getCurrentPartyMember();
            System.out.println(t.getName()+" is switch characters: "+n.getName());
        }
    }
    
    // (1) Determine whether the battle is over
    // (2) Print out the name of the winner
    protected boolean phase4IsBattleOver() {
        System.out.println("<<<<<<< Ending Round "+round+" >>>>>>>");
        if(party1.isDefeated()) {
            printWinner(party2, party1);
            return true;
        }
        if(party2.isDefeated()) {
            printWinner(party1, party2);
            return true;
        }
        System.out.println("Stalemate!!");
        return false;
    }
    
    private void printWinner(PlayerInterface winner, PlayerInterface loser) {
        System.out.println(loser.getName()+" has no party member left.");
        System.out.println("The winner is "+winner.getName()+"!");
    }
    

}