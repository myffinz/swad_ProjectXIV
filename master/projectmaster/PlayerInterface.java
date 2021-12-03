package projectmaster;

public interface PlayerInterface {
    
    public static int NUM_MAX_PLAYERS = 4;    
    public String getName();
    public PlayerPartyInterface getCurrentPartyMember();
    public boolean switchPartyMember();
    public boolean isDefeated();
    public PlayerPartyInterface getPlayerParty(int i);
    public int getNumAlivePlayers();
    public Move selectMove(PlayerPartyInterface p);

}
