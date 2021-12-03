package projectmaster;

public interface PlayerPartyInterface {
    public static int NUM_MOVES = 4;
    public int getAttackStat();
    public int getDefenseStat();
    public int getHPStat();
    public int getSpeedStat();
    public int takeHit(PlayerPartyInterface party, MoveInterface move);
    public boolean checkDeadStatus();
    public Move selectAttackMove(PlayerInterface trainer);
    public Move getMove(int value);
    public String getName();
    public String movesToString();	
}
